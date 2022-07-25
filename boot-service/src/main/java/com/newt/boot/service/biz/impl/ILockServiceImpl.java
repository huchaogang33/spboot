package com.newt.boot.service.biz.impl;

import com.alibaba.fastjson.JSONObject;
import com.newt.boot.dal.entity.TMchntUserInfo;
import com.newt.boot.service.biz.ILock;
import com.newt.boot.service.dto.UserDto;
import com.newt.boot.service.utils.DateUtil;
import org.junit.Test;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Hcg
 * @version 1.0
 * @date 2022/7/15
 */
@Service
public class ILockServiceImpl implements ILock {

    @Autowired
    private RedissonClient redisClient;

    String key="user";
    @Override
    public TMchntUserInfo user() throws InterruptedException {
        //创建锁对象
        RLock lock = redisClient.getLock(key);
        //获取锁
        boolean isLock = lock.tryLock(1L, TimeUnit.SECONDS);
        //是否获取成功
        if (!isLock) {

        }
        try {

        }finally {
            lock.unlock();
        }
        return null;
    }


    @Test
    public void test() throws ExecutionException, InterruptedException {

      /*  long id = Thread.currentThread().getId();
        System.out.println("当前id:"+id);
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        FutureTask futureTask=new FutureTask(new ComputeTask("3werww"));
        Object o = futureTask.get();
        System.out.println("oooo："+o);
        executorService.submit(futureTask);
        System.out.println("futureTask执行完成等待线程执行");

        executorService.shutdown();*/

        List<UserDto> list=new ArrayList<>();
        UserDto userDto=new UserDto();
        userDto.setLogin("1111111111");
        list.add(userDto);
        userDto=new UserDto();
        userDto.setLogin("222222222");
        list.add(userDto);

        userDto=new UserDto();
        userDto.setLogin("33333333333");
        list.add(userDto);
        for (UserDto dto : list) {
            if (dto.getLogin().equals("222222222")){
                list.remove(dto);
            }
        }
        System.out.println(JSONObject.toJSONString(list));
    }

    @Test
    public void ttime(){

        Date date = new Date();
        LocalDateTime midnight = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).plusDays(1).withHour(0).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime currenTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        long between = ChronoUnit.SECONDS.between(currenTime, midnight);
        System.out.println(between);
        System.out.println(midnight);
        System.out.println(currenTime);

        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = format.format(new Date(between));
        System.out.println(format1);
        format=new SimpleDateFormat("HH:mm:ss");
        String format2 = format.format(new Date(between));
        System.out.println(format2);


        LocalDateTime endtime = LocalDateTime.parse("2022-07-22 23:59:59", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTime now = LocalDateTime.now();
        long abs = Math.abs(endtime.until(now, ChronoUnit.SECONDS));
        System.out.println(abs);
        LocalDateTime time = now.plus(between, ChronoUnit.SECONDS);
        System.out.println(time);
    }
    @Test
    public void executor()throws Exception{
        CompletableFuture<Double> ft = CompletableFuture.supplyAsync(() -> {

            System.out.println(Thread.currentThread()+"start"+DateUtil.dateTimeNow());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (false){
                throw  new RuntimeException("test");
            }
            System.out.println(Thread.currentThread()+"exit..time"+DateUtil.dateTimeNow());
            return 1.2;
        });
        System.out.println("main thread start"+Thread.currentThread()+"--"+DateUtil.dateTimeNow());
        System.out.println("run result"+ft.join());
        System.out.println("main thread exit time"+Thread.currentThread()+"--"+ DateUtil.dateTimeNow());

        /*  ExecutorService executors=Executors.newSingleThreadExecutor();
        Future<Double>cf=executors.submit(()->{
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
            if (false){

            }else {
                System.out.println(Thread.currentThread()+"exit,time"+System.currentTimeMillis());

                return 1.2;
            }
        });*/

    }
}
