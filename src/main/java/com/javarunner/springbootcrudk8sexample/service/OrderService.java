package com.javarunner.springbootcrudk8sexample.service;

import com.javarunner.springbootcrudk8sexample.entity.Order;
import com.javarunner.springbootcrudk8sexample.repository.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRespository orderRespository;

    public Order addOrder(Order order) {
        return orderRespository.save(order);

    }

    public List<Order> getOrders() {
        return orderRespository.findAll();
    }

        public Order getOrder(Long id) {
        return orderRespository.findById(id).get();
    }
}
