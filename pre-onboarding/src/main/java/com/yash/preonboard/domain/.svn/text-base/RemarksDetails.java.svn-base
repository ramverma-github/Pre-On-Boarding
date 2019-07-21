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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author himanshu.chaturvedi
 *
 */

@Entity
@Table(name = "REMARKS_DTLS")
public class RemarksDetails implements Serializable {

	private static final long serialVersionUID = -5349566694604829379L;

	@Id
	@NotNull
	@Column(name = "REMARK_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqid-gen")
	@SequenceGenerator(name = "seqid-gen", sequenceName = "RemarksDetails_SEQ", allocationSize = 1, initialValue = 0)
	private Integer remarkId;

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CANDIDATE_ID")
	private CandidateDetails candidateDetails;

	/**
	 * @return the candidateDetails
	 */
	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	/**
	 * @param candidateDetails
	 *            the candidateDetails to set
	 */
	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	/**
	 * @return the remarkId
	 */
	public Integer getRemarkId() {
		return remarkId;
	}

	/**
	 * @param remarkId
	 *            the remarkId to set
	 */
	public void setRemarkId(Integer remarkId) {
		this.remarkId = remarkId;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
