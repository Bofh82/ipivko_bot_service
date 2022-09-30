package com.example.ipivko_bot_service.controller.v1;

import com.example.ipivko_bot_service.dto.OrderDto;
import com.example.ipivko_bot_service.entity.Order;
import com.example.ipivko_bot_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PutMapping("order")
    String addOrder(@RequestBody OrderDto orderDto) {
        return service.addOrder(orderDto);
    }

    @GetMapping("order/{id}")
    OrderDto getOrder(@PathVariable("id") String id) {
        return service.getOrder(id);
    }

    @DeleteMapping("order/{id}")
    Boolean deleteOrderById(@PathVariable("id") String id) {
        return service.deleteOrderById(id);
    }

    @GetMapping("orders")
    List<OrderDto> getAllOrders() {
        return service.getAllOrders();
    }

}
