package com.hwadee.controller;

import java.util.ArrayList;
import java.util.List;


import com.hwadee.param.ResultVo;
import com.hwadee.pojo.Attend;
import com.hwadee.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 考勤控制器
 *
 */
@Controller
public class AttendController {
	@Autowired
	private AttendService attendService;
	
	//取得课程一览信息
	@RequestMapping("/attendquerylist")
	@ResponseBody
	public List<Attend>  courquerylist(Model model) throws Exception{
		

		List<Attend> attendlist = new ArrayList<Attend>();
		attendlist = attendService.getAttendList();  
		return attendlist;
	}
	
	

	@RequestMapping("/updateAttend")
	@ResponseBody
	public ResultVo updateAttend(Attend attend, Model model) throws Exception{
		attendService.updateAttend(attend);
		ResultVo resultVo =new ResultVo();
		resultVo.setType("ok");
		return resultVo;
	}
	
	
	@RequestMapping("/insertAttend")
	@ResponseBody
	public ResultVo insertBook(Attend attend,Model model) throws Exception{
		attendService.insertAttend(attend);
		ResultVo resultVo =new ResultVo();
		resultVo.setType("ok");
		return resultVo;
	}
	

	
	@RequestMapping("/deleteAttend")
	@ResponseBody
	public ResultVo deleteBook(String attend_id,Model model) throws Exception{

		attendService.deleteAttend(attend_id);

		ResultVo resultVo =new ResultVo();
		resultVo.setType("ok");
		return resultVo;
	}
	
}
