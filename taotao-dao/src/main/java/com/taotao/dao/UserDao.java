package com.taotao.dao;

import com.taotao.entity.User;

/**
 * @author Stone
 * @date 2019/12/25 15:30
 */
public class UserDao {
    private User user = new User();

    public User findById(int id){
        System.out.println("findById"+id);
        return null;
    }
}
