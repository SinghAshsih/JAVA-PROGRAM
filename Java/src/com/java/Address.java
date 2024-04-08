package com.java;

public class Address {
	private String cityName;
	private String pincode;
	private String streetNo;

	public Address() {
		super();
	}

	public Address(String cityName, String pincode, String streetNo) {
		super();
		this.cityName = cityName;
		this.pincode = pincode;
		this.streetNo = streetNo;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", pincode=" + pincode + ", streetNo=" + streetNo + "]";
	}

}
