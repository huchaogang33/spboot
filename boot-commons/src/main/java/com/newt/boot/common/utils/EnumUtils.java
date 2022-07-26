package com.newt.boot.common.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工具类
 *
 * @author
 */
public class EnumUtils {

    private final static Logger logger = LoggerFactory.getLogger(EnumUtils.class);

    /**
     * 枚举转map结合value作为map的key,description作为map的value
     *
     * @param enumT
     * @param methodNames
     * @return enum mapcolloction
     */
    public static <T> Map<Object, String> EnumToMap(Class<T> enumT,
                                                    String... methodNames) throws RuntimeException {
        Map<Object, String> enummap = new HashMap<Object, String>();
        if (!enumT.isEnum()) {
            return enummap;
        }
        T[] enums = enumT.getEnumConstants();
        if (enums == null || enums.length <= 0) {
            return enummap;
        }
        int count = methodNames.length;
        /**默认接口value方法*/
        String valueMathod = "getType";
        /**默认接口typeName方法*/
        String desMathod = "getDesc";
        /**扩展方法*/
        if (count >= 1 && !"".equals(methodNames[0])) {
            valueMathod = methodNames[0];
        }
        if (count == 2 && !"".equals(methodNames[1])) {
            desMathod = methodNames[1];
        }
        for (int i = 0, len = enums.length; i < len; i++) {
            T tobj = enums[i];
            try {
                /**获取value值*/
                Object resultValue = getMethodValue(valueMathod, tobj);
                if ("".equals(resultValue)) {
                    continue;
                }
                /**获取typeName描述值*/
                Object resultDes = getMethodValue(desMathod, tobj);
                /**如果描述不存在获取属性值*/
                if ("".equals(resultDes)) {
                    resultDes = tobj;
                }
                enummap.put(resultValue, resultDes + "");
            } catch (Exception e) {
                logger.error("转换出错", e.getMessage());
                throw new RuntimeException(e.getMessage(), e.getCause());
            }
        }
        return enummap;
    }

    /**
     * 根据反射，通过方法名称获取方法值，忽略大小写的
     *
     * @param methodName
     * @param obj
     * @param args
     * @return return value
     */
    private static <T> Object getMethodValue(String methodName, T obj, Object... args) throws RuntimeException {
        Object resut = "";
        try {
            /********************************* start *****************************************/
            /**获取方法数组，这里只要共有的方法*/
            Method[] methods = obj.getClass().getMethods();
            if (methods.length <= 0) {
                return resut;
            }
            Method method = null;
            for (int i = 0, len = methods.length; i < len; i++) {
                /**忽略大小写取方法*/
                if (methods[i].getName().equalsIgnoreCase(methodName)) {
                    /**如果存在，则取出正确的方法名称*/
                    methodName = methods[i].getName();
                    method = methods[i];
                    break;
                }
            }
            /*************************** end ***********************************************/
            if (method == null) {
                return resut;
            }
            /**方法执行*/
            resut = method.invoke(obj, args);
            if (resut == null) {
                resut = "";
            }
            /**返回结果*/
            return resut;
        } catch (Exception e) {
            logger.error("转换出错", e.getMessage());
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    /**
     * 通过value值获取对应的描述信息
     *
     * @param value
     * @param enumT
     * @param methodNames
     * @return enum description
     */
    public static <T> Object getEnumDescriotionByValue(Object value, Class<T> enumT, String... methodNames) throws RuntimeException {
        /**不是枚举则返回""*/
        if (!enumT.isEnum()) {
            return "";
        }
        /**获取枚举的所有枚举属性，似乎这几句也没啥用，一般既然用枚举，就一定会添加枚举属性*/
        T[] enums = enumT.getEnumConstants();
        if (enums == null || enums.length <= 0) {
            return "";
        }
        int count = methodNames.length;
        /**默认获取枚举value方法，与接口方法一致*/
        String valueMathod = "getValue";
        /**默认获取枚举getTypeName方法*/
        String desMathod = "getTypeName";
        if (count >= 1 && !"".equals(methodNames[0])) {
            valueMathod = methodNames[0];
        }
        if (count == 2 && !"".equals(methodNames[1])) {
            desMathod = methodNames[1];
        }
        for (int i = 0, len = enums.length; i < len; i++) {
            T t = enums[i];
            try {
                /**获取枚举对象value*/
                Object resultValue = getMethodValue(valueMathod, t);
                if (resultValue.toString().equals(value + "")) {
                    /**存在则返回对应描述*/
                    Object resultDes = getMethodValue(desMathod, t);
                    return resultDes;
                }
            } catch (Exception e) {
                logger.error("转换出错", e.getMessage());
                throw new RuntimeException(e.getMessage(), e.getCause());
            }
        }
        return "";
    }

    /**
     * 通过枚举value或者自定义值及方法获取枚举属性值
     *
     * @param value
     * @param enumT
     * @param methodNames
     * @return enum key
     */
    public static <T> String getEnumKeyByValue(Object value, Class<T> enumT, String... methodNames) throws RuntimeException {
        if (!enumT.isEnum()) {
            return "";
        }
        T[] enums = enumT.getEnumConstants();
        if (enums == null || enums.length <= 0) {
            return "";
        }
        int count = methodNames.length;
        /**默认方法*/
        String valueMathod = "getValue";
        /**独立方法*/
        if (count >= 1 && !"".equals(methodNames[0])) {
            valueMathod = methodNames[0];
        }
        for (int i = 0, len = enums.length; i < len; i++) {
            T tobj = enums[i];
            try {
                Object resultValue = getMethodValue(valueMathod, tobj);
                /**存在则返回对应值*/
                if (resultValue != null && resultValue.toString().equals(value + "")) {
                    return tobj + "";
                }
            } catch (Exception e) {
                logger.error("转换出错", e.getMessage());
                throw new RuntimeException(e.getMessage(), e.getCause());
            }
        }
        return "";
    }

    /**
     * 转换成List
     *
     * @param enumT
     * @param methodNames
     * @return List<String>
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static <T> List<String> getEnumToList(Class<T> enumT, String... methodNames) throws RuntimeException {
        Map<Object, String> map = EnumToMap(enumT);
        List<String> result = new ArrayList(map.values());
        return result;
    }


//    /**
//     * 转换成List<LabelValueBean>
//     * @param enumT
//     * @param methodNames
//     * @return List<String>
//     */
//    @SuppressWarnings({ "rawtypes", "unchecked" })
//    public static <T> List<LabelValueBean> getEnumToListBean(Class<T> enumT, String... methodNames)throws RuntimeException{
//        List<LabelValueBean> result = Lists.newArrayList();
//        Map<Object, String> map = EnumToMap(enumT);
//        for (Map.Entry<Object, String> entry : map.entrySet()) {
//            LabelValueBean labelValueBean = new LabelValueBean((String)entry.getKey(),entry.getValue());
//            result.add(labelValueBean);
//        }
//
//        return result;
//    }
}