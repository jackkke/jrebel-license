package com.vvvtimes.util;

import java.nio.charset.StandardCharsets;

public class Base64 {
    /**
     * 编码
     *
     * @param bstr
     * @return String
     */
    public static byte[] encode(byte[] bstr) {
        return java.util.Base64.getEncoder().encode(bstr);
    }


    public static byte[] decode(String str) {
        return decode(str.getBytes(StandardCharsets.UTF_8));
    }
    public static byte[] decode(byte[] str) {
        return java.util.Base64.getDecoder().decode(str);
    }
}
