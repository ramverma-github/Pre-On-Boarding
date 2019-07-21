package com.yash.preonboard.bean;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.Expose;

public class ContractorDtlsBean  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7868473782520855128L;

	@Expose
	private Integer contractorId;
	
	@Expose
	private String contractorClientLocation;
	
	@Expose
	private String vendorName;
	
	@Expose
	private String contractDuration;
	
	@Expose
	private String rateType;
	
	@Expose
	private String resourceBuyingRate;
	
	@Expose
	private String yashBillingAtClient;
	
	@Expose
	private String dealMargin;
	
	@Expose
	private String profitability;
	
	@Expose
	private String contractType;

	@Expose
	private String paymentTermWithPartnerCompany;
	
	@Expose
	private String partnerPayment;
	
	@Expose
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
