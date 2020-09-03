package com.hwadee.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwadee.dao.AttendMapper;
import com.hwadee.pojo.Attend;
import com.hwadee.service.AttendService;


@Service("attendService")
public class AttendServiceImpl implements AttendService{
	
	@Autowired
	private AttendMapper attendMapper;



	@Override
	public List<Attend> getAttendList() {
		return attendMapper.getAttendList();
	}



	@Override
	public void insertAttend(Attend b) {
		attendMapper.insertAttend(b);
	}



	@Override
	public void deleteAttend(String deleteId) {
		attendMapper.deleteAttend(deleteId);
	}



	@Override
	public void updateAttend(Attend b) {
		attendMapper.updateAttend(b);
	}


}
