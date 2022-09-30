package com.example.ipivko_bot_service.controller;

import com.example.ipivko_bot_service.dto.iPivkoDto;
import com.example.ipivko_bot_service.entity.Order;
import com.example.ipivko_bot_service.service.iPivkoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class iPivkoController {

    private final iPivkoService service;

    @PostMapping
    public Order save(@RequestBody iPivkoDto order) {
        return service.save(order);
    }

    @GetMapping
    public Iterable<Order> getAll() {
        return service.getAll();
    }

}
