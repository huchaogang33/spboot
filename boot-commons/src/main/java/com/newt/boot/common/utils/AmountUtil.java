package com.newt.boot.common.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 金额操作工具灯
 *
 */
public class AmountUtil {
    /**
     * 加法运算
     * @param amt1 金额字符串1
     * @param amt2 金额字符串2
     * @return 金额字符串1 + 金额字符串2
     */
    public static String addition(String amt1, String amt2){
        BigDecimal bigDecimal1;
        BigDecimal bigDecimal2;
        if (null == amt1 || 0 == amt1.trim().length()){
            bigDecimal1 = new BigDecimal(0);
        }else {
            bigDecimal1 = new BigDecimal(amt1);
        }

        if (null == amt2 || 0 == amt2.trim().length()){
            bigDecimal2 = new BigDecimal(0);
        }else {
            bigDecimal2 = new BigDecimal(amt2);
        }
        return bigDecimal1.add(bigDecimal2).toString();
    }

    /**
     * 减法运算
     * @param amt1 金额字符串1
     * @param amt2 金额字符串2
     * @return 金额字符串1 - 金额字符串2
     */
    public static String subtraction(String amt1, String amt2){
        BigDecimal bigDecimal1;
        BigDecimal bigDecimal2;
        if (null == amt1 || 0 == amt1.trim().length()){
            bigDecimal1 = new BigDecimal(0);
        }else {
            bigDecimal1 = new BigDecimal(amt1);
        }

        if (null == amt2 || 0 == amt2.trim().length()){
            bigDecimal2 = new BigDecimal(0);
        }else {
            bigDecimal2 = new BigDecimal(amt2);
        }
        return bigDecimal1.subtract(bigDecimal2).toString();
    }

    /**
     * 乘法运算
     * @param amt1 金额字符串1
     * @param amt2 金额字符串2
     * @return 金额字符串1 * 金额字符串2
     */
    public static String multiplication(String amt1, String amt2){
        BigDecimal bigDecimal1;
        BigDecimal bigDecimal2;
        if (null == amt1 || 0 == amt1.trim().length()){
            bigDecimal1 = new BigDecimal(0);
        }else {
            bigDecimal1 = new BigDecimal(amt1);
        }

        if (null == amt2 || 0 == amt2.trim().length()){
            bigDecimal2 = new BigDecimal(0);
        }else {
            bigDecimal2 = new BigDecimal(amt2);
        }
        return bigDecimal1.multiply(bigDecimal2).toString();
    }

    /**
     * 乘法运算
     * @param amt1 金额字符串1
     * @param amt2 金额字符串2
     * @param scale 小数点精度
     * @return 金额字符串1 * 金额字符串2
     */
    public static String multiplication(String amt1, String amt2, int scale){
        BigDecimal bigDecimal1;
        BigDecimal bigDecimal2;
        if (null == amt1 || 0 == amt1.trim().length()){
            bigDecimal1 = new BigDecimal(0);
        }else {
            bigDecimal1 = new BigDecimal(amt1);
        }

        if (null == amt2 || 0 == amt2.trim().length()){
            bigDecimal2 = new BigDecimal(0);
        }else {
            bigDecimal2 = new BigDecimal(amt2);
        }
        return bigDecimal1.multiply(bigDecimal2).setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
    }

    /**
     * 除法运算
     * @param amt1 金额字符串1
     * @param amt2 金额字符串2
     * @return 金额字符串1 / 金额字符串2
     */
    public static String division(String amt1, String amt2){
        BigDecimal bigDecimal1;
        BigDecimal bigDecimal2;
        if (null == amt1 || 0 == amt1.trim().length()){
            bigDecimal1 = new BigDecimal(0);
        }else {
            bigDecimal1 = new BigDecimal(amt1);
        }

        if (null == amt2 || 0 == amt2.trim().length()){
            bigDecimal2 = new BigDecimal(0);
        }else {
            bigDecimal2 = new BigDecimal(amt2);
        }

        if(0 == bigDecimal2.compareTo(BigDecimal.ZERO)){
            return "0";
        }else{
            return bigDecimal1.divide(bigDecimal2,2, RoundingMode.HALF_UP).toString();
        }
    }

