package com.assesment.springmvc.dao;

import com.assesment.springmvc.model.User;
import com.assesment.springmvc.model.Usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository

public class userDAOimpl implements userDAO{
    JdbcTemplate jdbcTemplate;

    private final String SQL_GET_ALL_USERS = "select * from user";
    private final String SQL_ADD_USERS = "INSERT INTO user (user_id, user_name, user_pass) VALUES (?,?,?)";

    @Autowired
    public userDAOimpl(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);

    }
    @Override
    public List<User> getAllUsers(){
        return jdbcTemplate.query(SQL_GET_ALL_USERS,new Usermapper());

    }

    @Override
    public void addUser(User user) {
        jdbcTemplate.update(SQL_ADD_USERS, user.getId(), user.getUsername(), user.getPassword());
    }


//    @Override
//    public List<User> getAllUsers() {
//        return userDAO.super.getAllUsers();
//    }

//    @Override
//    public void addUser(User user) {
//
//    }
}
