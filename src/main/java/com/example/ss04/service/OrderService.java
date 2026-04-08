package com.example.ss04.service;

import com.example.ss04.reponsitory.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.OptionalDouble;

//B1
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public String getAllOrder(){
        return orderRepository.getAllOder();
    }

    public String getOrderById(int id){
        return orderRepository.getOrderById(id);
    }

    public String addOrder(){
        return orderRepository.addOrder();
    }

    //b5

    public String cancelOrder(Long id) {
        return orderRepository.cancelOrder(id);
    }
}
