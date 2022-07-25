package com.newt.boot.service.biz.impl;

import com.newt.boot.service.biz.VoucherService;
import com.newt.boot.service.dto.Voucher;
import org.redisson.api.RScript;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;

/**
 * @author Hcg
 * @version 1.0
 * @date 2022/7/19
 */
public class VoucherServiceImpl implements VoucherService {


    @Autowired
    private RedissonClient redisClient;

    @Autowired
    private StringRedisTemplate redisTemplate;

    private static  final DefaultRedisScript<Long> seckill_script;

    static {
        seckill_script=new DefaultRedisScript<>();
        seckill_script.setLocation(new ClassPathResource("seckill.lua"));
        seckill_script.setResultType(Long.class);
    }
    @Override
    public void addSkillVocherInfo(Voucher v) {

    }

    public  void skillVoucher(){
        //执行lua脚本
        RScript script = redisClient.getScript();
        ClassPathResource resource = new ClassPathResource("seckill.lua");
        Long aLong = redisTemplate.execute(seckill_script,
                Collections.emptyList(),
                "1", "2");
        int r = aLong.intValue();
        //是否为零
        if (r!=0){
            //不为零没有资格
            System.out.println("2342："+r);
            return;
        }
        // 为零有资格
        //返回订单id
    }
}
