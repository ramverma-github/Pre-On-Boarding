package com.yash.preonboard.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BUSINESS_UNIT")
@NamedQueries({
	@NamedQuery(name = "BusinessUnit.getAllBusinessUnits", query = "SELECT bu FROM BusinessUnit bu") })
public class BusinessUnit implements Serializable {

	private static final long serialVersionUID = 2393750332127219762L;

	@Id
	@NotNull
	@Column(name = "BU_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqid-gen")
	@SequenceGenerator(name = "seqid-gen", sequenceName = "BusinessUnit_SEQ", allocationSize = 1, initialValue = 0)
	private Integer businessUnitId;

	@Column(name = "BUSINESS_UNIT")
	private String businessUnit;

	@Column(name = "BUSINESS_UNIT_HEAD")
	private String businessUnitHead;

	@OneToMany(mappedBy = "businessUnit")
	private Set<CandidateDetails> candidateDetails;

	public Integer getBusinessUnitId() {
		return businessUnitId;
	}

	public void setBusinessUnitId(Integer businessUnitId) {
		this.businessUnitId = businessUnitId;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getBusinessUnitHead() {
		return businessUnitHead;
	}

	public void setBusinessUnitHead(String businessUnitHead) {
		this.businessUnitHead = businessUnitHead;
	}

	public Set<CandidateDetails> getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(Set<CandidateDetails> candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

}
