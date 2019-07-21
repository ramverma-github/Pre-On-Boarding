package com.yash.preonboard.helper;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;

import com.yash.preonboard.bean.BusinessGroupBean;
import com.yash.preonboard.bean.BusinessUnitBean;
import com.yash.preonboard.bean.CandidateDetailsBean;
import com.yash.preonboard.bean.ContractorDtlsBean;
import com.yash.preonboard.bean.EmploymentBean;
import com.yash.preonboard.bean.PreviousEmploymentBean;
import com.yash.preonboard.bean.RemarksDetailsBean;
import com.yash.preonboard.bean.SalaryDetailsBean;
import com.yash.preonboard.domain.CandidateDetails;
import com.yash.preonboard.domain.ContractorDtls;
import com.yash.preonboard.domain.Employment;
import com.yash.preonboard.domain.RemarksDetails;
import com.yash.preonboard.domain.SalaryDetails;

public class DomainToBeanHelper {

	public static CandidateDetailsBean convertDomainToBean(CandidateDetails candidateDtlsDomain) {
		CandidateDetailsBean candidateDtlsBean = null;
		if (null != candidateDtlsDomain) {
			candidateDtlsBean = new CandidateDetailsBean();

			BusinessGroupBean bgBean = new BusinessGroupBean(
					candidateDtlsDomain.getBusinessGroup().getBusinessGroupId(),
					candidateDtlsDomain.getBusinessGroup().getBusinessGroup(),
					candidateDtlsDomain.getBusinessGroup().getBusinessGroupHead());

			BusinessUnitBean buBean = new BusinessUnitBean(candidateDtlsDomain.getBusinessUnit().getBusinessUnitId(),
					candidateDtlsDomain.getBusinessUnit().getBusinessUnit(),
					candidateDtlsDomain.getBusinessUnit().getBusinessUnitHead());

			candidateDtlsBean.setBusinessGroup(bgBean);
			candidateDtlsBean.setBusinessUnit(buBean);

			ContractorDtls contractorDtls = candidateDtlsDomain.getContractorDtls();
			if(null != contractorDtls){
				ContractorDtlsBean contractorDtlsBean = new ContractorDtlsBean();
				BeanUtils.copyProperties(contractorDtls, contractorDtlsBean);
				candidateDtlsBean.setContractorDtls(contractorDtlsBean);
			}
			
			BeanUtils.copyProperties(candidateDtlsDomain, candidateDtlsBean);

			Set<SalaryDetailsBean> salarySet = new HashSet<>();
			for (SalaryDetails salaryDtls : candidateDtlsDomain.getSalaryDetails()) {
				SalaryDetailsBean salaryDtlsBean = new SalaryDetailsBean();
				if(null != salaryDtls.getPreviousEmployment()){
					PreviousEmploymentBean preEmployementBean = new PreviousEmploymentBean();
					BeanUtils.copyProperties(salaryDtls.getPreviousEmployment(), preEmployementBean);
					salaryDtlsBean.setPreviousEmployment(preEmployementBean); 
				}
				BeanUtils.copyProperties(salaryDtls, salaryDtlsBean);
				salarySet.add(salaryDtlsBean);
			}
			candidateDtlsBean.setSalaryDetails(salarySet);
			
			Set<RemarksDetailsBean> remarkSet = new HashSet<>();
			for (RemarksDetails remarkDtls : candidateDtlsDomain.getRemarksDetails()) {
				RemarksDetailsBean remarkDtlsBean = new RemarksDetailsBean();
				BeanUtils.copyProperties(remarkDtls, remarkDtlsBean);
				remarkSet.add(remarkDtlsBean);
			}
			candidateDtlsBean.setRemarksDetails(remarkSet);
			
			Set<EmploymentBean> employmentSet = new HashSet<>();
			for (Employment employmentDtls : candidateDtlsDomain.getEmployment()) {
				EmploymentBean employmentBean = new EmploymentBean();
				BeanUtils.copyProperties(employmentDtls, employmentBean);
				employmentSet.add(employmentBean);
			}
			candidateDtlsBean.setEmployment(employmentSet);
			
		}
		return candidateDtlsBean;
	}
}
