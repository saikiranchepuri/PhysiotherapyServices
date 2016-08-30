package com.nzion.domain.emr.lab;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.*;

import com.nzion.domain.annot.AccountNumberField;
import com.nzion.domain.base.IdGeneratingBaseEntity;
import org.hibernate.annotations.Fetch;


@Entity
@AccountNumberField("profileCode")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "profileCode"}))
@Access(AccessType.FIELD)
public class LabTestProfile extends IdGeneratingBaseEntity implements Serializable{

	@Column( length = 20)
	private String profileCode;
	
	private String profileName;
	
	private String profileNeumonic;

	private boolean prescriptionRequired;
	private String specialInstruction;
	private String specialInstructionAr;
	private String turnaroundTime;
	private Integer displayOrder;
	private String department;
	@Transient
	private BigDecimal billableAmount;
	@Transient
	private BigDecimal homeServiceAmount;
	

	@ManyToMany(targetEntity = LabTest.class,fetch = FetchType.EAGER)
	@Fetch(org.hibernate.annotations.FetchMode.SELECT)
	@JoinTable(name = "lab_test_profile_lab_test", 
	joinColumns = {@JoinColumn(name = "PROFILE_CODE")},
	inverseJoinColumns = { @JoinColumn(name = "TEST_CODE") })
	private Set<LabTest> tests;

	public String getProfileCode() {
		return profileCode;
	}

	public void setProfileCode(String profileCode) {
		this.profileCode = profileCode;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getProfileNeumonic() {
		return profileNeumonic;
	}

	public void setProfileNeumonic(String profileNeumonic) {
		this.profileNeumonic = profileNeumonic;
	}


	public Set<LabTest> getTests() {
		return tests;
	}

	public void setTests(Set<LabTest> tests) {
		this.tests = tests;
	}

	public boolean isPrescriptionRequired() {
		return prescriptionRequired;
	}

	public void setPrescriptionRequired(boolean prescriptionRequired) {
		this.prescriptionRequired = prescriptionRequired;
	}

	public String getSpecialInstruction() {
		return specialInstruction;
	}

	public void setSpecialInstruction(String specialInstruction) {
		this.specialInstruction = specialInstruction;
	}

	public String getSpecialInstructionAr() {
		return specialInstructionAr;
	}

	public void setSpecialInstructionAr(String specialInstructionAr) {
		this.specialInstructionAr = specialInstructionAr;
	}

	public String getTurnaroundTime() {
		return turnaroundTime;
	}

	public void setTurnaroundTime(String turnaroundTime) {
		this.turnaroundTime = turnaroundTime;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Transient
	public BigDecimal getBillableAmount() {
		return billableAmount;
	}

	public void setBillableAmount(BigDecimal billableAmount) {
		this.billableAmount = billableAmount;
	}

	@Transient
	public BigDecimal getHomeServiceAmount() {
		return homeServiceAmount;
	}

	public void setHomeServiceAmount(BigDecimal homeServiceAmount) {
		this.homeServiceAmount = homeServiceAmount;
	}
}
