package com.gome.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gome.modle.TmAppCaseInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class TestGome {
	@Autowired
	private TmAppCaseInfoService tmAppCaseInfoService;
	@Test
	public void test(){
		TmAppCaseInfo t1=tmAppCaseInfoService.getInfo54();
		TmAppCaseInfo t2=tmAppCaseInfoService.getInfo55();
	}
}
