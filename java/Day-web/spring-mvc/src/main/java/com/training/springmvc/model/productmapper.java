package com.training.springmvc.model;

import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class productmapper implements RowMapper<product> {


    @Override
    public product mapRow(ResultSet rs, int rowNum) throws SQLException {
        product prod = new product();
        prod.setProdId(rs.getInt("prod_id"));
        prod.setProdName(rs.getString("prod_name"));
        prod.setProdDesc(rs.getString("prod_desc"));
        prod.setPrice((int) rs.getDouble("price"));
        return prod;
    }
}
