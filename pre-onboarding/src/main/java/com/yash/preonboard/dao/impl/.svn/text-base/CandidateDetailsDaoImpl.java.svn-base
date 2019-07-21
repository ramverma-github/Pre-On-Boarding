/**
 * 
 */
package com.yash.preonboard.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yash.preonboard.dao.CandidateDetailsDao;
import com.yash.preonboard.domain.CandidateDetails;

/**
 * @author himanshu.chaturvedi
 *
 */
@Repository
@Transactional
public class CandidateDetailsDaoImpl implements CandidateDetailsDao {

	@Autowired
	private EntityManager em;

	@Override
	public void savdPDFDetails(CandidateDetails candidateDetails) {

		em.persist(candidateDetails);
		em.flush();
	}

	public CandidateDetails getCandidateDetails(String cndEmailId) {
		TypedQuery<CandidateDetails> query = em.createNamedQuery("CandidateDetails.findByEmailId", CandidateDetails.class);
		query.setParameter("cndEmailId", cndEmailId);
		List<CandidateDetails> candidateDetails = query.getResultList();
		return candidateDetails.get(0);
	}

	@Override
	public Boolean updateCandidateDtls(CandidateDetails candidateDtlsDomain) {
			em.merge(candidateDtlsDomain);
			return true;
	}

}
