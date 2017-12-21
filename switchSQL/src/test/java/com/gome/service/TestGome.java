package com.gome.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.gome.dao.sqltest.MultipleDataSource;
import com.gome.modle.TmAppCaseInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class TestGome {
	@Autowired
	private TmAppCaseInfoService tmAppCaseInfoService;
	@Test
	public void test(){
		MultipleDataSource.setDataSourceKey("mySqlDataSource");
		TmAppCaseInfo t1=tmAppCaseInfoService.getInfo54();
		System.out.println("54数据库的数据"+JSON.toJSON(t1));
		MultipleDataSource.setDataSourceKey("sqlServerDataSource");
		TmAppCaseInfo t2=tmAppCaseInfoService.getInfo55();
		System.out.println("55数据库的数据"+JSON.toJSON(t2));
	}
}
