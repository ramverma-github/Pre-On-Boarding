package com.yash.preonboard.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "EMPLOYMENT_DTLS")
public class Employment {

	@Id
	@NotNull
	@Column(name = "EMP_DTL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqid-gen")
	@SequenceGenerator(name = "seqid-gen", sequenceName = "Employment_SEQ", allocationSize = 1, initialValue = 0)
	private Integer employmentId;

	@Column(name = "RRF_ID")
	private Integer RRF_Id;

	@Column(name = "BASE_LOCATION")
	private String baseLocation;

	@Column(name = "REPORTING_LOCATION")
	private String reportingLocation;

	@Column(name = "REPORTING_TO")
	private String reportingTo;

	@Column(name = "NATURE_OF_HIRING")
	private String natureOfHiring;

	@Column(name = "CLIENT_FOR")
	private String clientFor;

	@Column(name = "OFFER_YEAR")
	private Date offerYear;

	@Column(name = "TALENT_ADVISOR")
	private String talentAdvisor;

	@Column(name = "PHV_INITIATED")
	private String PHV_Initiated;

	@Column(name = "SERVICE_AGRMT_TENURE")
	private String serviceAgreementTenure;
	
	@Column(name = "SERVICE_AGRMT_AMOUNT")
	private String serviceAgreementAmount;

	@Column(name = "GUEST_HOUSE")
	private Boolean guestHouse;

	@Column(name = "CREATED_DATE", updatable=false)
	private Date createdDate;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	public Integer getEmploymentId() {
		return employmentId;
	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CANDIDATE_ID")
	private CandidateDetails candidateDetails;

	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetails candidateDetails) {
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

	public String getServiceAgreementAmount() {
		return serviceAgreementAmount;
	}

	public void setServiceAgreementAmount(String serviceAgreementAmount) {
		this.serviceAgreementAmount = serviceAgreementAmount;
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
