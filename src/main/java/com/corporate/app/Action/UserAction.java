package com.corporate.app.Action;

import com.corporate.app.Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserAction {

    @Autowired
    private UserService userService;

    @GetMapping("queryUser")
    @ResponseBody
    public List<User> queryUser(){
        return userService.queryUser();
    }
}
