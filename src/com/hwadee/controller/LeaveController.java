package com.hwadee.controller;

import java.util.ArrayList;
import java.util.List;


import com.hwadee.param.ResultVo;
import com.hwadee.pojo.Leave;
import com.hwadee.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 请假控制器
 *
 */
@Controller
public class LeaveController {
	@Autowired
	private LeaveService leaveService;
	
	//取得课程一览信息
	@RequestMapping("/leavequerylist")
	@ResponseBody
	public List<Leave>  courquerylist(Model model) throws Exception{
		

		List<Leave> attendlist = new ArrayList<Leave>();
		attendlist = leaveService.getLeaveList();  
		return attendlist;
	}
	
	@RequestMapping("/updateLeavesh")
	@ResponseBody
	public ResultVo updateLeavesh(Leave leave, Model model) throws Exception{
		leaveService.updateLeavesh(leave);
		ResultVo resultVo =new ResultVo();
		resultVo.setType("ok");
		return resultVo;
	}
	
	

	@RequestMapping("/updateLeave")
	@ResponseBody
	public ResultVo updateLeave(Leave leave,Model model) throws Exception{
		leaveService.updateLeave(leave);
		ResultVo resultVo =new ResultVo();
		resultVo.setType("ok");
		return resultVo;
	}
	
	
	@RequestMapping("/insertLeave")
	@ResponseBody
	public ResultVo insertBook(Leave leave,Model model) throws Exception{
		leaveService.insertLeave(leave);
		ResultVo resultVo =new ResultVo();
		resultVo.setType("ok");
		return resultVo;
	}
	

	
	@RequestMapping("/deleteLeave")
	@ResponseBody
	public ResultVo deleteBook(String leave_id,Model model) throws Exception{

		leaveService.deleteLeave(leave_id);

		ResultVo resultVo =new ResultVo();
		resultVo.setType("ok");
		return resultVo;
	}
	
}
