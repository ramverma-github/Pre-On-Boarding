package com.yash.preonboard.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.preonboard.dao.BusinessGroupDAO;
import com.yash.preonboard.domain.BusinessGroup;

@Repository
public class BusinessGroupDAOImpl implements BusinessGroupDAO{
	
	@Autowired EntityManager entityManager;

	@Override
	public BusinessGroup getBusinessGroup(String businessGroupName) {
		TypedQuery<BusinessGroup> query = entityManager.createNamedQuery("BusinessGroup.getBusinessGroup", BusinessGroup.class);
		query.setParameter("businessGroupName", businessGroupName);
		
		BusinessGroup businessGroup = query.getSingleResult();
		return businessGroup;
	}

	@Override
	public Map<String, BusinessGroup> getAllBusinessGroups() {
		TypedQuery<BusinessGroup> query = entityManager.createNamedQuery("BusinessGroup.getAllBusinessGroups", BusinessGroup.class);
		List<BusinessGroup> businessGroups = query.getResultList();
		Map<String, BusinessGroup> bgMap = businessGroups.stream().collect(
                Collectors.toMap(x -> x.getBusinessGroup(), x -> x));
		return bgMap;
	}

}
