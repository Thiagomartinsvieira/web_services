package com.educandoweb.web_services.repositories;

import com.educandoweb.web_services.entitties.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
