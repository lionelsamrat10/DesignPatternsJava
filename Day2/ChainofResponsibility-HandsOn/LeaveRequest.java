package com.dp.chainofresponsibility.handson;

public class LeaveRequest {
	private String employeeName;
	private int LeaveDays;
	
	//Setter and Getter methods
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getLeaveDays() {
		return LeaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		LeaveDays = leaveDays;
	}
}
