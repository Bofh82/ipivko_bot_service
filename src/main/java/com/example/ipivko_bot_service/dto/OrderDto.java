package com.example.ipivko_bot_service.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDto {

    private String customer;
    private String beer;
    private BigDecimal volume;

}
