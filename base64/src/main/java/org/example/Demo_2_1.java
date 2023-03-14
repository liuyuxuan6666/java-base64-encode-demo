package org.example;

import java.util.Base64;

/**
 * 2.1 Java8中Base64的基本编码器(getEncoder)
 */
public class Demo_2_1 {
    public static void main(String[] args) {
        encode();
        decode();
    }

    public static void encode() {
        // 设置需要编码的字符串
        String originalInput = "test input";
        // 直接使用Base64.getEncoder()方法编码
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        // 将会输出 dGVzdCBpbnB1dA==
        System.out.println("编码后的字符串：" + encodedString);
    }

    public static void decode() {
        // 编码后的字符串
        String encodedString = "dGVzdCBpbnB1dA==";
        // 使用Base64.getDecoder()获得字节流  byte[10]: [116, 101, 115, 116, 32, 105, 110, 112, 117, 116]
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        // 新建一个String变量，把字节流转化成字符串
        String decodedString = new String(decodedBytes);
        // 将会输出 test input
        System.out.println("解码后的字符串：" + decodedString);
    }
}