    /**
     * 除法运算
     * @param amt1 金额字符串1
     * @param amt2 金额字符串2
     * @param scale 小数点精度
     * @return 金额字符串1 / 金额字符串2
     */
    public static String division(String amt1, String amt2, int scale){
        BigDecimal bigDecimal1;
        BigDecimal bigDecimal2;
        if (null == amt1 || 0 == amt1.trim().length()){
            bigDecimal1 = new BigDecimal(0);
        }else {
            bigDecimal1 = new BigDecimal(amt1);
        }

        if (null == amt2 || 0 == amt2.trim().length()){
            bigDecimal2 = new BigDecimal(0);
        }else {
            bigDecimal2 = new BigDecimal(amt2);
        }

        if(0 == bigDecimal2.compareTo(BigDecimal.ZERO)){
            return "0";
        }else{
            return bigDecimal1.divide(bigDecimal2,scale, RoundingMode.HALF_UP).toString();
        }
    }


    /**
     * 除法运算  进位运算 特殊
     * @param amt1 金额字符串1
     * @param amt2 金额字符串2
     * @param scale 小数点精度
     * @return 金额字符串1 / 金额字符串2
     */
    public static String divisionScalAndRoundingMode(String amt1, String amt2, int scale){
        BigDecimal bigDecimal1;
        BigDecimal bigDecimal2;
        if (null == amt1 || 0 == amt1.trim().length()){
            bigDecimal1 = new BigDecimal(0);
        }else {
            bigDecimal1 = new BigDecimal(amt1);
        }

        if (null == amt2 || 0 == amt2.trim().length()){
            bigDecimal2 = new BigDecimal(0);
        }else {
            bigDecimal2 = new BigDecimal(amt2);
        }

        if(0 == bigDecimal2.compareTo(BigDecimal.ZERO)){
            return "0";
        }else{
            return bigDecimal1.divide(bigDecimal2,scale, BigDecimal.ROUND_UP).toString();
        }
    }

    /**
     * 四舍五入处理
     * @param amt1 需要四舍五入的金额
     * @param scale 小数点精度
     * @return 四舍五入结果
     */
    public static String rounding(String amt1, int scale){
        BigDecimal bigDecimal1;
        if (null == amt1 || 0 == amt1.trim().length()){
            bigDecimal1 = new BigDecimal(0);
        }else {
            bigDecimal1 = new BigDecimal(amt1);
        }
        BigDecimal one = new BigDecimal("1");
        return bigDecimal1.divide(one, scale, BigDecimal.ROUND_HALF_UP).toString();
    }

    /**
     * 比较金额大小
     * @param amt1 金额字符串1
     * @param amt2 金额字符串2
     * @return amt1>amt2 返回1，amt1=amt2 返回0，amt1<amt2 返回-1
     */
    public static int compare(String amt1, String amt2){
        BigDecimal bigDecimal1;
        BigDecimal bigDecimal2;
        if (null == amt1 || 0 == amt1.trim().length()){
            bigDecimal1 = new BigDecimal(0);
        }else {
            bigDecimal1 = new BigDecimal(amt1);
        }

        if (null == amt2 || 0 == amt2.trim().length()){
            bigDecimal2 = new BigDecimal(0);
        }else {
            bigDecimal2 = new BigDecimal(amt2);
        }
        return bigDecimal1.compareTo(bigDecimal2);
    }

    /**
     * 元转分
     * @param amount 以元为单位的金额
     * @return 以分为单位的金额
     */
    public static String changeY2F(String amount){
        BigDecimal bigDecimal;
        if (null == amount || 0 == amount.trim().length()){
            bigDecimal = new BigDecimal(0);
        }else {
            bigDecimal = new BigDecimal(amount);
        }
        bigDecimal = bigDecimal.multiply(new BigDecimal(100));
        return bigDecimal.toBigInteger().toString();
    }

    /**
     * 分转元
     * @param amount 以分为单位的金额
     * @return 以元为单位的金额
     */
    public static String changeF2Y(String amount){
        BigDecimal bigDecimal;
        if (null == amount || 0 == amount.trim().length()){
            bigDecimal = new BigDecimal(0);
        }else {
            bigDecimal = new BigDecimal(amount);
        }
        bigDecimal = bigDecimal.divide(new BigDecimal(100), 2, BigDecimal.ROUND_DOWN);
        return bigDecimal.toString();
    }


}
