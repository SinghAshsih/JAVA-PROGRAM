package com.java;

import java.util.Comparator;

public class Emp implements Comparable<Emp> {
	Integer eid;
	String ename;
	Integer esalary;

	public Emp(Integer eid, String ename, Integer esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;

	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEsalary() {
		return esalary;
	}

	public void setEsalary(Integer esalary) {
		this.esalary = esalary;
	}

	public String toString() {
		return eid + " - " + ename + " - " + esalary;

	}

	@Override
	public int compareTo(Emp o) {
		return ename.compareToIgnoreCase(o.ename);

	}
	

}
