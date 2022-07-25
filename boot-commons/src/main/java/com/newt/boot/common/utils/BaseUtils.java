package com.newt.boot.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.util.ClassUtils;
import org.springframework.util.ObjectUtils;

import java.beans.PropertyDescriptor;
import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.*;


/**
 * 简述：工具类的基础类<br>
 * 详细描述：<br>
 * 1.判空处理 <br>
 */
public class BaseUtils {

    private static final Logger log = LoggerFactory.getLogger(BaseUtils.class);

    /**
     * null2string<br>
     * 1.把指针NULL 转换成""字符串<br>
     * 2.把字符串 null 转换成""<br>
     * 校验str字符串是否是空、null(字符串)、nullnull等，<br>
     * 如果是直接返回"" <br>
     * 如果不是返回原字符串<br>
     * @param str
     * @return String
     */
    public static String ifNull(String str) {
        if (str == null || str.trim().length() <= 0 || str.trim().toLowerCase().equals("null")
            || str.trim().toLowerCase().equals("nullnull") || str.trim().toLowerCase().equals("nullnullnull")
            || str.trim().toLowerCase().equals("nullnullnullnull")) {
            return "";
        }
        return str;
    }

    /**
     * 功能类似于mysql ifnull 函数;当val为null时返回defVal;
     * 该方法返回值类型 是defVal的类型
     * @param val
     * @param defVal
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T ifNull(Object val, T defVal) {
        if (ObjectUtils.isEmpty(val)) {
            return defVal;
        }
        if (!(defVal instanceof String || defVal instanceof Long || defVal instanceof Integer || defVal instanceof BigDecimal || defVal instanceof Short || defVal instanceof Double || defVal instanceof Float)) {
            throw new RuntimeException("错误的输入类型");
        }
        if (defVal instanceof BigDecimal) {
            return (T) new BigDecimal(val.toString());
        }
        return (T) val;
    }

   /* @SuppressWarnings("unchecked")
    public static <T extends Object> T ifNullClassCase(Object val, T defVal) {
        if (ObjectUtils.isEmpty(val)) {
            return defVal;
        }
        Class<T> clz = (Class<T>) defVal.getClass();
        T newValue = StringCastType(val.toString(), clz);
        return newValue;
    }*/

    /**
     * 
     * @param l
     * @return
     */
    public static Long ifNull(Long l) {
        if (l == null)
            return 0L;
        return l;
    }

    /**
     * 过滤null
     * @param obj 
     * @return 
     * ifnull(null) == "";
     */
    public static String ifNull(Object obj) {
        if (obj == null)
            return "";
        return obj.toString();
    }

    /**
     * 过滤null
     * @param obj
     * @return
     */
    @Deprecated
    public static String null2string(Object obj) {
        if (obj == null)
            return "";
        return obj.toString();
    }

    /**
     * @description 若输入null返回0
     * @param val
     * @return
     */
    public static BigDecimal ifNull(BigDecimal val) {
        if (val == null) {
            return BigDecimal.ZERO;
        }
        return val;
    }

    /**
     * @description 若输入null返回0,或科学计数法返回0
     * @param val
     * @return
     */
    public static BigDecimal ifNullOrZero(BigDecimal val) {
        if (val == null) {
            return BigDecimal.ZERO;
        }
        if (val.compareTo(BigDecimal.ZERO) == 0) {
            return BigDecimal.ZERO;
        }
        return val;
    }

    /**
     * @description 若时间为空,则返回当前时间
     * @param val
     * @return
     */
    public static Date ifNull(Date val) {
        if (val == null) {
            return new Date();
        }
        return val;
    }

    /**
     * 判断字符串是否为空<br>
     * 
     * @param str
     * @return 如果为null或者为"" 则返回true
     */
    public static boolean isNull(String str) {
        if (ifNull(str).length() <= 0) {
            return true;
        }
        return false;
    }

