package com.moha.OrderService.Service;

import com.moha.OrderService.DTO.OrderDto;
import com.moha.OrderService.Mapper.OrderMapper;
import com.moha.OrderService.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public OrderDto createOrder(OrderDto  orderDto){
        return  orderMapper.to(orderRepository.save(orderMapper.from(orderDto)));
    }
}
