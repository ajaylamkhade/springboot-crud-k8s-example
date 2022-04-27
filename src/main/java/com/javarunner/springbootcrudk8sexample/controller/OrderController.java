package com.javarunner.springbootcrudk8sexample.controller;

import com.javarunner.springbootcrudk8sexample.entity.Order;
import com.javarunner.springbootcrudk8sexample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/addorder")
    public ResponseEntity<Order> addOrder(@RequestBody Order order){

        if(order!=null) {
            return new ResponseEntity<>(orderService.addOrder(order), HttpStatus.CREATED);
        }else {
             throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"order request is null");
        }
    }

    @GetMapping("/getorders")
    public ResponseEntity<List<Order>> getOrders() {
        return new ResponseEntity<>(orderService.getOrders(),HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Long id){
        return new ResponseEntity<>(orderService.getOrder(id),HttpStatus.ACCEPTED);
    }
}
