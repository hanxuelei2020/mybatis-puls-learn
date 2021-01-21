package com.haust.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haust.mapper.EmployeeMapper;
import com.haust.pojo.Employee;

public class TestMp {

	private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void testPluges() throws Exception {
		EmployeeMapper mapper = applicationContext.getBean("employeeMapper", EmployeeMapper.class);
		Employee employee = new Employee();
		Page<Employee> page = employee.selectPage(new Page<Employee>(1, 2), null);
		List<Employee> list = page.getRecords();
		list.forEach(o->System.out.print(o));
		
	}
}
