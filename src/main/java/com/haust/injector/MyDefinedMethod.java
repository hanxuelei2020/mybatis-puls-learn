package com.haust.injector;

import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.metadata.TableInfo;

public class MyDefinedMethod extends AbstractMethod{

	@Override
	public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
		// TODO Auto-generated method stub
		String sql = "delete from " + tableInfo.getTableName();
		String method = "deleteAll";
		//构造sqlsources对象
		SqlSource source = languageDriver.createSqlSource(configuration, sql, modelClass);
		
		return addDeleteMappedStatement(mapperClass, method, source);
	}

}
