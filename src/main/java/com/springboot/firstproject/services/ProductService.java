package com.springboot.firstproject.services;

import com.springboot.firstproject.entities.Product;
import com.springboot.firstproject.entities.Product;
import com.springboot.firstproject.repositories.ProductRepository;
import com.springboot.firstproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }


}
