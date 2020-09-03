package com.hwadee.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import com.hwadee.pojo.Teacher;




@Resource
public interface TeacherService {
	//学生查询列表
	public List<Teacher> getUserList(Map<String, Object> map);

	
	public void insertUser(Teacher b);
	
	public void updateUser(Teacher b);
	
	public void deleteUser(String deleteId);
	
}
