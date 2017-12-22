package com.y.cloud.example.demo.repository;

import com.y.cloud.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 版权所有：   y.
 * 创建日期：   17-12-22.
 * 重要说明：
 * 修订历史：
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
