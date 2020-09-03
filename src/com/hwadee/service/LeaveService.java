package com.hwadee.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.hwadee.pojo.Leave;



@Resource
public interface LeaveService {
	//查询列表
	public List<Leave> getLeaveList();

	
	public void insertLeave(Leave b);
	
	public void updateLeave(Leave b);
	
	
	public void updateLeavesh(Leave b);
	
	
	public void deleteLeave(String attend_id);
	
}
