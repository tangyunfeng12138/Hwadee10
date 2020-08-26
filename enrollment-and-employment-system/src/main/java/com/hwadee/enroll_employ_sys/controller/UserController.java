package com.hwadee.enroll_employ_sys.controller;

import com.hwadee.enroll_employ_sys.entity.User;
import com.hwadee.enroll_employ_sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/toUserView")
    public String toUserView(){
        return "user";
    }

    @RequestMapping("getUser")
    @ResponseBody
    public User gerUser(String id){
        User user=userService.findById(id);
        return user;
    }

}
