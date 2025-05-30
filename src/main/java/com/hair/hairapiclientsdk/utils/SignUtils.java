package com.hair.hairapiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * 签名工具类
 */
public class SignUtils {
    /**
     * 生成加密签名算法
     * @param body
     * @param secretKey
     * @return
     */
    public static String genSign(String body, String secretKey) {
        Digester md5 = new Digester(DigestAlgorithm.MD5);
        String content = body + "." + secretKey;
        String digestHex = md5.digestHex(content);
        return digestHex;
    }
}
