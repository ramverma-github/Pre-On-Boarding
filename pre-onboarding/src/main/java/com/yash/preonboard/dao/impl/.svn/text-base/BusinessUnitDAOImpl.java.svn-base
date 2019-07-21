package com.yash.preonboard.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.preonboard.dao.BusinessUnitDAO;
import com.yash.preonboard.domain.BusinessUnit;

@Repository
public class BusinessUnitDAOImpl implements BusinessUnitDAO {
	
	@Autowired
	private EntityManager em;

	@Override
	public Map<String, BusinessUnit> getAllBusinessUnits() {
		TypedQuery<BusinessUnit> query = em.createNamedQuery("BusinessUnit.getAllBusinessUnits", BusinessUnit.class);
		List<BusinessUnit> businessUnits = query.getResultList();
		Map<String, BusinessUnit> buMap = businessUnits.stream().collect(
                Collectors.toMap(x -> x.getBusinessUnit(), x -> x));
		return buMap;
		
		
	}
	
	

}
