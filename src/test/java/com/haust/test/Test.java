package com.haust.test;

import static org.junit.Assert.*;

import java.rmi.Naming;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;



public class Test {

	/**
	 *  代码生成 示例代码
	 */
	
	@org.junit.Test
	public void testGenerator() throws Exception {
		// 全局配置
		GlobalConfig config = new GlobalConfig();
		config.setActiveRecord(true) //设置实体类支持AR属性
			  .setAuthor("韩雪磊")
			  .setBaseColumnList(true)
			  .setOutputDir("C:\\Users\\PC\\Workspaces\\MyEclipse 2017 CI\\"
			  		+ "mybatis-plus-02\\src\\main\\java") //代码要生成的位置
			  .setFileOverride(true)  //第二次的生成的代码是否会覆盖第一次的
			  .setBaseResultMap(true)  //设置基础关系映射
			  .setIdType(IdType.AUTO)  //设置主键id自增
			  .setServiceName("%sService");  //设置service的名称
		// 数据源配置
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setDbType(DbType.MYSQL)  //设置数据库类型
						.setDriverName("com.mysql.cj.jdbc.Driver") //设置驱动包
						.setUrl("jdbc:mysql://localhost:3306/mp?serverTimezone=UTC")
						.setUsername("root")
						.setPassword("Aa12358@jiy");
						
		// 策略配置
		StrategyConfig strategyConfig = new StrategyConfig();
		strategyConfig.setCapitalMode(true)  //全局大写
					  .setNaming(NamingStrategy.underline_to_camel)
					  .setTablePrefix("tbl_")
					  .setInclude("tbl_employee");
		// 包名策略配置
		PackageConfig packageConfig = new PackageConfig();
		packageConfig.setParent("com.haust")
					.setEntity("pojo")
					.setMapper("mapper")
					.setController("controller")
					.setService("service")
					.setXml("mapper");
		// 整合配置
		AutoGenerator aGenerator  = new AutoGenerator();
		aGenerator.setGlobalConfig(config)
					.setDataSource(dataSourceConfig)
					.setPackageInfo(packageConfig)
					.setStrategy(strategyConfig);
		
		//execute()
		aGenerator.execute();
		
	}
}
