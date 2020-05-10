package com.example.hwq.util;

public class AssertUtil {
    public static void isTrue(Boolean flag,String msg) throws Exception {
        if(flag){
            throw new Exception(msg);
        }
    }
}
