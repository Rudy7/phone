package com.phone.jse.domain;

public class PhoneBean {
	private String company, call;
	
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company;
	}	
	public void setCall(String call) {
		this.call = call;
	}	
	public String getCall() {
		return call;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s 제품으로 %s 에게 전화를 걸다", company, call);
	}
	
	
}

