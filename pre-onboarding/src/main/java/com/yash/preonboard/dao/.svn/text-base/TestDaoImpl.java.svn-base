package com.yash.preonboard.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yash.preonboard.bean.Test;

@Repository
@Transactional
public class TestDaoImpl implements TestDao{

	@Autowired
	private EntityManager em;

	@Override
	public String createTest(Test test) {
		System.out.println("Persit call at application start time..."+test);
		em.persist(test);
		return "Test Created..";
	}

	@Override
	public String updateTest(Test test) {
		Test test1 = em.find(Test.class, test.getId());
		if(null != test1){
			em.merge(test);
			return "Updated..";
		}else{
			em.merge(test);
			return "New Created, Because given object is not available..";
		}
		
	}

	@Override
	public String deleteTest(int id) {
		
		Test test1 = em.find(Test.class, id);
		if(null != test1){
			em.remove(test1);
			return id+" Deleted..";
		}else{
			return "Not Available to delete..";
		}
	}

	@Override
	public Test getTest(int id) {
		return (Test)em.find(Test.class, id);
	}
	

}
