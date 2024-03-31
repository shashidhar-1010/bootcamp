package com.training.springmvc.service;

import com.training.springmvc.dao.productDAO;
import com.training.springmvc.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class productserviceimpl implements productservice{

    @Autowired
    productDAO productDAO;
    @Override
    public List<product> getallproducts() {

        List<product> productList = productDAO.getAllProducts();
        //List<product> productList = new ArrayList<>();
        //productList.add(new product(101,"laptop","electronics",1234));
        //productList.add(new product(102,"mobile","electronics",198));
        return productList;
    }

    @Override
    public void addProduct(product product) {

    }
}
