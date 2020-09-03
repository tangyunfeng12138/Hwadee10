package com.hwadee.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwadee.dao.LeaveMapper;
import com.hwadee.pojo.Leave;
import com.hwadee.service.LeaveService;


@Service("leaveService")
public class LeaveServiceImpl implements LeaveService{
	
	@Autowired
	private LeaveMapper leaveMapper;



	@Override
	public List<Leave> getLeaveList() {
		return leaveMapper.getLeaveList();
	}



	@Override
	public void insertLeave(Leave b) {
		leaveMapper.insertLeave(b);
	}



	@Override
	public void deleteLeave(String deleteId) {
		leaveMapper.deleteLeave(deleteId);
	}



	@Override
	public void updateLeave(Leave b) {
		leaveMapper.updateLeave(b);
	}



	@Override
	public void updateLeavesh(Leave b) {
		leaveMapper.updateLeavesh(b);
	}


}
