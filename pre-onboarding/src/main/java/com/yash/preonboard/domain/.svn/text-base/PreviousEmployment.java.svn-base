package com.yash.preonboard.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PREVIOUS_EMPLOYMENT")
public class PreviousEmployment implements Serializable {

	private static final long serialVersionUID = 2520188802170832568L;

	@Id
	@NotNull
	@Column(name = "PRE_EMP_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqid-gen")
	@SequenceGenerator(name = "seqid-gen", sequenceName = "PreviousEmployment_SEQ", allocationSize = 1, initialValue = 0)
	private Integer previousEmploymentId;

	@Column(name = "PREVIOUS_EMPLOYER_NAME")
	private String previousEmployerName;

	@Column(name = "PREVIOUS_LOCATION")
	private String previousLocation;

	public Integer getPreviousEmploymentId() {
		return previousEmploymentId;
	}

	public void setPreviousEmploymentId(Integer previousEmploymentId) {
		this.previousEmploymentId = previousEmploymentId;
	}

	public String getPreviousEmployerName() {
		return previousEmployerName;
	}

	public void setPreviousEmployerName(String previousEmployerName) {
		this.previousEmployerName = previousEmployerName;
	}

	public String getPreviousLocation() {
		return previousLocation;
	}

	public void setPreviousLocation(String previousLocation) {
		this.previousLocation = previousLocation;
	}
	
	
}
