package com.cxl.blog.service;

import com.cxl.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
