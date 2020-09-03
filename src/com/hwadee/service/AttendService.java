package com.hwadee.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.hwadee.pojo.Attend;



@Resource
public interface AttendService {
	//学生查询列表
	public List<Attend> getAttendList();

	
	public void insertAttend(Attend b);
	
	public void updateAttend(Attend b);
	
	public void deleteAttend(String attend_id);
	
}
