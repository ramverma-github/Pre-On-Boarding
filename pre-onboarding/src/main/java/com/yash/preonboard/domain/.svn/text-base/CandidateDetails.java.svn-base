package com.yash.preonboard.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CANDIDATE_DTLS")
@NamedQueries({
		@NamedQuery(name = "CandidateDetails.findByEmailId", query = "SELECT cnd FROM CandidateDetails cnd WHERE cnd.emailId = :cndEmailId") })
public class CandidateDetails implements java.io.Serializable {

	private static final long serialVersionUID = 4464392170710875674L;

	@Id
	@NotNull
	@Column(name = "CANDIDATE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqid-gen")
	@SequenceGenerator(name = "seqid-gen", sequenceName = "CandidateDetails_SEQ", allocationSize = 1, initialValue = 0)
	private Integer cndId;

	@Column(name = "REQUISITION_ID")
	private Integer requisitionID;

	@Column(name = "CND_FULLNAME")
	private String cndName;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;

	@Column(name = "EMAIL_ID")//,unique=true)
	private String emailId;

	@ManyToOne
    @JoinColumn(name="CND_BG_ID")
	private BusinessGroup businessGroup;

	@ManyToOne
	@JoinColumn(name = "CND_BU_ID" )
	private BusinessUnit businessUnit;

	@Column(name = "GRADE")
	private String grade;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "SKILL_NAME")
	private String skillName;
	
	@Column(name = "EMPLOYMENT_TYPE")
	private String employmentType;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "CONTRACTOR_ID")
	private ContractorDtls contractorDtls;
	
	@Column(name = "CND_GROUP")
	private String groupId;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "SOURCE")
	private String source;

	@Column(name = "EXPCTD_DATE_OF_JOINING")
	private Date expctdDateOfJoining;

	@Column(name = "ONBOARDING_LEAD_TIME")
	private String onboardingLeadTime;

	@Column(name = "OFFER_ACK")
	private String offerAcknowledgement;
	
	@Column(name = "REFREE_NAME")
	private String refreeName;

	@Column(name = "TEAM_OWNER")
	private String teamOwner;

	@Column(name = "RECRUITER")
	private String recruiter;

	@Column(name = "CREATED_DATE", updatable=false)
	private Date createdDate;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	@Column(name = "END_DATE")
	private Date endDate;

	@OneToMany(mappedBy = "candidateDetails", cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<SalaryDetails> salaryDetails;

	@OneToMany(mappedBy = "candidateDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Employment> employment;

	@OneToMany(mappedBy = "candidateDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<RemarksDetails> remarksDetails;

	public Integer getCndId() {
		return cndId;
	}

	public void setCndId(Integer cndId) {
		this.cndId = cndId;
	}

	public Integer getRequisitionID() {
		return requisitionID;
	}

	public void setRequisitionID(Integer requisitionID) {
		this.requisitionID = requisitionID;
	}

	public String getCndName() {
		return cndName;
	}

	public void setCndName(String cndName) {
		this.cndName = cndName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public BusinessGroup getBusinessGroup() {
		return businessGroup;
	}

	public void setBusinessGroup(BusinessGroup businessGroup) {
		this.businessGroup = businessGroup;
	}

	public BusinessUnit getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(BusinessUnit businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public ContractorDtls getContractorDtls() {
		return contractorDtls;
	}

	public void setContractorDtls(ContractorDtls contractorDtls) {
		this.contractorDtls = contractorDtls;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getExpctdDateOfJoining() {
		return expctdDateOfJoining;
	}

	public void setExpctdDateOfJoining(Date expctdDateOfJoining) {
		this.expctdDateOfJoining = expctdDateOfJoining;
	}

	public String getOnboardingLeadTime() {
		return onboardingLeadTime;
	}

	public void setOnboardingLeadTime(String onboardingLeadTime) {
		this.onboardingLeadTime = onboardingLeadTime;
	}

	public String getOfferAcknowledgement() {
		return offerAcknowledgement;
	}

	public void setOfferAcknowledgement(String offerAcknowledgement) {
		this.offerAcknowledgement = offerAcknowledgement;
	}

	public String getRefreeName() {
		return refreeName;
	}

	public void setRefreeName(String refreeName) {
		this.refreeName = refreeName;
	}

	public String getTeamOwner() {
		return teamOwner;
	}

	public void setTeamOwner(String teamOwner) {
		this.teamOwner = teamOwner;
	}

	public String getRecruiter() {
		return recruiter;
	}

	public void setRecruiter(String recruiter) {
		this.recruiter = recruiter;
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

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Set<SalaryDetails> getSalaryDetails() {
		return salaryDetails;
	}

	public void setSalaryDetails(Set<SalaryDetails> salaryDetails) {
		this.salaryDetails = salaryDetails;
	}

	public Set<Employment> getEmployment() {
		return employment;
	}

	public void setEmployment(Set<Employment> employment) {
		this.employment = employment;
	}

	public Set<RemarksDetails> getRemarksDetails() {
		return remarksDetails;
	}

	public void setRemarksDetails(Set<RemarksDetails> remarksDetails) {
		this.remarksDetails = remarksDetails;
	}

	
}
