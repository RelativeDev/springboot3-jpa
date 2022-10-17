package com.springboot.firstproject.resources;

import com.springboot.firstproject.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria", "Maria@gmail.com", "12342342", "12344");
        return ResponseEntity.ok().body(u);
    }

}
