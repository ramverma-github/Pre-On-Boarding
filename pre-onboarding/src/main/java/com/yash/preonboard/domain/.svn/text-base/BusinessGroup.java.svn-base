package com.yash.preonboard.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "BUSINESS_GROUP")
@NamedQueries({
	@NamedQuery(name = "BusinessGroup.getBusinessGroup", query = "SELECT bg FROM BusinessGroup bg WHERE bg.businessGroup = :businessGroupName"),
	@NamedQuery(name = "BusinessGroup.getAllBusinessGroups", query = "SELECT bg FROM BusinessGroup bg")
})
public class BusinessGroup implements Serializable {

	private static final long serialVersionUID = -4250930866568428195L;

	@Id
	@NotNull
	@Column(name = "BG_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqid-gen")
	@SequenceGenerator(name = "seqid-gen", sequenceName = "BusinessGroup_SEQ", allocationSize = 1, initialValue = 0)
	private Integer businessGroupId;

	@Column(name = "BUSINESS_GROUP")
	private String businessGroup;

	@Column(name = "BUSINESS_GROUP_HEAD")
	private String businessGroupHead;

	@OneToMany(mappedBy="businessGroup",targetEntity=CandidateDetails.class,fetch=FetchType.LAZY)
	private Set<CandidateDetails> candidateDetails;

	public Integer getBusinessGroupId() {
		return businessGroupId;
	}
	
	public Set<CandidateDetails> getCandidateDetails() {
		return candidateDetails;
	}

	
	public void setCandidateDetails(Set<CandidateDetails> candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	public void setBusinessGroupId(Integer businessGroupId) {
		this.businessGroupId = businessGroupId;
	}

	public String getBusinessGroup() {
		return businessGroup;
	}

	public void setBusinessGroup(String businessGroup) {
		this.businessGroup = businessGroup;
	}

	public String getBusinessGroupHead() {
		return businessGroupHead;
	}

	public void setBusinessGroupHead(String businessGroupHead) {
		this.businessGroupHead = businessGroupHead;
	}

	
}
