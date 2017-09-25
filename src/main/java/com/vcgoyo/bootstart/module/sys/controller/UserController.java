package com.vcgoyo.bootstart.module.sys.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vcgoyo.bootstart.module.sys.domain.dao.UserRepository;
import com.vcgoyo.bootstart.module.sys.domain.eneity.User;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/hello")
	public String index() {
		return "hello world";
	}
	@RequestMapping("/save")
	public String save() {
		
		User user=new User();
		user.setLoginName("admin");
		user.setPassword("123456");
		userRepository.save(user);
		return "1";
	}
	
	
	@RequestMapping("/hellohtml")
	public String hellowHtml(Map<String,Object> map) {
		map.put("hello", "from TemplateController.helloHtml");
		return "helloHtml";
	}
}
