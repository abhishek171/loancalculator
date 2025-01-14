package com.request;

import java.math.BigInteger;

public class LoanDetailsRequest {
	private Integer desiredLoanAmount;
	
	private Integer annualIncome;
	
	private String loanPurpose;
	
	private Double interestRate;
	
	private Double loanDuration;
	
	private String firstName;
	
	private String lastName;
	
	private String birthDate;
	
	private String maritalStatus;
	
	private String email;
	
	private BigInteger phoneNo;
	
	private String streetAddress;
	
	private String city;
	
	private String state;
	
	private Integer zipCode;
	
	private String companyName;
	
	private String occupation;
	
	private String experience;
	
	private Integer grossMonthlyIncome;
	
	private Boolean consent;
	
	private Boolean agreement;
	
	private long userId;

	public Integer getDesiredLoanAmount() {
		return desiredLoanAmount;
	}

	public void setDesiredLoanAmount(Integer desiredLoanAmount) {
		this.desiredLoanAmount = desiredLoanAmount;
	}

	public Integer getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Integer annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getLoanPurpose() {
		return loanPurpose;
	}

	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Double getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(Double loanDuration) {
		this.loanDuration = loanDuration;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigInteger getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(BigInteger phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Integer getGrossMonthlyIncome() {
		return grossMonthlyIncome;
	}

	public void setGrossMonthlyIncome(Integer grossMonthlyIncome) {
		this.grossMonthlyIncome = grossMonthlyIncome;
	}

	public Boolean getConsent() {
		return consent;
	}

	public void setConsent(Boolean consent) {
		this.consent = consent;
	}

	public Boolean getAgreement() {
		return agreement;
	}

	public void setAgreement(Boolean agreement) {
		this.agreement = agreement;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
}
