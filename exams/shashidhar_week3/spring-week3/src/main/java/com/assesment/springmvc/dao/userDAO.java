
package com.assesment.springmvc.dao;

import com.assesment.springmvc.model.User;
import com.assesment.springmvc.model.User;

import java.util.List;

public interface userDAO {
    default List<User> getAllUsers(){
        return null;
    }


    void addUser( User user);
}
