package com.y.cloud.example.demo.repository;

import com.y.cloud.example.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by y
 * on 2017/12/24
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
