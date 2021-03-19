package com.dp.chainofresponsibility.handson;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LeaveRequest leaverequest = new LeaveRequest();
		
		System.out.println("Enter the name of the employee:");
		String employeeName = sc.nextLine();
		leaverequest.setEmployeeName(employeeName);
		
		System.out.println("Enter the number of days you want the leave for:");
		int leaveDays = sc.nextInt();
		leaverequest.setLeaveDays(leaveDays);
		
		ILeaveRequestHandler supervisor = new Supervisor();
		ILeaveRequestHandler projectmanager = new ProjectManager();
		ILeaveRequestHandler hr = new HR();
		
		supervisor.nextHandler(projectmanager);
		projectmanager.nextHandler(hr);
		
		supervisor.HandleRequest(leaverequest);
		//projectmanager.HandleRequest(leaverequest);
		//hr.HandleRequest(leaverequest);
		
		//Close the Scanner object
		sc.close();
	}
}
