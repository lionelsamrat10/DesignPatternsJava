package com.dp.chainofresponsibility.handson;

public class HR implements ILeaveRequestHandler {
	
	@SuppressWarnings("unused")
	private ILeaveRequestHandler nextHandler;
	
	@Override
	public void nextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void HandleRequest(LeaveRequest leaverequest) {
		int numberOfDays = leaverequest.getLeaveDays();
		
		if(numberOfDays > 5) {
			System.out.println("Leave request approved by the HR!!");
		}else {
			System.out.println("Leave request rejected!!!");
		}
	}

}
