package com.yash.preonboard.controller;



import javax.naming.directory.InitialDirContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.yash.preonboard.bean.UserCredential;
import com.yash.preonboard.service.UserLoginService;


@RestController
public class UserLoginController {
	
	@Autowired
	UserLoginService loginService;
	HttpSession session;

	@RequestMapping(value="/sendUserCredentials" , method = RequestMethod.POST,headers = "Accept=*/*")
	public String verifyUserCredentials(@RequestBody UserCredential userCredential, HttpServletRequest httpServletRequest  ){
	
		Gson gson=new Gson();
		System.out.println("Ok"+ userCredential.getUsername());
		
		InitialDirContext initialDirContext= loginService.checkUSerCredential(userCredential);
		
		if(initialDirContext==null){
			return gson.toJson("Unauthorized");
		}
		
		session=httpServletRequest.getSession();
		session.setAttribute("LoggedInUSer", userCredential);
		
		return gson.toJson("Authorized");
	}
}