    /**
     * 判断对象是否为空
     * @param o
     * @return boolean
     */
    public static boolean isNull(Object o) {
        if (o == null)
            return true;
        if (o instanceof String) {
            if (ifNull(String.valueOf(o)).length() <= 0) {
                return true;
            }
        } else if (o.getClass().isArray()) {
            Object[] os = (Object[]) o;
            if (os.length == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断字符串是否不为空
     * 
     * @param str
     * @return 如果字符串 不为null 并且不为 "" 返回true 否则返回false
     */
    public static boolean isNotNull(String str) {
        if (ifNull(str).length() <= 0) {
            return false;
        }
        return true;
    }

    /**
     * 判断对象是否不为空
     * 
     * @param o
     * @return 如果为不为null 返回true 否则返回false
     */
    public static boolean isNotNull(Object o) {
        if (o == null)
            return false;
        if (o instanceof String) {
            if (ifNull(String.valueOf(o)).length() <= 0) {
                return false;
            }
        }
        return true;
    }

    //==================2.字符串转换成数字或============================================
    /**
     * 判断是否是数字
     * @param num
     * @return
     */
    public static boolean isNumber(String num) {
        if (isNull(num))
            return false;
        final String number = "0123456789";
        for (int i = 0; i < number.length(); i++) {
            if (number.indexOf(num.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断是否是小数
     * @param num
     * @return
     */
    public static boolean isDecimal(String num) {
        if (isNull(num))
            return false;
        final String number = "0123456789.";
        for (int i = 0; i < number.length(); i++) {
            if (number.indexOf(num.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    /**
     * 字符串转换成int <br>
     * 如果str为空、不是字符串 则返回0<br>
     * @param str
     * @return
     */
    public static int string2int(String str) {
        return string2int(str, 0);
    }

    /**
     * 字符串转换成int <br>
     * 
     * @param str 对应字符串
     * @param defaultValue 如果字符串为空或者出错 默认返回的值
     * @return str=null 则返回 defaultValue；  str不是整数，则返回  defaultValue
     */
    public static int string2int(String str, int defaultValue) {
        if (isNotNull(str)) {
            try {
                return Integer.valueOf(str).intValue();
            } catch (Exception ex) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    /**
     * 字符串转换成long <br>
     * 如果str为空、不是字符串 则返回0<br>
     * @param str
     * @return
     */
    public static long string2long(String str) {
        return string2long(str, 0);
    }

    /**
     * 字符串转换成long <br>
     * 
     * @param str 对应字符串
     * @param defaultValue 如果字符串为空或者出错 默认返回的值
     * @return str=null 则返回 defaultValue；  str不是整数，则返回  defaultValue
     */
    public static long string2long(String str, long defaultValue) {
        if (isNotNull(str)) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Exception ex) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    /**
     * 字符串转换成double <br>
     * 如果str为空、不是字符串 则返回0.0<br>
     * @param str
     * @return
     */
    public static double string2double(String str) {
        return string2double(str, 0.0);
    }

    /**
     * 字符串转换成double <br>
     * 这里没有对double精度进行处理，要想保留精度，必须再调用另外一个方法： doubleFormat<br>
     * @param str 对应字符串
     * @param defaultValue 如果字符串为空或者出错 默认返回的值
     * @return str=null 则返回 defaultValue；  str不是整数，则返回  defaultValue
     */
    public static double string2double(String str, double defaultValue) {
        if (isNotNull(str)) {
            try {
                return Double.valueOf(str).doubleValue();
            } catch (Exception ex) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    /**
     * 格式化double 保留对应的位数<br>
     * 是按照四舍五入的方法保留小数位数的<br>
     * @param d 待处理double
     * @param decimal 保留的小数位数
     * @return
     */
    public static double doubleFormat(double d, int decimal) {
        BigDecimal b = new BigDecimal(d);
        //==1.ROUND_DOWN  直接把多余的位数删除
        //==2.ROUND_UP 进位处理
        //==3.ROUND_HALF_DOWN 四舍五入 1.5 会转换为1.0
        //==4.ROUND_HALF_UP 四舍五入 1.5会转换为2.0
        return b.setScale(decimal, BigDecimal.ROUND_HALF_UP).doubleValue(); //四舍五入 
    }

    /**
     * 字符串转换成BigDecimal <br>
     * 如果str为空、不是字符串 则返回0.0<br>
     * @param str
     * @return
     */
    public static BigDecimal string2bigDecimal(String str) {
        return string2bigDecimal(str, 0.0);
    }

    /**
     * 把object转为bigdecimal
     * @param val null返回 0
     * @return
     */
    public static BigDecimal Obj2BigDecimal(Object val) {
        String str = "0";
        if (val != null) {
            str = String.valueOf(val);
        }
        return string2bigDecimal(str);
    }

    /**
     * 字符串转换成BigDecimal <br>
     * @param str 对应字符串
     * @param defaultValue 如果字符串为空或者出错 默认返回的值
     * @return str=null 则返回 defaultValue；  str不是整数，则返回  defaultValue
     */
    public static BigDecimal string2bigDecimal(String str, double defaultValue) {
        if (isNotNull(str)) {
            try {
                return new BigDecimal(str);
            } catch (Exception ex) {
                return new BigDecimal(defaultValue);
            }
        }
        return new BigDecimal(defaultValue);
    }

    /**
     * 对字符串进行trim
     * 
     * @param str
     * @return String
     */
    public static String stringTrim(String str) {
        return ifNull(str).trim();
    }

    /**
     * 比较两个字符串是否相同 
     * 主要是防止为空 
     * @param s1
     * @param s2
     * @return
     */
    public static boolean compare(String s1, String s2) {
        s1 = ifNull(s1);
        s2 = ifNull(s2);
        return s1.equals(s2);
    }

    //================================map转换成字符串=======================================
    /**
     * map转换成字符串 使用 gap隔开<br>
     * 假设gap为分号 则 转换后的格式：k1=v1;k2=v2; 
     * @param map
     * @param gap
     * @return String
     * @throws Exception
     */
    public static String map2string(Map<String, String> map, String gap) throws Exception {
        if (isNull(map))
            return "";
        gap = ifNull(gap);
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, String> m : map.entrySet()) {
            try {
                sb.append(m.getKey()).append("=").append(ifNull(m.getValue())).append(gap);
            } catch (Exception ex) {
                //
            }
        }
        return sb.toString();
    }

    /**
     * 把对象转换成字符串
     * 
     * @param <T>
     * @param t
     * @return String
     * @throws Exception
     */
    /*public static <T> String obj2string(T t) throws Exception {
        StringBuffer sb = new StringBuffer();
        try {
            if (t == null)
                return sb.toString();
            Method[] ms = t.getClass().getMethods();
            Object value;
            String fieldName;
            for (Method m : ms) {
                fieldName = m.getName();
                if (fieldName.indexOf("get") >= 0) {
                    fieldName = fieldName.substring(fieldName.indexOf("get") + 3, fieldName.length());
                    value = m.invoke(t);
                    if (value instanceof Date) {
                        value = DateUtils.date2string(((Date) value), "yyyy-MM-dd HH:mm:ss");// 转换成date
                    } else if (value instanceof Timestamp) {
                        value = DateUtils.date2string(new Date(((Timestamp) value).getTime()), "yyyy-MM-dd HH:mm:ss");// 转换成date
                    }
                    sb.append(fieldName).append("=").append(value).append(";");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }*/

    /**
     * bean拷贝 
     * null有效，即null值也会覆盖
     * 以t为标准，解析t的所有属性，从s中取对应的属性值进行拷贝
     * @param s 原bean
     * @param t 目标bean
     * @param pros 需要拷贝的属性  如果不输入  则会检索t的所有属性，从s拷贝对应属性
     */
    public static void copyBeanNullValid(Object s, Object t, String... pros) {
        copyBean(s, t, true, pros);
    }

    /**
     * bean拷贝
     * null无效  即如果s的属性值为null 则不会覆盖t的属性值
     * 以t为标准，解析t的所有属性，从s中取对应的属性值进行拷贝
     * @param s 原bean
     * @param t 目标bean
     * @param pros 需要拷贝的属性  如果不输入  则会检索t的所有属性，从s拷贝对应属性
     */
    public static void copyBeanNullInvalid(Object source, Object target, String... pros) {
        copyBean(source, target, false, pros);
    }

    /**
     * bean拷贝
     * 如果s中的属性为空 则不进行覆盖
     * 以t为标准，解析t的所有属性，从s中取对应的属性值进行拷贝
     * @param s 原bean
     * @param t 目标bean
     * @param nullValid null有效 传入 true  null无效传入 false
     * @param pros 需要拷贝的属性  如果不输入  则会检索t的所有属性，从s拷贝对应属性
     */
    private static void copyBean(Object s, Object t, boolean nullValid, String... pros) {
        if (s == null)
            return;
        if (t == null)
            return;
        Class<?> actualEditable = t.getClass();
        PropertyDescriptor[] targetPds = BeanUtils.getPropertyDescriptors(actualEditable);
        List<String> proList = (pros != null ? Arrays.asList(pros) : null);
        Method writeMethod = null, readMethod = null;
        PropertyDescriptor sourcePd = null;
        for (PropertyDescriptor targetPd : targetPds) {
            if (targetPd == null)
                continue;
            if (proList != null && proList.size() > 0 && !proList.contains(targetPd.getName()))
                continue;//如果传入了需要复制的属性 并且当前属性不在列表内 则不需要复制
            sourcePd = BeanUtils.getPropertyDescriptor(s.getClass(), targetPd.getName());
            if (sourcePd == null)
                continue;
            readMethod = sourcePd.getReadMethod();
            if (readMethod == null)
                continue;
            writeMethod = targetPd.getWriteMethod();
            if (writeMethod == null)
                continue;
            if (!ClassUtils.isAssignable(writeMethod.getParameterTypes()[0], readMethod.getReturnType()))
                continue;
            try {
                if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
                    readMethod.setAccessible(true);
                }
                Object value = readMethod.invoke(s);
                if (!nullValid) { //null 无效 则不覆盖
                    if (value == null || value.toString().length() <= 0)
                        continue;//这里防止把空覆盖
                }
                if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
                    writeMethod.setAccessible(true);
                }
                writeMethod.invoke(t, value);
            } catch (Throwable ex) {
                log.error("==copybean==s[{}]==t{}==p[{}]==e[{}]==", s.getClass().getName(), t.getClass().getName(), targetPd.getName(), ex.getMessage());
            }
        }
    }

    /**
     * 对象进行序列化
     * @param value
     * @return
     */
    public static byte[] serialize(Object value) {
        byte[] rv = null;
        if (value == null)
            return rv;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream os = null;
        try {
            bos = new ByteArrayOutputStream();
            os = new ObjectOutputStream(bos);
            os.writeObject(value);
            rv = bos.toByteArray();
            os.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null)
                    os.close();
                if (bos != null)
                    bos.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return rv;
    }

    /**
     * 反序列化
     * @param in
     * @return
     */
    public static Object deserialize(byte[] in) {
        Object rv = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream is = null;
        try {
            if (in == null)
                return rv;
            bis = new ByteArrayInputStream(in);
            is = new ObjectInputStream(bis);
            rv = is.readObject();
            is.close();
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
                if (bis != null)
                    bis.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return rv;
    }

    /**
     * 获取id
     * 
     * @return String
     * @throws Exception
     */
    public static String getUUID() {
        String id = UUID.randomUUID().toString().replace("-", "");
        //				+System.currentTimeMillis();

        return id;
    }

    /**
     * 把String类型的值转换为期望的类型
     * @param val
     * @param clz
     * @return
     */
    /*@SuppressWarnings("unchecked")
    public static <T> T StringCastType(String val, Class<T> clz) {
        if (val == null) {
            return null;
        }
        String classType = clz.getSimpleName();
        Object result = null;
        switch (classType) {
            case "String":
                result = val;
                break;
            case "Long":
                result = Long.valueOf(val);
                break;
            case "Integer":
                result = Integer.valueOf(val);
                break;
            case "Short":
                result = Short.valueOf(val);
                break;
            case "Double":
                result = Double.valueOf(val);
                break;
            case "Float":
                result = Float.valueOf(val);
                break;
            case "Date":
                String formatStyle = DateUtils.FORMAT_STYLE_2;
                if (val.length() <= 10) {
                    formatStyle = DateUtils.FORMAT_STYLE_1;
                }
                result = DateUtils.string2date(val, formatStyle);
                break;
            case "BigDecimal":
                result = new BigDecimal(val);
                break;
            case "Boolean":
                result = Boolean.valueOf(val);
                break;

            default:
                throw new RuntimeException("不支持的转换类型:" + classType);
        }
        return (T) result;
    }*/
    
    /*public static <T> T StringCastType(String val,String format) {
        if (val == null) {
            return null;
        }
        Object result = null;
        switch (format) {
            case "String":
                result = val;
                break;
            case "Long":
                result = Long.valueOf(val);
                break;
            case "Integer":
                result = Integer.valueOf(val);
                break;
            case "Short":
                result = Short.valueOf(val);
                break;
            case "Double":
                result = Double.valueOf(val);
                break;
            case "Float":
                result = Float.valueOf(val);
                break;
            case "Date":
                String formatStyle = DateUtils.FORMAT_STYLE_2;
                if (val.length() <= 10) {
                    formatStyle = DateUtils.FORMAT_STYLE_1;
                }
                result = DateUtils.string2date(val, formatStyle);
                break;
            case "BigDecimal":
                result = new BigDecimal(val);
                break;
            case "Boolean":
                result = Boolean.valueOf(val);
                break;

            default:
                throw new RuntimeException("不支持的转换类型:" + format);
        }
        return (T) result;
    }*/

    /**
     * 把minor中的键值对合并到major中,如果key相同,如果major中值为null,那么取minor中的值,否则,采用原值
     * @param major 接收其他map键值对的map
     * @param jsonStr 被合并的map的json格式
     */
    /*public static void mapMergeIgnoreNull(Map<String, Object> major, String jsonStr) {
        Map<String, Object> minor = JsonUtils.toObject(jsonStr);
        if (MapUtils.isEmpty(minor)) {
            return;
        }
        mapMergeIgnoreNull(major, minor);
    }*/

    /**
     * 把minor中的键值对合并到major中,如果key相同,如果major中值为null,那么取minor中的值,否则,采用原值
     * @param major 接收其他map键值对的map
     * @param minor 被合并的map
     */
    public static void mapMergeIgnoreNull(Map<String, Object> major, Map<String, Object> minor) {
        for (Map.Entry<String, Object> entry : minor.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            }
            major.merge(entry.getKey(), entry.getValue(), (v1, v2) -> {
                if (v1 == null) {
                    return v2;
                }
                return v1;
            });
        }
    }
    
    /**
     * 过滤null
     * @param obj 
     * @return 
     * ifnull(null) == "";
     */
    public static String ifConvertNull(Object obj) {
        if (obj == null)
            return "";
        return obj.toString();
    }

    /**
     * 抓取文件数据
     * @param params
     * @param file
     * @return
     */
    /*public static byte[] fetchFileData(Map<String, Object> params, MultipartFile file) {
        byte[] fileBytes = null;
        String fileBase64 = (String) params.get("file");
        try {
            if (org.apache.commons.lang3.StringUtils.isNotEmpty(fileBase64)) {
                fileBytes = Base64Utils.decode(fileBase64);
            } else {
                fileBytes = file.getBytes();
            }
        } catch (Exception e) {
            LoggerUtil.error(e, log, "fetch file data exception,request params is {0} ", JsonUtils.toJson(params));
        }
        return fileBytes;
    }*/

    /**
     * 判断是否为基础数据类型
     * @param clz
     * @return
     */
    public static boolean isWrapClass(Class<?> clz) {
        try {
            return ((Class<?>) clz.getField("TYPE").get(null)).isPrimitive();
        } catch (Exception e) {
            return false;
        }
    }
}
