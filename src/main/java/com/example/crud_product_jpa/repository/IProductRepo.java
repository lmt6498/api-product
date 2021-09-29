package com.example.crud_product_jpa.repository;

import com.example.crud_product_jpa.models.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;


public interface IProductRepo extends CrudRepository<Product,Long> {
    @Query(value = "select c from Product c where c.name like concat('%',:name,'%')")
    ArrayList<Product> findAllByName(@Param("name") String name);
}
