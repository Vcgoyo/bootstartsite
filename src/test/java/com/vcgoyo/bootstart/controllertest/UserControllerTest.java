package com.vcgoyo.bootstart.controllertest;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.vcgoyo.bootstart.module.sys.domain.dao.UserRepository;
import com.vcgoyo.bootstart.module.sys.domain.eneity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=MockServletContext.class)
//@WebAppConfiguration
public class UserControllerTest {
	
	private MockMvc mvc;
	//@Before
	public void setUp(){
		mvc=MockMvcBuilders.standaloneSetup(new UserControllerTest()).build();
	}
	@Test
	public void getHello() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(MockMvcResultHandlers.print())
		.andReturn();
	}
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void UserRespTest() {
		User user=new User();
		user.setLoginName("admin1");
		user.setPassword("1234561");
		
		User save = userRepository.save(user);
		
	}
}
