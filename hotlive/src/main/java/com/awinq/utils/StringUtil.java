package com.awinq.utils;

public class StringUtil {

    public static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }
        return StringUtil.isEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
