package com.training.springmvc.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class product {
    private int prodId;
    private String prodName;
    private String prodDesc;
    private int price;
}
