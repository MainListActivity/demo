package com.y.cloud.example.demo.entity;

import javax.persistence.*;

/**
 * 版权所有：   y.
 * 创建日期：   17-12-22.
 * 重要说明：
 * 修订历史：
 */
@Entity
public class User {
    @Id
    @GeneratedValue()
    @Column(name = "id", updatable = false, insertable = false)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "six")
    private String six;
    @Column(name = "phone")
    private String phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
