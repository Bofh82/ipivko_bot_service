package com.example.ipivko_bot_service.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Accessors(chain = true)
public class Order {

    @Id
    private String id;
    private LocalDateTime createdAt;
    private String customer;
    private String beer;
    private BigDecimal volume;

}
