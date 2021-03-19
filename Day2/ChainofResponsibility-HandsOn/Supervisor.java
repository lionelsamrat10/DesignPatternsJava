package com.dp.chainofresponsibility.handson;

public class Supervisor implements ILeaveRequestHandler {
	
	private ILeaveRequestHandler nextHandler;
	
	@Override
	public void nextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void HandleRequest(LeaveRequest leaverequest) {
		int leaveDays = leaverequest.getLeaveDays();
		
		if(leaveDays >= 1 && leaveDays < 3) {
			System.out.println("Leave request is approved by the Supervisor!!");
		}else {
			nextHandler.HandleRequest(leaverequest);
		}
	}

	

}
