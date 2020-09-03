package com.hwadee.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hwadee.param.ResultVo;
import com.hwadee.pojo.Teacher;
import com.hwadee.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 教师管理控制器

 *
 */
@Controller
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	
	//取得课程一览信息
	@RequestMapping("/teacherquerylist")
	@ResponseBody
	public List<Teacher> teacherquerylist(String t_name, Model model) throws Exception{
		


		Map<String, Object> params = new HashMap<String, Object>();
		params.put("t_name", t_name);
		
		List<Teacher> teacherlist = new ArrayList<Teacher>();

		teacherlist = teacherService.getUserList(params);  

		return teacherlist;
	}



	
	@RequestMapping("/updateteacher")
	@ResponseBody
	public ResultVo updateUser(HttpServletRequest request, Teacher teacher, Model model) throws Exception{

		teacherService.updateUser(teacher);
		ResultVo resultVo =new ResultVo();
		resultVo.setType("ok");
		return resultVo;
	}
	
	


	
	@RequestMapping("/insertteacher")
	@ResponseBody
	public ResultVo insertUser(Teacher teacher,Model model) throws Exception{

		teacherService.insertUser(teacher);
		ResultVo resultVo =new ResultVo();
		resultVo.setType("ok");
		return resultVo;
	}
	

	
	@RequestMapping("/deleteteacher")
	@ResponseBody
	public String deleteUser(String id,Model model) throws Exception{

		teacherService.deleteUser(id);
		
		return "删除成功";
	}
	
}
