package com.training.springmvc.dao;

import com.training.springmvc.model.product;
import com.training.springmvc.model.productmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository

public class productDAOimpl implements productDAO{
    JdbcTemplate jdbcTemplate;

    private final String SQL_GET_ALL_PRODUCTS = "select * from product";
    private final String SQL_ADD_PRODUCT = "INSERT INTO product (prod_id, prod_name, prod_desc, price) VALUES (?,?,?,?)";

@Autowired
public productDAOimpl(DataSource dataSource){
    jdbcTemplate = new JdbcTemplate(dataSource);

}
  @Override
  public List<product> getAllProducts(){
    return jdbcTemplate.query(SQL_GET_ALL_PRODUCTS,new productmapper());

  }

    @Override
    public void addProduct(product product) {
        jdbcTemplate.update(SQL_ADD_PRODUCT, product.getProdId(), product.getProdName(), product.getProdDesc(), product.getPrice());
    }





}
