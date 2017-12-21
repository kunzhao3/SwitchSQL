package com.gome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gome.dao.TmAppCaseInfoDao;
import com.gome.modle.TmAppCaseInfo;
import com.gome.service.TmAppCaseInfoService;

@Service
public class TmAppCaseInfoServiceimpl implements TmAppCaseInfoService{
    @Autowired
	private TmAppCaseInfoDao tmAppCaseInfoDao;
	@Override
	public List<TmAppCaseInfo> getInfoList() {
		return tmAppCaseInfoDao.getInfoList();
	}
	@Override
	public TmAppCaseInfo getInfo54() {
		// TODO Auto-generated method stub
		return tmAppCaseInfoDao.getInfo54();
	}
	@Override
	public TmAppCaseInfo getInfo55() {
		// TODO Auto-generated method stub
		return tmAppCaseInfoDao.getInfo55();
	}
}
