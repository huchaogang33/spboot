package com.newt.boot.common.utils;


import org.apache.commons.lang.time.DateFormatUtils;

import java.lang.management.ManagementFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类
 *
 * @author 新大陆金融
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {
    public static final String FORMAT_YYYYMM = "yyyyMM";
    public static final String FORMAT_YYYYMMDD = "yyyyMMdd";
    public static final String FORMAT_YYYYMMDD2="YYYYMMDD";
    public static String YYYY = "yyyy";
    public static String YYYY_MM = "yyyy-MM";
    public static String YYYY_MM_DD = "yyyy-MM-dd";
    public static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";//yyyyMMddhhmmss
    public static final String FULL_SEQ_FORMAT = "yyyyMMddHHmmssSSS";
    public static final String DEFAULT_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
    private static Date currentDate;

    public static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    private static String[] parsePatterns = {
            "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

    
    public static String formatTimeNow() {
        return formatTime(currentDate());
    }
    
    public static String formatTime(Date date) {
        return date == null ? null : (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date);
    }
    
    public static Date currentDate() {
        return currentDate == null ? new Date() : currentDate;
    }
    
    
    /**
     * 获取当前Date型日期
     *
     * @return Date() 当前日期
     */
    public static Date getNowDate() {
        return new Date();
    }

    /**
     * 获取当前日期, 默认格式为yyyy-MM-dd
     *
     * @return String
     */
    public static String getDate() {
        return dateTimeNow(YYYY_MM_DD);
    }

    public static final String getTime() {
        return dateTimeNow(YYYY_MM_DD_HH_MM_SS);
    }

    public static final String dateTimeNow() {
        return dateTimeNow(YYYYMMDDHHMMSS);
    }

    public static final String dateTimeNow(final String format) {
        return parseDateToStr(format, new Date());
    }

    public static final String dateTime(final Date date) {
        return parseDateToStr(YYYY_MM_DD, date);
    }

    public static final String parseDateToStr(final String format, final Date date) {
        return new SimpleDateFormat(format).format(date);
    }

    public static final Date dateTime(final String format, final String ts) {
        try {
            return new SimpleDateFormat(format).parse(ts);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 日期路径 即年/月/日 如2018/08/08
     */
    public static final String datePath() {
        Date now = new Date();
        return DateFormatUtils.format(now, "yyyy/MM/dd");
    }

    /**
     * 日期路径 即年/月/日 如20180808
     */
    public static final String dateTime() {
        Date now = new Date();
        return DateFormatUtils.format(now, "yyyyMMdd");
    }

    /**
     * 日期路径 即年/月/日 如20180808
     */
    public static final String getFormatYyyymmdd() {
        Date now = new Date();
        return DateFormatUtils.format(now, FORMAT_YYYYMMDD);
    }

    /**
     * 日期型字符串转化为日期 格式
     */
    public static Date parseDate(Object str) {
        if (str == null) {
            return null;
        }
        try {
            return parseDate(str.toString(), parsePatterns);
        } catch (ParseException e) {
            return null;
        }
    }

    public static Date parseDate(String date, String format) {
        if (date == null) {
            return null;
        } else {
            try {
                return (new SimpleDateFormat(format)).parse(date);
            } catch (ParseException var3) {
                throw new RuntimeException(var3);
            }
        }
    }

    public static String getCurrentDay() {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        return format.format(date);
    }

    public static String getCurrentTime() {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        return format.format(date);
    }

    /**
     * 获取服务器启动时间
     */
    public static Date getServerStartDate() {
        long time = ManagementFactory.getRuntimeMXBean().getStartTime();
        return new Date(time);
    }

    /**
     * 计算两个时间差
     */
    public static String getDatePoor(Date endDate, Date nowDate) {
        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        // long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate.getTime() - nowDate.getTime();
        // 计算差多少天
        long day = diff / nd;
        // 计算差多少小时
        long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒//输出结果
        // long sec = diff % nd % nh % nm / ns;
        return day + "天" + hour + "小时" + min + "分钟";
    }

    /**
     * 获取N日前的日期
     * @param n
     * @param date
     * @return
     */
    public static Date nDaysAgo(Integer n, Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(5, cal.get(5) - n);
        return cal.getTime();
    }

    /**
     * 获取N日后的日期
     * @param n
     * @param date
     * @return
     */
    public static Date nDaysAfter(Integer n, Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(5, cal.get(5) + n);
        return cal.getTime();
    }

    public static String formatDate(Date date, String format) {
        return date == null ? null : (new SimpleDateFormat(format)).format(date);
    }

    public static String getFormatStartDateYYYYMMDDHHMMSS(String date) throws ParseException{
        String startDate = date + " 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startTime = sdf.parse(startDate);
        return parseDateToStr(YYYYMMDDHHMMSS, startTime);
    }

    public static String getFormatEndDateYYYYMMDDHHMMSS(String date) throws ParseException{
        String endDate = date + " 23:59:59";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startTime = sdf.parse(endDate);
        return parseDateToStr(YYYYMMDDHHMMSS, startTime);
    }

    /**
     * 获取当前系统日期（yyyyMMdd）
     *
     * @return String
     */
    public static String getCurrentDateStr() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String datetime = sdf.format(date);
        return datetime;
    }

    /**
     * 比较两个字符串日期的大小 日期格式 yyyyMMdd
     *
     * @param yyyyMMddBaseDate 基准日期  yyyyMMdd
     * @param yyyyMMddCompDate 比较日期  yyyyMMdd
     * @return 0-相等，小于0-基准日期小到比较日期，大于0-基准日期大于比较日期
     */
    public static int compareDate(String yyyyMMddBaseDate, String yyyyMMddCompDate) {
        return Integer.parseInt(yyyyMMddBaseDate) -  Integer.parseInt(yyyyMMddCompDate);
    }

}
