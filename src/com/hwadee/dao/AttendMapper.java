package com.hwadee.dao;

import com.hwadee.pojo.Attend;

import java.util.List;

public interface AttendMapper {
	  
	
	public List<Attend> getAttendList();
	
	public void insertAttend(Attend b);
	
	public void deleteAttend(String attend_id);
	
	public void updateAttend(Attend b);
	
	
		
}
