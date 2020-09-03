package com.hwadee.dao;


import com.hwadee.pojo.User;

public interface LoginMapper {

		public User findUser(User User)throws Exception;
		
		public void insertUser(User User)throws Exception;
}
