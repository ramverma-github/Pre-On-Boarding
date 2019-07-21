/**
 * 
 */
package com.yash.preonboard.dao;

import com.yash.preonboard.domain.CandidateDetails;

/**
 * @author himanshu.chaturvedi
 *
 */
public interface CandidateDetailsDao {

	void savdPDFDetails(CandidateDetails candidateDetails);

	CandidateDetails getCandidateDetails(String emailId);

	Boolean updateCandidateDtls(CandidateDetails CandidateDtlsDomain);

}
