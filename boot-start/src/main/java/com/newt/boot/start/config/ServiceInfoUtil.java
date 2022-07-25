package com.newt.boot.start.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * @Title:  ServiceInfoUtil.java   
 * @Package com.newland.receipt.mchs.config   
 * @Description:    描述   
 * @author: Qiguowen     
 * @date:   2022年4月7日 下午4:44:36   
 * @Copyright: 
 */
@Component
public class ServiceInfoUtil implements ApplicationListener<WebServerInitializedEvent> {
    private static WebServerInitializedEvent event;

	/**
	* <p>Title: onApplicationEvent</p> 
	* <p>Description: </p> 
	* @param event 
	* @see ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	*/ 
	@Override
	public void onApplicationEvent(WebServerInitializedEvent event) {
		ServiceInfoUtil.event =event;
	}
	
	@SuppressWarnings("deprecation")
	public static int getPort() {
        Assert.notNull(event);
        int port = event.getWebServer().getPort();
        Assert.state(port != -1, "端口号获取失败");
        return port;
    }

}
