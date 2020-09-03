package com.hwadee.controller;

import javax.servlet.http.HttpServletRequest;

import com.hwadee.pojo.User;
import com.hwadee.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 登录注册控制器
 *
 */
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	
	
	//管理员登录
		@RequestMapping("/login")
		@ResponseBody
		public String manlogin(HttpServletRequest request, User user) throws Exception{
			User manager = null;

			String rstr="";
			try{
				//调用service进行用户身份验证
				manager = loginService.findUser(user);
			}catch(Exception e){
				e.printStackTrace();
			}
			if(manager!=null){
				
				rstr = "登录成功";

			}else{
				rstr = "登录失败，用户名密码错误";
			}
			
			return rstr;
		}



	@RequestMapping("/regsiter")
	@ResponseBody
	public String regsiter(HttpServletRequest request, User user) throws Exception{

		String rstr="";
		try{
			//调用service进行用户注册
			loginService.saveUser(user);
			rstr = "注册成功";
		}catch(Exception e){
			e.printStackTrace();
			rstr = "注册失败";
		}
		return rstr;
	}

	
	
}
