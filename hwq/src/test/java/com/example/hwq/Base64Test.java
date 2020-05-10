package com.example.hwq;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Test {
    @Test
    public void test() throws UnsupportedEncodingException {
        // 编码
        String encode = Base64.getEncoder().encodeToString("So".getBytes("UTF-8"));
        System.out.println(encode);
        // 解码
        byte[] decode = Base64.getDecoder().decode(encode);
        System.out.println(new String(decode, "UTF-8"));
    }

}
