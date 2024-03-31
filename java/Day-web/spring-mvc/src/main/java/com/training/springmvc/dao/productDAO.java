package com.training.springmvc.dao;

import com.training.springmvc.model.product;

import java.util.List;

public interface productDAO {
    default List<product> getAllProducts(){
        return null;
    }


    void addProduct(product product);
}
