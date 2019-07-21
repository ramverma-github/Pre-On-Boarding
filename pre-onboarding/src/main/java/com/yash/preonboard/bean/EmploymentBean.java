package com.yash.preonboard.bean;

import java.util.Date;

import com.google.gson.annotations.Expose;

public class EmploymentBean {

	@Expose
	private Integer employmentId;

	@Expose
	private Integer RRF_Id;

	@Expose
	private String baseLocation;

	@Expose
	private String reportingLocation;

	@Expose
	private String reportingTo;

	@Expose
	private String natureOfHiring;

	@Expose
	private String clientFor;

	@Expose
	private Date offerYear;

	@Expose
	private String talentAdvisor;

	@Expose
	private String PHV_Initiated;

	@Expose
	private String serviceAgreementTenure;

	@Expose
	private Boolean guestHouse;

	@Expose
	private Date createdDate;

	@Expose
	private Date updatedDate;
	
	@Expose
	private CandidateDetailsBean candidateDetails;

	public Integer getEmploymentId() {
		return employmentId;
	}

	public CandidateDetailsBean getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetailsBean candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	public void setEmploymentId(Integer employmentId) {
		this.employmentId = employmentId;
	}

	public Integer getRRF_Id() {
		return RRF_Id;
	}

	public void setRRF_Id(Integer rRF_Id) {
		RRF_Id = rRF_Id;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public String getReportingLocation() {
		return reportingLocation;
	}

	public void setReportingLocation(String reportingLocation) {
		this.reportingLocation = reportingLocation;
	}

	public String getReportingTo() {
		return reportingTo;
	}

	public void setReportingTo(String reportingTo) {
		this.reportingTo = reportingTo;
	}

	public String getNatureOfHiring() {
		return natureOfHiring;
	}

	public void setNatureOfHiring(String natureOfHiring) {
		this.natureOfHiring = natureOfHiring;
	}

	public String getClientFor() {
		return clientFor;
	}

	public void setClientFor(String clientFor) {
		this.clientFor = clientFor;
	}

	public Date getOfferYear() {
		return offerYear;
	}

	public void setOfferYear(Date offerYear) {
		this.offerYear = offerYear;
	}

	public String getTalentAdvisor() {
		return talentAdvisor;
	}

	public void setTalentAdvisor(String talentAdvisor) {
		this.talentAdvisor = talentAdvisor;
	}

	public String getPHV_Initiated() {
		return PHV_Initiated;
	}

	public void setPHV_Initiated(String pHV_Initiated) {
		PHV_Initiated = pHV_Initiated;
	}

	public String getServiceAgreementTenure() {
		return serviceAgreementTenure;
	}

	public void setServiceAgreementTenure(String serviceAgreementTenure) {
		this.serviceAgreementTenure = serviceAgreementTenure;
	}

	public Boolean getGuestHouse() {
		return guestHouse;
	}

	public void setGuestHouse(Boolean guestHouse) {
		this.guestHouse = guestHouse;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
