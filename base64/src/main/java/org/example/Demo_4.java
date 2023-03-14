package org.example;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * 4. 将字符串对象转化为字节数组
 * 如果想查看此文件中的代码运行结果，
 * 建议使用打断点的方式
 * 因为数组无法直接输出
 */
public class Demo_4 {

    public static void main(String[] args) {
        stringToByteArray();
        stringToUTF16ByteArray();
        base64Encoed();
        usingDatatypeConverter();
    }

    public static void stringToByteArray() {
        // 原始字符串
        String originalInput = "test input";
        // 转化为字节数组
        byte[] result = originalInput.getBytes();
    }

    public static void stringToUTF16ByteArray() {
        // 原始字符串
        String originalInput = "test input";
        // 转化为UTF16编码的字节数组
        byte[] result = originalInput.getBytes(StandardCharsets.UTF_16);
    }

    public static void base64Encoed() {
        String originalInput = "dGVzdCBpbnB1dA==";
        byte[] result = Base64.getDecoder().decode(originalInput);
    }

    public static void usingDatatypeConverter() {
        String originalInput = "dGVzdCBpbnB1dA==";
        byte[] result = DatatypeConverter.parseBase64Binary(originalInput);
    }
}
