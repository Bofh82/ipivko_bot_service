package com.example.ipivko_bot_service.repository;

import com.example.ipivko_bot_service.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iPivkoRepository extends JpaRepository<Order, String> {

}
