package com.newt.boot.service.utils.security;

import cn.hutool.core.util.HexUtil;
import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class AesUtil {

    private static final Logger logger = LoggerFactory.getLogger(AesUtil.class);

    public static String generateAesKey(){
        return HexUtil.encodeHexStr(SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded());
    }

    /**
     * AES对称加密
     * @param key   16进制格式的秘钥
     * @param src   原串
     * @return  16进制格式的密文信息
     */
    public static String encrypt(String key, String src){
        try {
            Cipher cipher = Cipher.getInstance(String.format("%s/%s/%s", SymmetricAlgorithm.AES.name(), Mode.ECB.name(), Padding.PKCS5Padding.name()));
            SecretKeySpec secretKeySpec  = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8),"AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypt = cipher.doFinal(src.getBytes(StandardCharsets.UTF_8));
            return HexUtil.encodeHexStr(encrypt);
        }catch (Exception e){
            logger.error("对称加密发生异常 秘钥:{} 原文{}", key, src, e);
        }
        return null;
    }

    /**
     * AES解密
     * @param key   16进制格式的秘钥
     * @param encrypted 密文信息
     * @return  原文信息
     */
    public static String decrypt(String key, String encrypted){
        try {
            Cipher cipher = Cipher.getInstance(String.format("%s/%s/%s", SymmetricAlgorithm.AES.name(), Mode.ECB.name(), Padding.PKCS5Padding.name()));
            SecretKeySpec spec  = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8),"AES");
            //SecretKeySpec spec  = new SecretKeySpec(HexUtil.decodeHex(key),"AES");
            cipher.init(Cipher.DECRYPT_MODE, spec);
            byte[] decrypt = cipher.doFinal(HexUtil.decodeHex(encrypted));
            return new String(decrypt, StandardCharsets.UTF_8);
        }catch (Exception e){
            logger.error("对称解密发生异常 秘钥:{} 密文{}", key, encrypted, e);
        }
        return null;
    }

    public static String encrypt2(String key, String src){
        AES aes = new AES(key.getBytes(StandardCharsets.UTF_8));
        return aes.encryptHex(src);
    }

    public static String decrypt2(String key, String encrypted){
        AES aes = new AES(key.getBytes(StandardCharsets.UTF_8));
        return aes.decryptStr(encrypted);
    }
}
