package com.javarunner.springbootcrudk8sexample.repository;

import com.javarunner.springbootcrudk8sexample.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRespository extends JpaRepository<Order,Long> {

}
