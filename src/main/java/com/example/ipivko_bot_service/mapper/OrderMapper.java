package com.example.ipivko_bot_service.mapper;

import com.example.ipivko_bot_service.dto.OrderDto;
import com.example.ipivko_bot_service.entity.Order;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderMapper {
    private final ModelMapper mapper;

    public Order convertToEntity(OrderDto orderDto) {
        return mapper.map(orderDto, Order.class);
    }

    public OrderDto convertToDto(Order orderEntity) {
        return mapper.map(orderEntity, OrderDto.class);
    }
}