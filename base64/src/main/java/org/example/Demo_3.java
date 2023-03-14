package org.example;


import org.apache.commons.codec.binary.Base64;

/**
 * 3. 使用Apache Commons Code包进行编码解码
 */
public class Demo_3 {

    public static void main(String[] args) {
        encode();
        decode();
        // 静态方式
        decode_static();
    }

    public static void encode() {
        // 用默认参数创建Base64对象
        Base64 base64 = new Base64();
        // 输入需要编码的字符串
        String originalInput = "test input";
        // 执行编码
        String encodedString = new String(base64.encode(originalInput.getBytes()));
        // 将会输出 dGVzdCBpbnB1dA==
        System.out.println("编码后的字符串：" + encodedString);
    }

    public static void decode() {
        // 用默认参数创建Base64对象
        Base64 base64 = new Base64();
        // 编码后的字符串
        String encodedString = "dGVzdCBpbnB1dA==";
        // 解码操作
        String decodedString = new String(base64.decode(encodedString.getBytes()));
        // 将会输出 test input
        System.out.println("解码后的字符串：" + decodedString);
    }

    public static void decode_static() {
        // 原始字符串
        String originalInput = "test input";
        // 编码
        String encodedString = new String(Base64.encodeBase64(originalInput.getBytes()));
        System.out.println("编码后的字符串：" + encodedString);
        // 解码
        String decodedString = new String(Base64.decodeBase64(encodedString.getBytes()));
        System.out.println("解码后的字符串：" + decodedString);

    }
}
