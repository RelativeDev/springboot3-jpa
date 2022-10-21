package com.springboot.firstproject.services;

import com.springboot.firstproject.entities.User1;
import com.springboot.firstproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User1> findAll(){
        return repository.findAll();
    }

    public User1 findById(Long id){
        Optional<User1> obj = repository.findById(id);
        return obj.get();
    }


}
