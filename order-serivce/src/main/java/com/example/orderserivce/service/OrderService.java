package com.example.orderserivce.service;

import com.example.orderserivce.dto.OrderDto;
import com.example.orderserivce.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
