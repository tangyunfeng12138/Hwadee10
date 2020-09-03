package com.hwadee.dao;

import com.hwadee.pojo.Leave;

import java.util.List;

public interface LeaveMapper {
	  
	
	public List<Leave> getLeaveList();
	
	public void insertLeave(Leave b);
	
	public void deleteLeave(String leave_id);
	
	public void updateLeave(Leave b);
	
	public void updateLeavesh(Leave b);
	
	
		
}
