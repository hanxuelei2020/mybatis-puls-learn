package com.haust.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.haust.mapper.EmployeeMapper;
import com.haust.pojo.Employee;


public class TestMp {

	private ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void test() throws Exception {
		DataSource source = ioc.getBean("dataSource",DataSource.class);
		System.out.println(source);
		Connection connection = source.getConnection();
		System.out.println(connection);
		
		
	}
	
	@Test
	public void testComman() throws Exception {
		Employee employee = new Employee(null, "mp", "mp@qq.com", 1, 22);
		
		EmployeeMapper mapper = ioc.getBean("employeeMapper", EmployeeMapper.class);
		mapper.insert(employee);
		
	}
}
