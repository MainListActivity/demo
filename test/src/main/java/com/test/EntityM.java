package com.test;

/**
 * 版权所有：   y.
 * 创建日期：   18-1-10.
 * 重要说明：
 * 修订历史：
 */
public class EntityM {
    private String name;
    private String sex;

    public EntityM(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "EntityM{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
