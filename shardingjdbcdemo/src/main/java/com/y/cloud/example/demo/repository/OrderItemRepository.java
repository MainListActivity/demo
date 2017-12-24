package com.y.cloud.example.demo.repository;

import com.y.cloud.example.demo.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by y
 * on 2017/12/24
 */
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
