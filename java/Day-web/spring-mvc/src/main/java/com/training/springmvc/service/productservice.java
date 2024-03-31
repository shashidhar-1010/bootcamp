package com.training.springmvc.service;

import com.training.springmvc.model.product;

import java.util.List;

public interface productservice {

    List<product> getallproducts();
    void addProduct(product product);
}
