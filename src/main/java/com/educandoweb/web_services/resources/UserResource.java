package com.educandoweb.web_services.resources;

import com.educandoweb.web_services.entitties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Dayane", "dayne@email.com", "119999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
