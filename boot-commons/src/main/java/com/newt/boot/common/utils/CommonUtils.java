package com.newt.boot.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


/**
 * 公共工具类
 */
public class CommonUtils {


    private final static Logger logger = LoggerFactory.getLogger(CommonUtils.class);
    private static char[] numbers = ("0123456789").toCharArray();

    
    /**
     * 组装 mcmp 到 bomp 报文头
     *
     * @param traceNo
     * @param txnNum
     * @param instId
     * @return
     */
 /*   public static Header packageBompHeader(String traceNo, String txnNum, String instId) {
        Header header = new Header();
        header.setVersion(BusinessContainer.BOMP_VERSION);
        header.setTraceNo(traceNo);
        header.setTxnNum(txnNum);
        header.setTransDate(getCurrentDate("yyyyMMdd"));
        header.setTransTime(getCurrentDate("HHmmss"));
        header.setBizType(BusinessContainer.IGAS_DEFAULT_BIZ_TYPE);
        header.setChanlId(BusinessContainer.MCMP_CHANL_ID);
        header.setSrcSysId(BusinessContainer.MCMP_SRC_SYS_ID);
        header.setInstId(instId);
        return header;
    }
*/
    /**
     * 根据日期格式获取对应当前日期
     *
     * @param format 日期格式
     * @return
     */
    public static synchronized String getCurrentDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date());
    }
    
    /* 产生随机数值字符串  */
    public static String randomNumStr(int length) {
        Random numGen = new Random();
        if (length < 1) {
            length = 32;
        }
        char[] randBuffer = new char[length];
        for (int i = 0; i < randBuffer.length; i++) {
            randBuffer[i] = numbers[numGen.nextInt(9)];
        }
        return new String(randBuffer);
    }
    /**
     * 切割数据库url 获取数据库名，带点后缀
     * @param master
     * @return
     */
    public static String splitDbName(String master) {
        String db = "";
        if (StringUtils.isNotBlank(master)){
            String[] split = master.split("/");
            if (split!=null&&split.length>0){
                db = split[split.length - 1].split("\\?")[0] +".";
            }
        }
        return db;
    }

    /**
     * 切割数据库url 获取数据库名，不带点后缀
     * @param master
     * @return
     */
    public static String splitDbNameWithNoPoint(String master) {
        String db = "";
        if (StringUtils.isNotBlank(master)){
            String[] split = master.split("/");
            if (split!=null&&split.length>0){
                db = split[split.length - 1].split("\\?")[0];
            }
        }
        return db;
    }


    // 校验java对象所有属性是否都为空
    public static boolean checkObjAllFieldsIsNull(Object obj) {
        if (null == obj) {
            return true;
        }
        boolean flag = true;
        try {
            Class stuCla = (Class) obj.getClass();// 得到类对象
            Field[] fs = stuCla.getDeclaredFields();//得到属性集合
            flag = true;
            for (Field f : fs) {//遍历属性
                f.setAccessible(true); // 设置属性是可以访问的(私有的也可以)
                Object val = f.get(obj);// 得到此属性的值
                if(val!=null&&StringUtils.isNotBlank(val.toString())) {//只要有1个属性不为空,那么就不是所有的属性值都为空
                    flag = false;
                    break;
                }
            }
        } catch (Exception e) {
           logger.error("校验对象属性是否全部为空异常",e);
        }
        return flag;
    }



}


