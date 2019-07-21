package com.yash.preonboard.service;

import static com.yash.preonboard.literals.OfferDetailLiterals.*;

import java.util.HashMap;
import java.util.Map;

public abstract class PDFServiceHelper {

	public Map<Integer, String> populateHashMap() {

		Map<Integer, String> mapOfKeys = new HashMap<Integer, String>();

		mapOfKeys.put(0, language);
		mapOfKeys.put(1, selectOfferTemplate);
		mapOfKeys.put(2, requisitionID);
		mapOfKeys.put(3, candidateFullName);
		mapOfKeys.put(4, emailAddress);
		mapOfKeys.put(5, primarySkill);
		mapOfKeys.put(6, proposedDesignation);
		mapOfKeys.put(7, proposedJobGrade);
		mapOfKeys.put(8, primaryLocation);
		mapOfKeys.put(9, reportingLocation);
		mapOfKeys.put(10, businessGroup);
		mapOfKeys.put(11, businessUnit);
		mapOfKeys.put(12, proposedDOJ);
		mapOfKeys.put(13, businessUnitHead);
		mapOfKeys.put(14, businessGroupHead);
		mapOfKeys.put(15, totalAnnualCTC);
		mapOfKeys.put(16, totalAnnualCTCInWords);
		mapOfKeys.put(17, grossAnnualSalaryfixedInRs);
		mapOfKeys.put(18, grossAnnualSalaryFixedInWords);
		mapOfKeys.put(19, grossAnnualSalaryvariableInRs);
		mapOfKeys.put(20, grossAnnualSalaryVariableInWords);
		mapOfKeys.put(21, salaryIncrease);
		mapOfKeys.put(22, variablePayoutMode);
		mapOfKeys.put(23, payrollOrganization);
		mapOfKeys.put(24, joiningBonus);
		mapOfKeys.put(25, joiningBonusInWords);
		mapOfKeys.put(26, instalments);
		mapOfKeys.put(27, noticePeriodBuyout);
		mapOfKeys.put(28, termsOfPayment);
		mapOfKeys.put(29, serviceAgreement);
		mapOfKeys.put(30, serviceAgreementInRs);
		mapOfKeys.put(31, referralEmpId);
		mapOfKeys.put(32, referralAmount);
		mapOfKeys.put(33, referralTermsOfPayment);
		mapOfKeys.put(34, approvedFromBGH);
		mapOfKeys.put(35, remarkForAny);

		return mapOfKeys;

	}

	public Map<String, String> populateKeyValueMap() {

		Map<String, String> keyValueMap = new HashMap<String, String>();

		keyValueMap.put(language, "language");
		keyValueMap.put(selectOfferTemplate, "selectOfferTemplate");
		keyValueMap.put(requisitionID, "requisitionID");
		keyValueMap.put(candidateFullName, "candidateFullName");
		keyValueMap.put(emailAddress, "emailAddress");
		keyValueMap.put(primarySkill, "primarySkill");
		keyValueMap.put(proposedDesignation, "proposedDesignation");
		keyValueMap.put(proposedJobGrade, "proposedJobGrade");
		keyValueMap.put(primaryLocation, "primaryLocation");
		keyValueMap.put(reportingLocation, "reportingLocation");
		keyValueMap.put(businessGroup, "businessGroup");
		keyValueMap.put(businessUnit, "businessUnit");
		keyValueMap.put(proposedDOJ, "proposedDOJ");
		keyValueMap.put(businessUnitHead, "businessUnitHead");
		keyValueMap.put(businessGroupHead, "businessGroupHead");
		keyValueMap.put(totalAnnualCTC, "totalAnnualCTC");
		keyValueMap.put(totalAnnualCTCInWords, "totalAnnualCTCInWords");
		keyValueMap.put(grossAnnualSalaryfixedInRs, "grossAnnualSalaryfixedInRs");
		keyValueMap.put(grossAnnualSalaryFixedInWords, "grossAnnualSalaryFixedInWords");
		keyValueMap.put(grossAnnualSalaryvariableInRs, "grossAnnualSalaryvariableInRs");
		keyValueMap.put(grossAnnualSalaryVariableInWords, "grossAnnualSalaryVariableInWords");
		keyValueMap.put(salaryIncrease, "salaryIncrease");
		keyValueMap.put(variablePayoutMode, "variablePayoutMode");
		keyValueMap.put(payrollOrganization, "payrollOrganization");
		keyValueMap.put(joiningBonus, "joiningBonus");
		keyValueMap.put(joiningBonusInWords, "joiningBonusInWords");
		keyValueMap.put(instalments, "instalments");
		keyValueMap.put(noticePeriodBuyout, "noticePeriodBuyout");
		keyValueMap.put(termsOfPayment, "termsOfPayment");
		keyValueMap.put(serviceAgreement, "serviceAgreement");
		keyValueMap.put(serviceAgreementInRs, "serviceAgreementInRs");
		keyValueMap.put(referralEmpId, "referralEmpId");
		keyValueMap.put(referralAmount, "referralAmount");
		keyValueMap.put(referralTermsOfPayment, "referralTermsOfPayment");
		keyValueMap.put(approvedFromBGH, "approvedFromBGH");
		keyValueMap.put(remarkForAny, "remarkForAny");

		return keyValueMap;

	}

