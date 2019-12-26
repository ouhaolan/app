package com.corporate.app.Service.impl;

import com.corporate.app.Service.UserService;
import com.corporate.app.Dao.UserDao;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryUser() {
        return userDao.queryUser();
    }
}
