/**
 * 
 */
package com.yash.preonboard.domain;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SALARY_DTLS")
public class SalaryDetails implements Serializable {

	private static final long serialVersionUID = -6670365037922108814L;

	@Id
	@NotNull
	@Column(name = "SALARY_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqid-gen")
	@SequenceGenerator(name = "seqid-gen", sequenceName = "SalaryDetails_SEQ", allocationSize = 1, initialValue = 0)
	private Integer salaryId;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "PRE_EMP_ID")
	private PreviousEmployment previousEmployment;

	@Column(name = "CTC")
	private String ctc;

	@Column(name = "VARIABLE")
	private String variable;

	@Column(name = "JOINING_BONUS")
	private String joiningBonus;

	@Column(name = "VARIABLE_PAYOUT_MODE")
	private String variablePayoutMode;

	@Column(name = "SALARY_INCREASED")
	private String salaryIncreased;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CANDIDATE_ID")
	private CandidateDetails candidateDetails;

	public Integer getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(Integer salaryId) {
		this.salaryId = salaryId;
	}

	public PreviousEmployment getPreviousEmployment() {
		return previousEmployment;
	}

	public void setPreviousEmployment(PreviousEmployment previousEmployment) {
		this.previousEmployment = previousEmployment;
	}

	public String getCtc() {
		return ctc;
	}

	public void setCtc(String ctc) {
		this.ctc = ctc;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getJoiningBonus() {
		return joiningBonus;
	}

	public void setJoiningBonus(String joiningBonus) {
		this.joiningBonus = joiningBonus;
	}

	public String getVariablePayoutMode() {
		return variablePayoutMode;
	}

	public void setVariablePayoutMode(String variablePayoutMode) {
		this.variablePayoutMode = variablePayoutMode;
	}

	public String getSalaryIncreased() {
		return salaryIncreased;
	}

	public void setSalaryIncreased(String salaryIncreased) {
		this.salaryIncreased = salaryIncreased;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
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

	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	
}
