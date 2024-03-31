package com.ps.springboot.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Product {

    private int prodId;
    private String prodName;
    private String prodDesc;
    private int price;

//    public Product(int i, String fridge, String lg, int i1) {
//    }
}
