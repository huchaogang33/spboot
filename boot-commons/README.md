1.分布式锁就是 利用redis setnx 机制 存在则成功 否则失败

2.redission 可重入锁
3.可重入原理->{ 列：method1 调用method2  1获取锁，2也获取锁
3.1: 利用 哈希结构 原理   
key           value
          field    value
锁key     线程标识   重入次数
lock      thread1   1       当前线程 如果method2 获取锁 value 2 method2 最好重新设置超时时间

释放锁： 锁计数-1 判断计数是否为0 是释放锁 否重置锁有效期 执行业务  lua脚本。
exists->hset->expire
hexists-> hincrby->expire

}

4.redis 分布式锁 setnx 存在问题：  redission解决
4.1.1: 不可重入，同一个线程无法多次获取同一把锁  -> 利用 hash结构记录线程id和重入次数
4.1.2： 不可重试，获取锁只能尝试一次就返回false,没有重试机制   -> 利用信号量和PubSub功能实现等待 唤醒 获取锁失败重试机制
4.1.3：超时释放，锁超时释放虽然可以避免死锁，但如果业务执行耗时较长，也会导致锁释放，存在安全隐患  ->利用watchDog 每隔一段时间 重置超时时间
4.1.4：主从一致问题，如果redis提供主从集群，主从同步存在延迟，当主机宕机时，如果从同步主中的锁数据，则会出现锁失效消失。  