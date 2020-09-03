package com.hwadee.dao;

import com.hwadee.pojo.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherMapper {
	  
	
	public List<Teacher> getTeacherList(Map<String, Object> map);
	
	public void insertTeacher(Teacher b);
	
	public void deleteTeacher(String stuid);
	
	public void updateTeacher(Teacher b);

}
