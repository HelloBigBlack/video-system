package com.chao.video.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.chao.video.bean.AdminUser;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath*:spring-application-context.xml", "classpath*:dispatcherServlet.xml" })
public class MVCTest {
	@Autowired
	WebApplicationContext context;
	MockMvc mockMvc;
	
	@Before
	public void initMockMvc(){
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testPage() throws Exception{
		AdminUser adminUser = new AdminUser();
		adminUser.setId("wangchao");
		adminUser.setPassword("wangchao");
		MvcResult myMVCResult = mockMvc.perform(MockMvcRequestBuilders.post("/admin/login", adminUser)).andReturn();
		MockHttpServletRequest request = myMVCResult.getRequest();
		System.out.println(request.getAttribute("extend"));
		System.out.println(request.getParameter("data"));
		

	}
}
