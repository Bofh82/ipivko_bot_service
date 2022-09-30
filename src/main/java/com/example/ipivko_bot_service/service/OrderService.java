package com.example.ipivko_bot_service.service;

import com.example.ipivko_bot_service.dto.OrderDto;
import com.example.ipivko_bot_service.entity.Order;
import com.example.ipivko_bot_service.mapper.OrderMapper;
import com.example.ipivko_bot_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper mapper;

    public String addOrder(OrderDto orderDto) {

        Order saveOrder = orderRepository.save(mapper.convertToEntity(orderDto));
        if (saveOrder != null) {
            return saveOrder.getId();
        }
        return null;
    }

    public OrderDto getOrder(String id) {
        Order order = orderRepository.getReferenceById(id);
        return mapper.convertToDto(order);
    }

    public Boolean deleteOrderById(String id) {
        orderRepository.deleteById(id);
        return !orderRepository.existsById(id);
    }

    public List<OrderDto> getAllOrders() {
        List<Order> ordersList = orderRepository.findAll();
        return ordersList.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }
}
