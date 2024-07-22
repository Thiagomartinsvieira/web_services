package com.educandoweb.web_services.repositories;

import com.educandoweb.web_services.entitties.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
