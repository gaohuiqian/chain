package com.huiqian.data.moniter.common.util;

import java.math.BigInteger;

public class NumberUtil {

    private static String prefix = "0x";

    public static String toHex(int number) {
        return prefix.concat(Integer.toHexString(number));
    }

    public static int parHex(String hexValue) {
        BigInteger bValue = new BigInteger(hexValue.substring(2), 16);
        return bValue.intValue();

    }
}
