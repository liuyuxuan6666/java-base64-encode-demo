package org.example;

import java.util.Base64;

/**
 * 2.2 无填充的编码
 */
public class Demo_2_2 {
    public static void main(String[] args) {
        encode();
    }

    public static void encode() {
        // 设置需要编码的字符串
        String originalInput = "test input";
        // 直接使用Base64.getEncoder()方法编码
        String encodedString = Base64.getEncoder().withoutPadding().encodeToString(originalInput.getBytes());
        // 将会输出 dGVzdCBpbnB1dA
        System.out.println("编码后的字符串：" + encodedString);
    }
}
