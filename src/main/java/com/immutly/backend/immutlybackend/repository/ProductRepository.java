package com.immutly.backend.immutlybackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.immutly.backend.immutlybackend.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long>{
    
}
