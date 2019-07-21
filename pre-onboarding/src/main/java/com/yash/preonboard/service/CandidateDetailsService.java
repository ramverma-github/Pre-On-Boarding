/**
 * 
 */
package com.yash.preonboard.service;

import org.springframework.web.multipart.MultipartFile;

import com.yash.preonboard.bean.CandidateDetailsBean;
import com.yash.preonboard.bean.CandidateFormBean;

/**
 * @author himanshu.chaturvedi
 *
 */
public interface CandidateDetailsService {

	public void readPDF();

	public CandidateDetailsBean getCandidateDetails(String cndEmailId);
	
	public Boolean updateCandidateDtls(CandidateFormBean candidateFormBean);
	
	public void createPDFfromMultipartFile(MultipartFile multipartFile);
}
