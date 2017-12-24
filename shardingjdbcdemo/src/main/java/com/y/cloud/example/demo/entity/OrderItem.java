package com.y.cloud.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by y
 * on 2017/12/24
 */
@Entity
@Table(name = "t_order_item")
public class OrderItem {
    @Id
    @Column(name = "item_id")
    private long itemId;
    @Column(name = "order_id")
    private long orderId;
    @Column(name = "user_id")
    private long userId;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

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
