package com.example.ipivko_bot_service.service;

import com.example.ipivko_bot_service.dto.iPivkoDto;
import com.example.ipivko_bot_service.entity.Order;
import com.example.ipivko_bot_service.repository.iPivkoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class iPivkoService {

    private final iPivkoRepository ipivkoRepository;

    public Order save(iPivkoDto ipivkoDto) {

        Order order = new Order()
                .setCustomer(ipivkoDto.getCustomer())
                .setBeer(ipivkoDto.getBeer())
                .setVolume(ipivkoDto.getVolume())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());

        return ipivkoRepository.save(order);

    }

    public List<Order> getAll() {

        return ipivkoRepository.findAll();

    }
}
