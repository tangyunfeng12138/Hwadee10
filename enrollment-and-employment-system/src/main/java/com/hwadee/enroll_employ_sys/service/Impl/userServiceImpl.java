package com.hwadee.enroll_employ_sys.service.Impl;

import com.hwadee.enroll_employ_sys.dao.UserDao;
import com.hwadee.enroll_employ_sys.entity.User;
import com.hwadee.enroll_employ_sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findById(String  id) {
        User user = userDao.findById(id);
        return user;
    }
}
