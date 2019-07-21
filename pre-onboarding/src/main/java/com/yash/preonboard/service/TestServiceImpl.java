package com.yash.preonboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.preonboard.bean.Test;
import com.yash.preonboard.dao.TestDao;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;
	
	@Override
	public String createTest(Test test) {
		return testDao.createTest(test);
	}

	@Override
	public String updateTest(Test test) {
		return testDao.updateTest(test);
	}

	@Override
	public String deleteTest(int id) {
		return testDao.deleteTest(id);
	}

	@Override
	public Test getTest(int id) {
		return testDao.getTest(id);
	}
	
}
