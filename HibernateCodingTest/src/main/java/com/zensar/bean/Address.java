package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Embeddable

public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int addressId;
	
	@Column
	String cityName;
	
	@Column
	String pinCode;
	
	
	@Embedded
	Employee employee;
	

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Address(int addressId, String cityName, String pinCode, Employee employee) {
		super();
		this.addressId = addressId;
		this.cityName = cityName;
		this.pinCode = pinCode;
		this.employee = employee;
	}

	public Address(String cityName, String pinCode, Employee employee) {
		super();
		this.cityName = cityName;
		this.pinCode = pinCode;
		this.employee = employee;
	}

	public Address(int addressId) {
		super();
		this.addressId = addressId;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", cityName=" + cityName + ", pinCode=" + pinCode + ", employee="
				+ employee + "]";
	}

}
