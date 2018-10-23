package com.cg.bank.dto;

public class Customer {
	private int custId, custAge;
	private String custName, custMob;
	private double iniBal;
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustMob() {
		return custMob;
	}
	public void setCustMob(String custMob) {
		this.custMob = custMob;
	}
	public double getIniBal() {
		return iniBal;
	}
	public void setIniBal(double iniBal) {
		this.iniBal = iniBal;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}

}
