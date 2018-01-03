package com.test;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.*;

/**
 * 版权所有：   y.
 * 创建日期：   17-12-27.
 * 重要说明：
 * 修订历史：
 */

public class MyTest {
    @Test
    public void t() throws Exception {
        C a = new C();
        System.out.println(a.getMyClass().getName());
        System.out.println("---------");
        A<B> aa = new A<>();
        Class<A> a2 = A.class;
        A ai2 = a2.newInstance();
        SB bb = aa.getInstance("",SB.class);
        B b1 = new B();
        String s = b1.instance(String.class);
        RestTemplate restTemplate = new RestTemplate();
        B b = restTemplate.getForObject("", B.class);
        aa.getMyClass();
//        List<String> strings = new ArrayList<>();
//        System.out.println(getSuperClassGenericType(strings.getClass(), 0).getName());
    }

    class A<T> {
        // 定义泛型成员变量
        private T t;
        Class c;

        A() {
//            c = getSuperClassGenericType(getClass(), 0);
            c = getSuperClassGenricType(getClass(), 0);
            for (Field f : c.getDeclaredFields())
                System.out.println("field name: " + f.getName());
        }

        <S extends T> S getInstance(String a, Class<? extends S> s) {
            try {

                return s.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        Class getMyClass() {
            return c;
        }
    }

    public static Class getSuperClassGenericType(Class clazz, int index) {
//        Class t;
//        try {
//
//            Type type = clazz.getDeclaredField("t").getGenericType();
//            t = (Class) type;
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
        Type genType = clazz.getGenericSuperclass();
        if (!(genType instanceof ParameterizedType)) {
            return Object.class;
        }
        return getClass(genType, index);
    }

    private static Class getClass(Type type, int i) {
        if (type instanceof ParameterizedType) { // 处理泛型类型
            System.out.println("1111111");
            return getGenericClass((ParameterizedType) type, i);
        } else if (type instanceof TypeVariable) {
            System.out.println("--------" + getClass(((TypeVariable) type).getBounds()[0], 0).getName());
            return getClass(((TypeVariable) type).getBounds()[0], 0); // 处理泛型擦拭对象
        } else {// class本身也是type，强制转型
            return (Class) type;
        }
    }

    private static Class getGenericClass(ParameterizedType parameterizedType, int i) {
        Object genericClass = parameterizedType.getActualTypeArguments()[i];
        if (genericClass instanceof ParameterizedType) { // 处理多级泛型
            System.out.println("111111");
            return (Class) ((ParameterizedType) genericClass).getRawType();
        } else if (genericClass instanceof GenericArrayType) { // 处理数组泛型
            return (Class) ((GenericArrayType) genericClass).getGenericComponentType();
        } else if (genericClass instanceof TypeVariable) { // 处理泛型擦拭对象
            System.out.println("33333333");
            return getClass(((TypeVariable) genericClass).getBounds()[0], 0);
        } else {
            System.out.println("444444");
            return (Class) genericClass;
        }
    }

    public static Class getSuperClassGenricType(Class clazz, int index) {

        Type genType = clazz.getGenericSuperclass();

        if (!(genType instanceof ParameterizedType)) {
            return Object.class;
        }

        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();

        if (index >= params.length || index < 0) {
            return Object.class;
        }
        if (!(params[index] instanceof Class)) {
            return Object.class;
        }
        return (Class) params[index];
    }


    class SB extends B{}

    private class B {
        private String name;

        public <T> T instance(Class<T> tClass) {
            try {
                return tClass.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    private class C extends A<B> {

    }


}
