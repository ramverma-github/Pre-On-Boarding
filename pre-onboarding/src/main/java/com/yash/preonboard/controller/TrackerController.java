package com.yash.preonboard.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yash.preonboard.bean.CandidateDetailsBean;
import com.yash.preonboard.bean.CandidateFormBean;
import com.yash.preonboard.service.CandidateDetailsService;

@RestController
public class TrackerController {
	
	@Autowired
	CandidateDetailsService pdfService;

	@RequestMapping(value = "/candidateDtls/{emailID}", method = RequestMethod.GET, headers = "Accept=*/*")
	public String getCandidateDtls(@PathVariable("emailID") String cndEmailId) throws Exception {
		CandidateDetailsBean cndDtlsBean = null;
		if (null != cndEmailId && !cndEmailId.equals("")) {
			cndDtlsBean = pdfService.getCandidateDetails(cndEmailId);
		}
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		Map<String, CandidateDetailsBean> map = new HashMap<>();
		map.put("cndDtlsBean", cndDtlsBean);
		return gson.toJson(map);
	}

	@RequestMapping(value="/updateCndDtls", method=RequestMethod.POST, headers = "Accept=*/*")
	public String updateCandidateDtls(@RequestBody CandidateFormBean candidateFormBean) throws Exception {
		System.out.println("Inside updateCandidateDtls of::>>>>"+candidateFormBean.getCandidateName()); 
		Boolean flag = pdfService.updateCandidateDtls(candidateFormBean);
		if (flag) {
			return "Updated...";
		} else {
			return "Data not avialable to update...";
		}
	}
}
