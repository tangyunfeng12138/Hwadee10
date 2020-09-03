package com.hwadee.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwadee.dao.TeacherMapper;
import com.hwadee.pojo.Teacher;
import com.hwadee.service.TeacherService;


@Service("teacherService")
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	private TeacherMapper teacherMapper;



	@Override
	public List<Teacher> getUserList(Map<String, Object> map) {
		return teacherMapper.getTeacherList(map);
	}



	@Override
	public void insertUser(Teacher b) {
		teacherMapper.insertTeacher(b);
	}
 


	@Override
	public void deleteUser(String deleteId) {
		teacherMapper.deleteTeacher(deleteId);
	}



	@Override
	public void updateUser(Teacher b) {
		teacherMapper.updateTeacher(b);
	}


}
