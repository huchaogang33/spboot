package com.newt.boot.service.utils;
import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @Title: DesensitizedUtils
 */
public class DesensitizedUtils {

	/**
	 * 
	 * 【中文姓名】只显示第一个汉字，其他隐藏为2个星号，比如：李*
	 * 
	 * @param fullName
	 * @return
	 */
	public static String chineseName(String fullName) {
		if (StringUtils.isBlank(fullName)) {

			return "";
		}
		String name = StringUtils.left(fullName, 1);
		return StringUtils.rightPad(name, StringUtils.length(fullName), "*");
	}

	/**
	 * 
	 * 【身份证号】显示最后四位，其他隐藏。共计18位或者15位，比如：*1234
	 *
	 * @param id
	 * @return
	 */
	public static String idCardNum(String id) {
		if (StringUtils.isBlank(id)) {

			return "";
		}
		String num = StringUtils.right(id, 4);
		return StringUtils.leftPad(num, StringUtils.length(id), "*");
	}

	/**
	 * 
	 * 【固定电话 后四位，其他隐藏，比如1234
	 *
	 * @param num
	 * @return
	 */
	public static String fixedPhone(String num) {
		if (StringUtils.isBlank(num)) {

			return "";
		}
		return StringUtils.leftPad(StringUtils.right(num, 4), StringUtils.length(num), "*");
	}

	/**
	 * 
	 * 【手机号码】前三位，后四位，其他隐藏，比如135****2210
	 *
	 * @param num
	 * @return
	 */
	public static String mobilePhone(String num) {
		if (StringUtils.isBlank(num)) {

			return "";
		}
		if (num.length()<=7){
			return num;
		}
//		return StringUtils.left(num, 3).concat(StringUtils
//				.removeStart(StringUtils.leftPad(StringUtils.right(num, 2), StringUtils.length(num), ""), "**"));
		return StringUtils.left(num, 3).concat( StringUtils.leftPad(StringUtils.right(num, 4), StringUtils.length(num)-3, "*") );
	}

	/**
	 * 
	 * 【地址】只显示到地区，不显示详细地址，比如：北京市海淀区**
	 *
	 * @param address
	 * @param sensitiveSize
	 *            敏感信息长度
	 * @return
	 */
	public static String address(String address, int sensitiveSize) {
		if (StringUtils.isBlank(address)) {

			return "";
		}
		int length = StringUtils.length(address);
		return StringUtils.rightPad(StringUtils.left(address, length - sensitiveSize), length, "*");
	}

	/**
	 * 
	 * 【电子邮箱 邮箱前缀仅显示第一个字母，前缀其他隐藏，用星号代替，@及后面的地址显示，比如：d*@126.com>
	 * 
	 * @param email
	 * @return
	 */
	public static String email(String email) {
		if (StringUtils.isBlank(email)) {

			return "";
		}
		int index = StringUtils.indexOf(email, "@");
		if (index <= 1) {

			return email;
		} else {

			return StringUtils.rightPad(StringUtils.left(email, 1), index, "*")
					.concat(StringUtils.mid(email, index, StringUtils.length(email)));
		}
	}

	/**
	 * 
	 * 【银行卡号】前六位，后四位，其他用星号隐藏每位1个星号，比如：6222600**1234>
	 *
	 * @param cardNum
	 * @return
	 */
	public static String bankCard(String cardNum) {
		if (StringUtils.isBlank(cardNum)) {

			return "";
		}
		if (cardNum.length()<=10){
			return cardNum;
		}

//		return StringUtils.left(cardNum, 6).concat(StringUtils
//				.removeStart(StringUtils.leftPad(StringUtils.right(cardNum, 4), StringUtils.length(cardNum), ""), "*"));
		return StringUtils.left(cardNum, 6).concat( StringUtils.leftPad(StringUtils.right(cardNum, 4), StringUtils.length(cardNum)-6, "*") );
	}



	/**
	 * 
	 * 【密码】密码的全部字符都用代替，比如：**
	 * 
	 * @param password
	 * @return
	 */
	public static String password(String password) {
		if (StringUtils.isBlank(password)) {

			return "";
		}
		String pwd = StringUtils.left(password, 0);
		return StringUtils.rightPad(pwd, StringUtils.length(password), "*");
	}

	/**
	 *  全部替换为 *
	 * @param str
	 * @return
	 */
	public static String replaceAll(String str) {
		if (StringUtils.isBlank(str)) {

			return "";
		}
		String pwd = StringUtils.left(str, 0);
		return StringUtils.rightPad(pwd, StringUtils.length(str), "*");
	}


	/**
	 * 
	 * 【车牌号】前两位后一位，比如：苏M**5
	 *
	 * @param carNumber
	 * @return
	 */
	public static String carNumber(String carNumber) {
		if (StringUtils.isBlank(carNumber)) {

			return "";
		}
		return StringUtils.left(carNumber, 2).

				concat(StringUtils.removeStart(
						StringUtils.leftPad(StringUtils.right(carNumber, 1), StringUtils.length(carNumber), "*"),
						"**"));
	}

	public static String desensitizedIdNumber(String idNumber){
		if (!StringUtils.isEmpty(idNumber)) {
			if (idNumber.length() == 15){
				idNumber = idNumber.replaceAll("(\\w{6})\\w*(\\w{4})", "$1******$2");
			}
			if (idNumber.length() == 18){
				idNumber = idNumber.replaceAll("(\\w{6})\\w*(\\w{4})", "$1*********$2");
			}
		}
		return idNumber;
	}

}