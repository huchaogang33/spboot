package com.newt.boot.service.utils.security;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.HexUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;


public class RsaUtil {

    public static String encrypt(String publicKey, String src) {
        RSA rsa = new RSA(null, publicKey);
        return rsa.encryptHex(src, KeyType.PublicKey);
    }

    public static String decrypt(String privateKey, String secret) {
        RSA rsa = new RSA(privateKey, null);
        return rsa.decryptStr(secret, KeyType.PrivateKey, CharsetUtil.CHARSET_UTF_8);
    }

    public static String sign(String privateKey, String src) {
        Sign sign = new Sign(SignAlgorithm.SHA256withRSA, privateKey, null);
        return HexUtil.encodeHexStr(sign.sign(src.getBytes()));
    }

    public static boolean verify(String publicKey, String src, String signInfo) {
        Sign sign = new Sign(SignAlgorithm.SHA256withRSA, null, publicKey);
        return sign.verify(src.getBytes(), HexUtil.decodeHex(signInfo));
    }
}
