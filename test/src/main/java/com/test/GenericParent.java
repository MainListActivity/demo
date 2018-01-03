package com.test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * 版权所有：   y.
 * 创建日期：   17-12-27.
 * 重要说明：
 * 修订历史：
 */
public class GenericParent<T,K> {
    public Class<T> entityClass;

    public GenericParent(){
        TypeVariable[] tValue = GenericParent.class.getTypeParameters();
        System.out.println(tValue[0].getName());
        System.out.println(getClass().getName());
        Type t = getClass().getGenericSuperclass();
        System.out.println(t);
        System.out.println(t.getClass().getName());
        entityClass = (Class<T>)((ParameterizedType)t).getActualTypeArguments()[0];
        System.out.println(entityClass.getName());
    }

    public static void main(String[] args){
        GenericParent<String,Integer> obj = new GenericParent<String,Integer>();
    }
}