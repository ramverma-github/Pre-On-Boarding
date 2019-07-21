package com.yash.preonboard.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="CONTRACTOR_DTLS")
public class ContractorDtls implements Serializable{

	private static final long serialVersionUID = -6605456272544049388L;

	@Id
	@NotNull
	@Column(name = "CONTRACTOR_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqid-gen")
	@SequenceGenerator(name = "seqid-gen", sequenceName = "ContractorDtls_SEQ", allocationSize = 1, initialValue = 0)
	private Integer contractorId;
	
	@Column(name = "CONTRACTOR_CLIENT_LOCATION")
	private String contractorClientLocation;
	
	@Column(name = "VENDOR_NAME")
	private String vendorName;
	
	@Column(name = "CONTRACT_DURATION")
	private String contractDuration;
	
	@Column(name = "RATE_TYPE")
	private String rateType;
	
	@Column(name = "RESOURCE_BUYING_RATE")
	private String resourceBuyingRate;
	
	@Column(name = "YASH_BILLING_AT_CLIENT")
	private String yashBillingAtClient;
	
	@Column(name = "DEAL_MARGIN")
	private String dealMargin;
	
	@Column(name = "PROFITABILITY")
	private String profitability;
	
	@Column(name = "CONTRACT_TYPE")
	private String contractType;
	
	@Column(name = "PAYMENT_TERM")
	private String paymentTermWithPartnerCompany;
	
	@Column(name = "PARTNER_PAYMENT")
	private String partnerPayment;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	public Integer getContractorId() {
		return contractorId;
	}

	public void setContractorId(Integer contractorId) {
		this.contractorId = contractorId;
	}

	public String getContractorClientLocation() {
		return contractorClientLocation;
	}

	public void setContractorClientLocation(String contractorClientLocation) {
		this.contractorClientLocation = contractorClientLocation;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}

	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getResourceBuyingRate() {
		return resourceBuyingRate;
	}

	public void setResourceBuyingRate(String resourceBuyingRate) {
		this.resourceBuyingRate = resourceBuyingRate;
	}

	public String getYashBillingAtClient() {
		return yashBillingAtClient;
	}

	public void setYashBillingAtClient(String yashBillingAtClient) {
		this.yashBillingAtClient = yashBillingAtClient;
	}

	public String getDealMargin() {
		return dealMargin;
	}

	public void setDealMargin(String dealMargin) {
		this.dealMargin = dealMargin;
	}

	public String getProfitability() {
		return profitability;
	}

	public void setProfitability(String profitability) {
		this.profitability = profitability;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getPaymentTermWithPartnerCompany() {
		return paymentTermWithPartnerCompany;
	}

	public void setPaymentTermWithPartnerCompany(String paymentTermWithPartnerCompany) {
		this.paymentTermWithPartnerCompany = paymentTermWithPartnerCompany;
	}

	public String getPartnerPayment() {
		return partnerPayment;
	}

	public void setPartnerPayment(String partnerPayment) {
		this.partnerPayment = partnerPayment;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
