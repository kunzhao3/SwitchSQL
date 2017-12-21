package com.gome.dao.sqltest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSql {
	public static void main(String[] args) {
		  //初始化ApplicationContext
		  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		 
		  MySqlMapper mySqlMapper = applicationContext.getBean(MySqlMapper.class);
		 
		  SqlServerMapper sqlServerMapper = applicationContext.getBean(SqlServerMapper.class);
		   
		  //设置数据源为MySql,使用了AOP测试时请将下面这行注释
		  MultipleDataSource.setDataSourceKey("mySqlDataSource");
		  mySqlMapper.getList();
		  //设置数据源为SqlServer,使用AOP测试时请将下面这行注释
		  MultipleDataSource.setDataSourceKey("sqlServerDataSource");
		  sqlServerMapper.getList();
	}
}
