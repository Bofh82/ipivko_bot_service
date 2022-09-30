package com.example.ipivko_bot_service.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class iPivkoDto {

    private String customer;
    private String beer;
    private BigDecimal volume;

}
