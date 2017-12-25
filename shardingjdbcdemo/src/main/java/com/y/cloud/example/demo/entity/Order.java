package com.y.cloud.example.demo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by y
 * on 2017/12/24
 */
@Entity
@Table(name = "t_order")
public class Order {
    @Id
    @Column(name = "order_id")
    @GenericGenerator(name = "key",strategy = "com.y.cloud.example.demo.KeyGenerator")
    @GeneratedValue(generator = "key")
    private long orderId;
    @Column(name = "user_id")
    private long userId;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