	public Map<Integer, String> populateHashMapForTraineePositions() {

		Map<Integer, String> mapOfKeys = new HashMap<Integer, String>();

		mapOfKeys.put(0, language);
		mapOfKeys.put(1, selectOfferTemplate);
		mapOfKeys.put(2, requisitionID);
		mapOfKeys.put(3, candidateFullName);
		mapOfKeys.put(4, emailAddress);
		mapOfKeys.put(5, primarySkill);
		mapOfKeys.put(6, proposedDesignation);
		mapOfKeys.put(7, proposedJobGrade);
		mapOfKeys.put(8, primaryLocation);
		mapOfKeys.put(9, reportingLocation);
		mapOfKeys.put(10, businessGroup);
		mapOfKeys.put(11, businessUnit);
		mapOfKeys.put(12, proposedDOJ);
		mapOfKeys.put(13, businessUnitHead);
		mapOfKeys.put(14, businessGroupHead);
		mapOfKeys.put(15, totalAnnualCTC);
		mapOfKeys.put(16, totalAnnualCTCInWords);
		mapOfKeys.put(17, grossAnnualSalaryfixedInRs);
		mapOfKeys.put(18, grossAnnualSalaryFixedInWords);
		mapOfKeys.put(19, grossAnnualSalaryvariableInRs);
		mapOfKeys.put(20, grossAnnualSalaryVariableInWords);
		mapOfKeys.put(21, variablePayoutMode);
		mapOfKeys.put(22, payrollOrganization);
		mapOfKeys.put(23, serviceAgreement);
		mapOfKeys.put(24, serviceAgreementInRs);
		mapOfKeys.put(25, referralEmpId);
		mapOfKeys.put(26, approvedFromBGH);
		mapOfKeys.put(27, remarkForAny);
		mapOfKeys.put(28, comment);
		/*
		 * mapOfKeys.put(29, status); mapOfKeys.put(30, approver1);
		 * mapOfKeys.put(31, approver2); mapOfKeys.put(32, approver3);
		 */

		return mapOfKeys;

	}

	public Map<String, String> populateKeyValueMapforTraineePositions() {

		Map<String, String> keyValueMap = new HashMap<String, String>();

		keyValueMap.put(language, "language");
		keyValueMap.put(selectOfferTemplate, "selectOfferTemplate");
		keyValueMap.put(requisitionID, "requisitionID");
		keyValueMap.put(candidateFullName, "candidateFullName");
		keyValueMap.put(emailAddress, "emailAddress");
		keyValueMap.put(primarySkill, "primarySkill");
		keyValueMap.put(proposedDesignation, "proposedDesignation");
		keyValueMap.put(proposedJobGrade, "proposedJobGrade");
		keyValueMap.put(primaryLocation, "primaryLocation");
		keyValueMap.put(reportingLocation, "reportingLocation");
		keyValueMap.put(businessGroup, "businessGroup");
		keyValueMap.put(businessUnit, "businessUnit");
		keyValueMap.put(proposedDOJ, "proposedDOJ");
		keyValueMap.put(businessUnitHead, "businessUnitHead");
		keyValueMap.put(businessGroupHead, "businessGroupHead");
		keyValueMap.put(totalAnnualCTC, "totalAnnualCTC");
		keyValueMap.put(totalAnnualCTCInWords, "totalAnnualCTCInWords");
		keyValueMap.put(grossAnnualSalaryfixedInRs, "grossAnnualSalaryfixedInRs");
		keyValueMap.put(grossAnnualSalaryFixedInWords, "grossAnnualSalaryFixedInWords");
		keyValueMap.put(grossAnnualSalaryvariableInRs, "grossAnnualSalaryvariableInRs");
		keyValueMap.put(grossAnnualSalaryVariableInWords, "grossAnnualSalaryVariableInWords");
		keyValueMap.put(variablePayoutMode, "variablePayoutMode");
		keyValueMap.put(payrollOrganization, "payrollOrganization");
		keyValueMap.put(serviceAgreement, "serviceAgreement");
		keyValueMap.put(serviceAgreementInRs, "serviceAgreementInRs");
		keyValueMap.put(referralEmpId, "referralEmpId");
		keyValueMap.put(approvedFromBGH, "approvedFromBGH");
		keyValueMap.put(remarkForAny, "remarkForAny");
		keyValueMap.put(comment, "comment");
		/*
		 * keyValueMap.put(status, "status"); keyValueMap.put(approver1,
		 * "approver1"); keyValueMap.put(approver2, "approver2");
		 * keyValueMap.put(approver3, "approver3");
		 */

		return keyValueMap;

	}

