package com.comprator.comprable;

public class Address {
	private int streetNo;
	private String society;
	private int pincode;

	public Address(int s, String soc, int pin) {
		this.streetNo = s;
		this.society = soc;
		this.pincode = pin;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String toString() {

		return "[ Street No = " + streetNo + "  , Society = " + society + "  ,  Pincode =  " + pincode + "  ]";
	}
}
