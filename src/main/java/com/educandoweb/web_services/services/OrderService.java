package com.educandoweb.web_services.services;

import com.educandoweb.web_services.entitties.Order;
import com.educandoweb.web_services.entitties.User;
import com.educandoweb.web_services.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id){
         Optional<Order> obj = repository.findById(id);
         return obj.get();
    }
}
