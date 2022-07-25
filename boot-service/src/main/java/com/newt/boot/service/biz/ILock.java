package com.newt.boot.service.biz;

import com.newt.boot.dal.entity.TMchntUserInfo;

/**
 * @author Hcg
 * @version 1.0
 * @date 2022/7/15
 */
public interface ILock {

    TMchntUserInfo user() throws InterruptedException;
}
