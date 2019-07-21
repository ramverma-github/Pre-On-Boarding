package com.yash.preonboard.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.yash.preonboard.bean.CandidateFormBean;
import com.yash.preonboard.bean.PDFReaderBean;
import com.yash.preonboard.domain.BusinessGroup;
import com.yash.preonboard.domain.BusinessUnit;
import com.yash.preonboard.domain.CandidateDetails;
import com.yash.preonboard.domain.ContractorDtls;
import com.yash.preonboard.domain.Employment;
import com.yash.preonboard.domain.PreviousEmployment;
import com.yash.preonboard.domain.RemarksDetails;
import com.yash.preonboard.domain.SalaryDetails;

public class BeanToDomainHelper {

	private static final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

	public static CandidateDetails convertCandidateFormBeanToDomain(CandidateFormBean candidateFormBean) {
		CandidateDetails candidateDetails = new CandidateDetails();

		if (null != candidateFormBean.getRequisitionId() && !"".equals(candidateFormBean.getRequisitionId()))
			candidateDetails.setRequisitionID(Integer.parseInt(candidateFormBean.getRequisitionId()));

		if (null != candidateFormBean.getCndId() && !"".equals(candidateFormBean.getCndId()))
			candidateDetails.setCndId(Integer.parseInt(candidateFormBean.getCndId()));

		candidateDetails.setCndName(candidateFormBean.getCandidateName());
		candidateDetails.setContactNumber(candidateFormBean.getContactNumber());
		candidateDetails.setEmailId(candidateFormBean.getEmailId());
		candidateDetails.setSkillName(candidateFormBean.getSkill());
		candidateDetails.setGrade(candidateFormBean.getGrade());
		candidateDetails.setDesignation(candidateFormBean.getDesignation());
		candidateDetails.setOnboardingLeadTime(candidateFormBean.getOnboardingLeadtime());
		candidateDetails.setGender(candidateFormBean.getGender());
		candidateDetails.setGroupId(candidateFormBean.getGroup());
		candidateDetails.setRecruiter(candidateFormBean.getRecruiter());
		candidateDetails.setRefreeName(candidateFormBean.getRefreeName());
		candidateDetails.setSource(candidateFormBean.getSource());
		candidateDetails.setStatus(candidateFormBean.getStatus());
		candidateDetails.setTeamOwner(candidateFormBean.getTeamOwner());

		String dateOfJoing = candidateFormBean.getExpectedDateOfJoining().replace("/", "-");
		try {
			Date proposedDOJ = formatter.parse(dateOfJoing);
			candidateDetails.setExpctdDateOfJoining(proposedDOJ);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		candidateDetails.setEmploymentType(candidateFormBean.getEmploymentType());
		candidateDetails.setOfferAcknowledgement("Y");
		candidateDetails.setUpdatedDate(new Date());

		Employment employment = new Employment();
		Set<Employment> employmentSet = new HashSet<>();
		employment.setCandidateDetails(candidateDetails);

		if (null != candidateFormBean.getRequisitionId() && !"".equals(candidateFormBean.getRequisitionId()))
			employment.setRRF_Id(Integer.parseInt(candidateFormBean.getRequisitionId()));

		employment.setEmploymentId(Integer.parseInt(candidateFormBean.getEmploymentId()));
		employment.setBaseLocation(candidateFormBean.getPrimaryBaseLocation());
		employment.setReportingLocation(candidateFormBean.getReportingLocation());
		employment.setUpdatedDate(new Date(System.currentTimeMillis()));
		employment.setGuestHouse(Boolean.FALSE);
		employment.setReportingTo(candidateFormBean.getReportingTo());
		employment.setNatureOfHiring(candidateFormBean.getNatureOfHiring());
		employment.setClientFor(candidateFormBean.getClient());
		employment.setServiceAgreementTenure(candidateFormBean.getServiceAgreementTenure());
		employment.setServiceAgreementAmount(candidateFormBean.getServiceAgreementAmount());// Need
																							// to
																							// check
		employment.setTalentAdvisor(candidateFormBean.getTalentAdvisor());
		employmentSet.add(employment);

		RemarksDetails remarksDetails = new RemarksDetails();
		Set<RemarksDetails> remarkSet = new HashSet<>();
		remarksDetails.setCandidateDetails(candidateDetails);
		remarksDetails.setRemarks(candidateFormBean.getRemarks());
		// remarksDetails.setCreatedBy("RAM");
		remarksDetails.setCreatedDate(new Date());
		remarkSet.add(remarksDetails);

		candidateDetails.setEmployment(employmentSet);
		candidateDetails.setRemarksDetails(remarkSet);

		SalaryDetails proposedSalaryDetails = new SalaryDetails();
		Set<SalaryDetails> salaryDetailsSet = new HashSet<>();
		if (null != candidateFormBean.getSalaryId() && !"".equals(candidateFormBean.getSalaryId()))
			proposedSalaryDetails.setSalaryId(Integer.parseInt(candidateFormBean.getSalaryId()));
		proposedSalaryDetails.setCandidateDetails(candidateDetails);
		proposedSalaryDetails.setCtc(candidateFormBean.getProposedFixedSalary());
		proposedSalaryDetails.setVariable(candidateFormBean.getProposedVariableSalary());
		proposedSalaryDetails.setSalaryIncreased(candidateFormBean.getHikePercent());
		proposedSalaryDetails.setUpdatedDate(new Date(System.currentTimeMillis()));
		proposedSalaryDetails.setJoiningBonus(candidateFormBean.getJoiningBonus());

		SalaryDetails previousSalaryDetails = new SalaryDetails();
		PreviousEmployment previousEmployment = new PreviousEmployment();
		previousEmployment.setPreviousEmployerName(candidateFormBean.getCurrentEmployer());
		previousEmployment.setPreviousLocation(candidateFormBean.getCurrentLocation());
		previousSalaryDetails.setPreviousEmployment(previousEmployment);
		previousSalaryDetails.setCandidateDetails(candidateDetails);
		previousSalaryDetails.setCtc(candidateFormBean.getPresentFixedCTC());
		previousSalaryDetails.setVariable(candidateFormBean.getPresentVariableCTC());
		previousSalaryDetails.setCreatedDate(new Date(System.currentTimeMillis()));

		salaryDetailsSet.add(proposedSalaryDetails);
		salaryDetailsSet.add(previousSalaryDetails);
		candidateDetails.setSalaryDetails(salaryDetailsSet);

		BusinessGroup businessGroup = new BusinessGroup();
		if (null != candidateFormBean.getBgId() && !"".equals(candidateFormBean.getBgId()))
			businessGroup.setBusinessGroupId(Integer.valueOf(candidateFormBean.getBgId()));
		businessGroup.setBusinessGroup(candidateFormBean.getBusinessGroup());
		businessGroup.setBusinessGroupHead(candidateFormBean.getBusinessGroupHead());
		candidateDetails.setBusinessGroup(businessGroup);

		BusinessUnit businessUnit = new BusinessUnit();
		if (null != candidateFormBean.getBuId() && !"".equals(candidateFormBean.getBuId()))
			businessUnit.setBusinessUnitId(Integer.valueOf(candidateFormBean.getBuId()));
		businessUnit.setBusinessUnit(candidateFormBean.getBusinessUnit());
		businessUnit.setBusinessUnitHead(candidateFormBean.getBusinessUnitHead());
		candidateDetails.setBusinessUnit(businessUnit);

		return candidateDetails;
	}

	public static CandidateDetails convertPDFBeanToCandidateDomain(PDFReaderBean pdfReaderBean,
			Map<String, BusinessUnit> buMap, Map<String, BusinessGroup> bgMap) {

		CandidateDetails candidateDetails = new CandidateDetails();

		candidateDetails.setRequisitionID(Integer.valueOf(pdfReaderBean.getRequisitionID()));
		candidateDetails.setCndName(pdfReaderBean.getCandidateFullName());
		candidateDetails.setEmailId(pdfReaderBean.getEmailAddress());

		candidateDetails.setSkillName(pdfReaderBean.getPrimarySkill());
		candidateDetails.setGrade(pdfReaderBean.getProposedJobGrade());
		candidateDetails.setDesignation(pdfReaderBean.getProposedDesignation());

		if (pdfReaderBean.getSelectOfferTemplate().equals("Trainee Positions Offer Detail Template")) {
			candidateDetails.setEmploymentType("Trainee");
		} else if (pdfReaderBean.getSelectOfferTemplate().equals("Full Time Positions Offer Detail Template")) {
			candidateDetails.setEmploymentType("Lateral");
		} else if (pdfReaderBean.getSelectOfferTemplate().equals("Contract Positions Offer Detail Template")) {
			candidateDetails.setEmploymentType(pdfReaderBean.getEmploymentType());
			candidateDetails.setCndName(pdfReaderBean.getContratorFullName());
		}
		Employment employment = new Employment();
		Set<Employment> employmentset = new HashSet<>();
		employment.setCandidateDetails(candidateDetails);
		employment.setRRF_Id(Integer.parseInt(pdfReaderBean.getRequisitionID()));
		employment.setBaseLocation(pdfReaderBean.getPrimaryLocation());
		employment.setReportingLocation(pdfReaderBean.getReportingLocation());
		employment.setCreatedDate(new Date(System.currentTimeMillis()));
		employment.setGuestHouse(Boolean.FALSE);
		if (pdfReaderBean.getSelectOfferTemplate().equals("Trainee Positions Offer Detail Template")) {
			employment.setNatureOfHiring("Trainee");
		} else if (pdfReaderBean.getSelectOfferTemplate().equals("Full Time Positions Offer Detail Template")) {
			employment.setNatureOfHiring("Lateral");
		} else if (pdfReaderBean.getSelectOfferTemplate().equals("Contract Positions Offer Detail Template")) {
			employment.setNatureOfHiring("Contractor");
		}
		employment.setReportingTo(
				buMap.get(StringUtilityHelper.getSubstring(pdfReaderBean.getBusinessUnit())).getBusinessUnitHead());
		employment.setServiceAgreementTenure(pdfReaderBean.getServiceAgreement());
		employment.setServiceAgreementAmount(pdfReaderBean.getServiceAgreementInRs());
		employmentset.add(employment);

		RemarksDetails remarksDetails = new RemarksDetails();
		Set<RemarksDetails> remarkSet = new HashSet<>();
		remarksDetails.setCandidateDetails(candidateDetails);
		remarksDetails.setRemarks(null);
		remarkSet.add(remarksDetails);
		candidateDetails.setRemarksDetails(remarkSet);

		// Previous Salary Calculation....
		/*
		 * long proposedCTC =
		 * Long.valueOf(pdfReaderBean.getTotalAnnualCTC().replace(",", ""));
		 * long salaryIncrease =
		 * Long.valueOf(pdfReaderBean.getSalaryIncrease().trim()); long
		 * previousCTC = 0; if(0 != proposedCTC && 0 != salaryIncrease){
		 * previousCTC = ((proposedCTC/salaryIncrease)*100); }
		 * System.out.println("previousCTC:::>>>>"+previousCTC);
		 */
		
	// This condition should be added after testing.
	//	if(!pdfReaderBean.getSelectOfferTemplate().equals("Contract Positions Offer Detail Template")){ 
			
			SalaryDetails salaryDetails = new SalaryDetails();
			Set<SalaryDetails> salaryDtlsSet = new HashSet<>();
			salaryDetails.setCandidateDetails(candidateDetails);
			salaryDetails.setCtc(pdfReaderBean.getTotalAnnualCTC());
			salaryDetails.setVariable(pdfReaderBean.getGrossAnnualSalaryvariableInRs());
			salaryDetails.setJoiningBonus(pdfReaderBean.getJoiningBonus());
			salaryDetails.setVariablePayoutMode(pdfReaderBean.getVariablePayoutMode());
			salaryDetails.setSalaryIncreased(pdfReaderBean.getSalaryIncrease());
			salaryDetails.setCreatedDate(new Date(System.currentTimeMillis()));
			salaryDtlsSet.add(salaryDetails);
			candidateDetails.setSalaryDetails(salaryDtlsSet);
	//	}
		candidateDetails
				.setBusinessGroup(bgMap.get(StringUtilityHelper.getSubstring(pdfReaderBean.getBusinessGroup())));
		candidateDetails.setBusinessUnit(buMap.get(StringUtilityHelper.getSubstring(pdfReaderBean.getBusinessUnit())));

		candidateDetails.setCreatedDate(new Date());
		candidateDetails.setEmailId(pdfReaderBean.getEmailAddress());
		candidateDetails.setEmployment(employmentset);

		String dateOfJoing = pdfReaderBean.getProposedDOJ().replace("/", "-");
		try {
			Date proposedDOJ = formatter.parse(dateOfJoing);
			candidateDetails.setExpctdDateOfJoining(proposedDOJ);
			Date currentDate = new Date();
			LocalDate proDate = proposedDOJ.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalDate nowDate = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			Long noOfDaysBetween = ChronoUnit.DAYS.between(nowDate, proDate);
			candidateDetails.setOnboardingLeadTime("" + noOfDaysBetween);

		} catch (ParseException e) {
			System.out.println("Date not converted..." + e);
		}

		if (null != employment.getNatureOfHiring() && employment.getNatureOfHiring().equals("Contractor")) {

			ContractorDtls contractorDtls = new ContractorDtls();
			contractorDtls.setContractorClientLocation(pdfReaderBean.getContractorClientLocation());
			contractorDtls.setVendorName(pdfReaderBean.getVendorOrPartnerName());
			contractorDtls.setContractDuration(pdfReaderBean.getContractDuration());
			contractorDtls.setRateType(pdfReaderBean.getRateType());
			contractorDtls.setResourceBuyingRate(pdfReaderBean.getResourceBuyingRate());
			contractorDtls.setYashBillingAtClient(pdfReaderBean.getYashBillingAtClient());
			contractorDtls.setDealMargin(pdfReaderBean.getDealMargin());
			contractorDtls.setProfitability(pdfReaderBean.getProfitability());
			contractorDtls.setContractType(pdfReaderBean.getContractType());
			contractorDtls.setPaymentTermWithPartnerCompany(pdfReaderBean.getPaymentTermWithPartnerCompany());
			contractorDtls.setPartnerPayment(pdfReaderBean.getPartnerPayment());
			contractorDtls.setCreatedDate(new Date());
			candidateDetails.setContractorDtls(contractorDtls);
		}
		candidateDetails.setOfferAcknowledgement("Y");

		return candidateDetails;
	}

}
