package com.newt.boot.common.utils;

import com.newt.boot.common.exception.BaseException;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.StringWriter;
import java.util.Properties;

/**
 * 模板工具类
 */
public class VelocityMergeUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(VelocityMergeUtil.class);

 

    public static String mergeParams(String templatePath, VelocityContext ctx) throws BaseException {
        if (StringUtils.isEmpty(templatePath)) {
            throw new BaseException("文件模板找不到,templatePath=" + templatePath);
        }
        if (ctx == null) {
            ctx = new VelocityContext();
        }
        // 初始化环境变量
        Properties properties = new Properties();
		//从类路径加载模板文件 设置velocity资源加载方式为class 
		properties.setProperty("resource.loader", "class");  
		//设置velocity资源加载方式为class时的处理类
		properties.setProperty("class.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		properties.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8");
		properties.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
		properties.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
		properties.setProperty(Velocity.RUNTIME_LOG_LOGSYSTEM_CLASS, "org.apache.velocity.runtime.log.NullLogChute");

        VelocityEngine ve = new VelocityEngine(properties);
        StringWriter writer = new StringWriter();
        ve.mergeTemplate(templatePath, "UTF-8", ctx, writer);
        return writer.toString();
    }

    public static Logger getLogger() {
        return LOGGER;
    }

}
