package com.entity;

import java.math.BigInteger;

import com.request.LoanDetailsRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loanformdetails")
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "desired_loan_amount")
	private Integer desiredLoanAmount;
	
	@Column(name = "annual_income")
	private Integer annualIncome;
	
	@Column(name = "loan_purpose")
	private String loanPurpose;
	
	@Column(name = "interest_rate")
	private Double interestRate;
	
	@Column(name = "loan_duration")
	private Double loanDuration;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "birth_date")
	private String birthDate;
	
	@Column(name = "marital_status")
	private String maritalStatus;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_no")
	private BigInteger phoneNo;
	
	@Column(name = "street_address")
	private String streetAddress;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "pincode")
	private Integer pincode;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "occupation")
	private String occupation;
	
	@Column(name = "experience")
	private String experience;
	
	@Column(name = "gross_monthly_income")
	private Integer grossMonthlyIncome;
	
	@Column(name = "consent")
	private Boolean consent;
	
	@Column(name = "agreement")
	private Boolean agreement;
	
	@Column(name = "user_id")
	private long userId;

	public LoanDetails() {
		super();
	}
	
	public LoanDetails(LoanDetailsRequest loanDetailsRequest) {
		this.desiredLoanAmount = loanDetailsRequest.getDesiredLoanAmount();
		this.annualIncome = loanDetailsRequest.getAnnualIncome();
		this.loanPurpose = loanDetailsRequest.getLoanPurpose();
		this.interestRate = loanDetailsRequest.getInterestRate();
		this.loanDuration = loanDetailsRequest.getLoanDuration();
		this.firstName = loanDetailsRequest.getFirstName();
		this.lastName = loanDetailsRequest.getLastName();
		this.birthDate = loanDetailsRequest.getBirthDate();
		this.maritalStatus = loanDetailsRequest.getMaritalStatus();
		this.email = loanDetailsRequest.getEmail();
		this.phoneNo = loanDetailsRequest.getPhoneNo();
		this.streetAddress = loanDetailsRequest.getStreetAddress();
		this.city = loanDetailsRequest.getCity();
		this.state = loanDetailsRequest.getState();
		this.pincode = loanDetailsRequest.getZipCode();
		this.companyName = loanDetailsRequest.getCompanyName();
		this.occupation = loanDetailsRequest.getOccupation();
		this.experience = loanDetailsRequest.getExperience();
		this.grossMonthlyIncome = loanDetailsRequest.getGrossMonthlyIncome();
		this.consent = loanDetailsRequest.getConsent();
		this.agreement = loanDetailsRequest.getAgreement();
		this.userId = loanDetailsRequest.getUserId();
	}

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

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
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

	@Override
	public String toString() {
		return "LoanDetails [id=" + id + ", desiredLoanAmount=" + desiredLoanAmount + ", annualIncome=" + annualIncome
				+ ", loanPurpose=" + loanPurpose + ", interestRate=" + interestRate + ", loanDuration=" + loanDuration
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", maritalStatus=" + maritalStatus + ", email=" + email + ", phoneNo=" + phoneNo + ", streetAddress="
				+ streetAddress + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", companyName="
				+ companyName + ", occupation=" + occupation + ", experience=" + experience + ", grossMonthlyIncome="
				+ grossMonthlyIncome + ", consent=" + consent + ", agreement=" + agreement + ", userId=" + userId + "]";
	}
}
