package com.it.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Utils {
    public static String md5(String input) {
        try {
            // 1. 获取MD5算法实例
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 2. 输入数据更新
            md.update(input.getBytes());
            // 3. 计算摘要
            byte[] digest = md.digest();
            // 4. 转换为16进制字符串
            return bytesToHex(digest);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5算法不可用", e);
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
