package com.example.crud_product_jpa.services;

import com.example.crud_product_jpa.models.Product;

import com.example.crud_product_jpa.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepo productRepo;

    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product findById(long id) {
        return productRepo.findById(id).get();
    }

    @Override
    public ArrayList<Product> findAll() {
        return (ArrayList<Product>) productRepo.findAll();
    }

    @Override
    public ArrayList<Product> findAllByName(String name) {
        return productRepo.findAllByName(name);
    }

    @Override
    public void delete(Product product) {
        productRepo.delete(product);
    }

    @Override
    public void edit(Product product) {
        productRepo.save(product);
    }
}
