package org.example;

import java.util.Base64;

/**
 * 2.3 URL编码
 */
public class Demo_2_3 {
    public static void main(String[] args) {
        encode();
        decode();
    }

    public static void encode() {
        // 设置需要编码的字符串
        String originalUrl = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";
        // 使用URL编码方式进行编码
        String encodedUrl = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());
        // aHR0cHM6Ly93d3cuZ29vZ2xlLmNvLm56Lz9nZmVfcmQ9Y3ImZWk9ZHpiRlYmZ3dzX3JkPXNzbCNxPWphdmE=
        System.out.println("编码后的字符串：" + encodedUrl);
    }

    public static void decode() {
        // 编码后的字符串
        String encodedUrl = "aHR0cHM6Ly93d3cuZ29vZ2xlLmNvLm56Lz9nZmVfcmQ9Y3ImZWk9ZHpiRlYmZ3dzX3JkPXNzbCNxPWphdmE";
        // 使用Base64.getDecoder()获得字节流
        // byte[62]:
        // [104, 116, 116, 112, 115, 58, 47, 47, 119, 119, 119, 46,
        // 103, 111, 111, 103, 108, 101, 46, 99, 111, 46, 110, 122,
        // 47, 63, 103, 102, 101, 95, 114, 100, 61, 99, 114, 38, 101,
        // 105, 61, 100, 122, 98, 70, 86, 38, 103, 119, 115, 95, 114,
        // 100, 61, 115, 115, 108, 35, 113, 61, 106, 97, 118, 97]
        byte[] decodedBytes = Base64.getUrlDecoder().decode(encodedUrl);
        // 新建一个String变量，把字节流转化成字符串
        String decodedUrl = new String(decodedBytes);
        // 将会输出 https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java
        System.out.println("解码后的字符串：" + decodedUrl);
    }
}
