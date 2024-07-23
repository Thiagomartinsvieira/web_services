package com.educandoweb.web_services.repositories;

import com.educandoweb.web_services.entitties.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}