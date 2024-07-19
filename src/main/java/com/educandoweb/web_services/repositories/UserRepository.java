package com.educandoweb.web_services.repositories;

import com.educandoweb.web_services.entitties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
