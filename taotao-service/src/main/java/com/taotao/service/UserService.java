package com.taotao.service;

import com.taotao.dao.UserDao;
import com.taotao.entity.User;

/**
 * @author Stone
 * @date 2019/12/25 15:35
 */
public class UserService {
    private UserDao userdao = new UserDao();

    public User findById(int id){
        return userdao.findById(id);
    }
}
