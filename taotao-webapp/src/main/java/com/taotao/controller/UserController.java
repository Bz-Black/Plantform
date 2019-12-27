package com.taotao.controller;

import com.taotao.service.UserService;

/**
 * @author Stone
 * @date 2019/12/25 15:55
 */
public class UserController {
    private UserService userService = new UserService();

    public String findById(int id){
        userService.findById(id);
        return "";
    }
}
