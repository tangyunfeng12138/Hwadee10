package com.hwadee.service;

import javax.annotation.Resource;

import com.hwadee.pojo.User;

@Resource
public interface LoginService {

	//管理员查询列表
	public User findUser(User user)throws Exception;

	public void saveUser(User user)throws Exception;
}
