package com.haust.test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.haust.mapper.EmployeeMapper;
import com.haust.mapper.UserMapper;
import com.haust.pojo.User;

public class TestMP {
	
	private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void testInjector() throws Exception {
		EmployeeMapper mapper = applicationContext.getBean("employeeMapper", EmployeeMapper.class);
		int deleteAll = mapper.deleteAll();
		System.out.println(deleteAll);
	}
	
	@Test
	public void testLogicDelete() throws Exception {
		UserMapper userMapper = applicationContext.getBean("userMapper",UserMapper.class);
		List<User> result = userMapper.selectList(null);
		System.out.println(result);
		
	}
}