	public Map<Integer, String> populateHashMapForContractor() {

		Map<Integer, String> mapOfKeys = new HashMap<Integer, String>();

		mapOfKeys.put(0, language);
		mapOfKeys.put(1, selectOfferTemplate);
		mapOfKeys.put(2, requisitionID);
		mapOfKeys.put(3, contratorFullName);
		mapOfKeys.put(4, emailAddress);
		mapOfKeys.put(5, primarySkill);
		mapOfKeys.put(6, proposedDesignation);
		mapOfKeys.put(7, proposedJobGrade);
		mapOfKeys.put(8, primaryLocation);
		mapOfKeys.put(9, reportingLocation);
		mapOfKeys.put(10, contractorClientLocation);
		mapOfKeys.put(11, businessGroup);
		mapOfKeys.put(12, businessUnit);
		mapOfKeys.put(13, proposedDOJ);
		mapOfKeys.put(14, businessUnitHead);
		mapOfKeys.put(15, businessGroupHead);
		mapOfKeys.put(16, clientName);
		mapOfKeys.put(17, employmentType);
		mapOfKeys.put(18, vendorOrPartnerName);
		mapOfKeys.put(19, contractDuration);
		mapOfKeys.put(20, rateType);
		mapOfKeys.put(21, resourceBuyingRate);
		mapOfKeys.put(22, yashBillingAtClient);
		mapOfKeys.put(23, dealMargin);
		mapOfKeys.put(24, profitability);
		mapOfKeys.put(25, contractType);
		mapOfKeys.put(26, paymentTermWithPartnerCompany);
		mapOfKeys.put(27, partnerPayment);
		mapOfKeys.put(28, status);
		

		return mapOfKeys;

	}

	public Map<String, String> populateKeyValueMapforContractor() {

		Map<String, String> keyValueMap = new HashMap<String, String>();

		keyValueMap.put(language, "language");
		keyValueMap.put(selectOfferTemplate, "selectOfferTemplate");
		keyValueMap.put(requisitionID, "requisitionID");
		keyValueMap.put(contratorFullName, "contratorFullName");
		keyValueMap.put(emailAddress, "emailAddress");
		keyValueMap.put(primarySkill, "primarySkill");
		keyValueMap.put(proposedDesignation, "proposedDesignation");
		keyValueMap.put(proposedJobGrade, "proposedJobGrade");
		keyValueMap.put(primaryLocation, "primaryLocation");
		keyValueMap.put(reportingLocation, "reportingLocation");
		keyValueMap.put(contractorClientLocation, "contractorClientLocation");
		keyValueMap.put(businessGroup, "businessGroup");
		keyValueMap.put(businessUnit, "businessUnit");
		keyValueMap.put(proposedDOJ, "proposedDOJ");
		keyValueMap.put(businessUnitHead, "businessUnitHead");
		keyValueMap.put(businessGroupHead, "businessGroupHead");
		keyValueMap.put(clientName, "clientName");
		keyValueMap.put(employmentType, "employmentType");
		keyValueMap.put(vendorOrPartnerName, "vendorOrPartnerName");
		keyValueMap.put(contractDuration, "contractDuration");
		keyValueMap.put(rateType, "rateType");
		keyValueMap.put(resourceBuyingRate, "resourceBuyingRate");
		keyValueMap.put(yashBillingAtClient, "yashBillingAtClient");
		keyValueMap.put(dealMargin, "dealMargin");
		keyValueMap.put(profitability, "profitability");
		keyValueMap.put(contractType, "contractType");
		keyValueMap.put(paymentTermWithPartnerCompany, "paymentTermWithPartnerCompany");
		keyValueMap.put(partnerPayment, "partnerPayment"); 
		keyValueMap.put(status, "Status"); 
		

		return keyValueMap;

	}

}
