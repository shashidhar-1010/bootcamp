package com.training.springmvc.controller;

import com.training.springmvc.model.product;
import com.training.springmvc.service.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")

public class homecontroller {

    @Autowired

    productservice service;

    @RequestMapping(method = RequestMethod.GET)
    public String greet(Model model){
        List<product> productList= service.getallproducts();
        System.out.println(productList);
        model.addAttribute("prodList",productList);
        return "home";
    }

    @RequestMapping(value = "/addPage",method=RequestMethod.GET)
    public String addPage(){
        return "add";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute product product){
        System.out.println(product.getProdName());
        service.addProduct(product);
        return "redirect:/";
    }
}
