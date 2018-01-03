package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 版权所有：   y.
 * 创建日期：   18-1-2.
 * 重要说明：
 * 修订历史：
 */
public class HashMapL {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            map.put("" + i, String.valueOf((char) i));
        }
        System.out.println(map.size());
    }
}
