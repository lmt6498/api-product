package com.example.crud_product_jpa.services;


import com.example.crud_product_jpa.models.Product;

import java.util.ArrayList;


public interface IProductService{
    Product save(Product product);
    Product findById(long id);

    ArrayList<Product> findAll();

    ArrayList<Product> findAllByName(String name);

    void delete(Product product);

    void edit(Product product);
}
