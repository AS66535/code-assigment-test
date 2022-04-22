package com.zensar.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int employeeId;
	
	@Column
	String Name;
	
	@Column
	double basicSalary;
	
	@Embedded
	Address address;
	
	@Embedded
	List<Skill>skillList;
	
	BankAccount account;

	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Skill> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	public Employee(int employeeId, String name, double basicSalary, Address address, List<Skill> skillList,
			BankAccount account) {
		super();
		this.employeeId = employeeId;
		Name = name;
		this.basicSalary = basicSalary;
		this.address = address;
		this.skillList = skillList;
		this.account = account;
	}
	public Employee(String name, double basicSalary, Address address, List<Skill> skillList, BankAccount account) {
		super();
		Name = name;
		this.basicSalary = basicSalary;
		this.address = address;
		this.skillList = skillList;
		this.account = account;
	}
	public Employee(int employeeId) {
		super();
		this.employeeId = employeeId;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", Name=" + Name + ", basicSalary=" + basicSalary + ", address="
				+ address + ", skillList=" + skillList + ", account=" + account + "]";
	}
	
		
}
