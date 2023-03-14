package org.example;

import java.util.Base64;
import java.util.UUID;

/**
 * 2.4 MIME编码
 */
public class Demo_2_4 {
    public static void main(String[] args) {
        encode();
        decode();
    }

    private static StringBuilder getMimeBuffer() {
        StringBuilder buffer = new StringBuilder();
        for (int count = 0; count < 10; ++count) {
            buffer.append(UUID.randomUUID().toString());
        }
        return buffer;
    }

    public static void encode() {
        StringBuilder buffer = getMimeBuffer();
        byte[] encodedAsBytes = buffer.toString().getBytes();
        String encodedMime = Base64.getMimeEncoder().encodeToString(encodedAsBytes);
        //NmNjZDYwZjUtNmZiZS00ODBjLWJlMzctMGUwMmQ5YzMxYzM1YjUxNjc5MTUtMDRjOC00YjRkLWE4
        //MDEtNzdkNmUxNzNlZDUzMjRlYTRiYTMtMDI2ZC00NDBiLTgzODQtMDIxMGFiOTM2NzMzOTE3MDM0
        //NjgtNTgzYi00NDkyLWE3NDYtODkyNTI4ZGM5OTEyYTA1ZDk5N2YtZjI5Mi00NDNlLTk1ZTUtZDdk
        //NGU1ODM4MjRkOTM3YWJiYjUtNzhlOC00MjE0LWE2NjItMDU0NDc1MDk4OTA5NWRkMTY2YTktYzRl
        //Mi00MjU3LTlmZTEtNDE1ZjFlZWM2N2U2YzUwZTBkNzktN2EzZi00MzA3LThmY2YtNjA0NTZkMTZm
        //MTcwOWU4YzQ5MTctZGRjMS00NzJhLWEwMTUtMjc5NzJjMTRjYWQzM2RkNzU0OWEtMmM3Ni00YTFl
        //LWFjMzctMjE0OGM5ODQ4ODE0
        System.out.println("编码后的字符串：" + encodedMime);
    }

    public static void decode() {
        String encodedMime =
                "NmNjZDYwZjUtNmZiZS00ODBjLWJlMzctMGUwMmQ5YzMxYzM1YjUxNjc5MTUtMDRjOC00YjRkLWE4\n" +
                "MDEtNzdkNmUxNzNlZDUzMjRlYTRiYTMtMDI2ZC00NDBiLTgzODQtMDIxMGFiOTM2NzMzOTE3MDM0\n" +
                "NjgtNTgzYi00NDkyLWE3NDYtODkyNTI4ZGM5OTEyYTA1ZDk5N2YtZjI5Mi00NDNlLTk1ZTUtZDdk\n" +
                "NGU1ODM4MjRkOTM3YWJiYjUtNzhlOC00MjE0LWE2NjItMDU0NDc1MDk4OTA5NWRkMTY2YTktYzRl\n" +
                "Mi00MjU3LTlmZTEtNDE1ZjFlZWM2N2U2YzUwZTBkNzktN2EzZi00MzA3LThmY2YtNjA0NTZkMTZm\n" +
                "MTcwOWU4YzQ5MTctZGRjMS00NzJhLWEwMTUtMjc5NzJjMTRjYWQzM2RkNzU0OWEtMmM3Ni00YTFl\n" +
                "LWFjMzctMjE0OGM5ODQ4ODE0";
        byte[] decodedBytes = Base64.getMimeDecoder().decode(encodedMime);
        String decodedMime = new String(decodedBytes);
        // 6ccd60f5-6fbe-480c-be37-0e02d9c31c35b5167915-04c8-4b4d-a801-77d6e173ed5324ea4ba3-026d
        // -440b-8384-0210ab93673391703468-583b-4492-a746-892528dc9912a05d997f-f292-443e-95e5
        // -d7d4e583824d937abbb5-78e8-4214-a662-0544750989095dd166a9-c4e2-4257-9fe1
        // -415f1eec67e6c50e0d79-7a3f-4307-8fcf-60456d16f1709e8c4917-ddc1-472a-a015
        // -27972c14cad33dd7549a-2c76-4a1e-ac37-2148c9848814
        System.out.println("解码后的字符串：" + decodedMime);
    }
}
