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
        EntityM entityM = new EntityM("A","W");
        map.put("A","W");
        if(map.containsKey(entityM.getName())){
            entityM.setName("B");
        }
        System.out.println(map);
        System.out.println(entityM);
        if(map.containsValue(entityM.getSex())){
            entityM.setSex("M");
        }
        System.out.println(map);
        System.out.println(entityM);
    }
}
