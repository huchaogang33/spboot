package com.newt.boot.service.utils.security;

import cn.hutool.core.util.IdUtil;
import cn.hutool.crypto.digest.DigestUtil;

public class SecretUtil {

    private static final int PASSWORD_AND_SALT_LENGTH = 64;

    /**
     * 生成含有随机盐的密码.
     */
    public static String generate(String password) {
        String salt = IdUtil.simpleUUID();
        password = DigestUtil.md5Hex(password + salt);
        char[] md5 = new char[PASSWORD_AND_SALT_LENGTH];
        for (int i = 0; i < PASSWORD_AND_SALT_LENGTH; i++) {
            md5[i] = password.charAt(i / 2);
            md5[++i] = salt.charAt(i / 2);
        }
        return new String(md5);
    }

    /**
     * 校验密码是否正确.
     *
     * @param password 密码
     * @param md5      带有随机盐的密码 MD5 值
     * @return 密码是否正确
     */
    public static boolean verify(String password, String md5) {
        char[] pwd = new char[32];
        char[] salt = new char[32];
        for (int i = 0; i < PASSWORD_AND_SALT_LENGTH; i++) {
            pwd[i / 2] = md5.charAt(i);
            salt[i / 2] = md5.charAt(++i);
        }
        return DigestUtil.md5Hex(password + new String(salt)).equals(new String(pwd));
    }

    public static void main(String[] args) {
        String generate = generate("0000");
       // System.out.println(generate);
        String password="0000";
        String md5="f0d9635c6bbc0e9a535a5e0414a2db146a9e581a3f3eff531d4fab5cb5d20c0f";
        boolean verify = verify(password, md5);
        System.out.println(verify);
    }
}
