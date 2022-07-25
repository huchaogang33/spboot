package com.newt.boot.web.util;

import java.lang.annotation.*;

/**  
 * @Title:  Limit.java   
 * @Package com.newland.receipt.mchs.web.util   
 * @Description:    描述   
 * @author: Qiguowen     
 * @date:   2022年4月12日 下午8:41:23   
 * @Copyright: 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface Limit {
	/**
     * 得不到令牌的提示语
     */
    String msg() default "当前服务使用人数较多，系统繁忙，请稍后刷新重试！";
	
}
