package com.shopdemo.springbootstart.product;

import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, String>{

}
