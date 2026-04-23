package com.programmingtechie.product_service.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.programmingtechie.product_service.model.Product;

public interface ProductRepo extends MongoRepository<Product, String> {
    

}
