package com.haust.injector;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.extension.injector.methods.LogicDeleteByIdWithFill;

/**
 * 全局自定义
 * @author PC
 *
 */
@Component
public class MyInjector extends DefaultSqlInjector{
	
	@Autowired
	private LogicDeleteByIdWithFill logicDeleteByIdWithFill;
	
	@Override
	public List<AbstractMethod> getMethodList(Class<?> mapperClass) {
		// TODO Auto-generated method stub
		List<AbstractMethod> list = super.getMethodList(mapperClass);
		list.add(new MyDefinedMethod());
		list.add(logicDeleteByIdWithFill);
		return list;
	}
}
