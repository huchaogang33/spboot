package com.newt.boot.service.utils;

import org.redisson.api.RAtomicLong;
import org.redisson.api.RBucket;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.StringCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

@Component
public class RedissonLockUtil {

    private static RedissonClient redissonClient;

    @Autowired
    private RedissonClient client;

    /**
     * 加锁
     *
     * @param lockKey
     * @return
     */
    public static RLock lock(String lockKey) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock();
        return lock;
    }

    /**
     * 释放锁
     *
     * @param lockKey
     */
    public static void unlock(String lockKey) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.unlock();
    }

    /**
     * 释放锁
     *
     * @param lock
     */
    public static void unlock(RLock lock) {
        lock.unlock();
    }

    /**
     * 带超时的锁
     *
     * @param lockKey
     * @param timeout 超时时间   单位：秒
     */
    public static RLock lock(String lockKey, int timeout) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock(timeout, TimeUnit.SECONDS);
        return lock;
    }

    /**
     * 带超时的锁
     *
     * @param lockKey
     * @param unit    时间单位
     * @param timeout 超时时间
     */
    public static RLock lock(String lockKey, TimeUnit unit, int timeout) {
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock(timeout, unit);
        return lock;
    }

    /**
     * 尝试获取锁
     *
     * @param lockKey
     * @param waitTime  最多等待时间
     * @param leaseTime 上锁后自动释放锁时间
     * @return
     */
    public static boolean tryLock(String lockKey, int waitTime, int leaseTime) {
        RLock lock = redissonClient.getLock(lockKey);
        try {
            return lock.tryLock(waitTime, leaseTime, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            return false;
        }
    }

    /**
     * 尝试获取锁
     *
     * @param lockKey
     * @param unit      时间单位
     * @param waitTime  最多等待时间
     * @param leaseTime 上锁后自动释放锁时间
     * @return
     */
    public static boolean tryLock(String lockKey, TimeUnit unit, int waitTime, int leaseTime) {
        RLock lock = redissonClient.getLock(lockKey);
        try {
            return lock.tryLock(waitTime, leaseTime, unit);
        } catch (InterruptedException e) {
            return false;
        }
    }

    /**
     * 根据key获取value
     *
     * @param key
     * @return
     */
    public static String getValue(String key) {
        RBucket<String> rBucket = redissonClient.getBucket(key, new StringCodec());
        return rBucket.get();
    }

    public static void setValue(String key, String value) {
        RBucket<String> rBucket = redissonClient.getBucket(key, new StringCodec());
        rBucket.set(value);
    }

    public static void setValue(String key, String value, int timeout) {
        RBucket<String> rBucket = redissonClient.getBucket(key, new StringCodec());
        rBucket.set(value, timeout, TimeUnit.SECONDS);
    }

    public static void delete(String key) {
        RBucket<String> rBucket = redissonClient.getBucket(key, new StringCodec());
        rBucket.delete();
    }
    
    public static Long incr(String key) {
    	 RAtomicLong atomicLong = redissonClient.getAtomicLong(key); 
    	 Long increment = atomicLong.incrementAndGet();
    	 return  increment;
         
    }
    
    
    public static boolean exists(String key) {
        RBucket<String> rBucket = redissonClient.getBucket(key, new StringCodec());
        return rBucket.isExists();
    }
    
    public static void pexpireAt(String key,long expire) {
        RBucket<String> rBucket = redissonClient.getBucket(key, new StringCodec());
        rBucket.expire(expire, TimeUnit.SECONDS);
    }
    
    public static Long getExpire(String key) {
        RBucket<String> rBucket = redissonClient.getBucket(key, new StringCodec());
        return rBucket.remainTimeToLive();
    }
    
    @PostConstruct
    private void init() {
        redissonClient = client;
    }
}
