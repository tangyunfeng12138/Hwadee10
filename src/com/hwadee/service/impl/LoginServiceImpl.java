package com.hwadee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwadee.dao.LoginMapper;
import com.hwadee.pojo.User;
import com.hwadee.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginMapper loginDao;



	@Override
	public User findUser(User user) throws Exception {
		User manager = loginDao.findUser(user);
		if(manager == null){
			throw new Exception("");
		}else{
			return manager;
		}
	}



	@Override
	public void saveUser(User user) throws Exception {
		loginDao.insertUser(user);
	}
}
