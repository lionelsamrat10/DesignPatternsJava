package com.dp.chainofresponsibility.handson;

public class ProjectManager implements ILeaveRequestHandler {
	
	private ILeaveRequestHandler nextHandler;
	
	@Override
	public void nextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void HandleRequest(LeaveRequest leaverequest) {
		int leaveDays = leaverequest.getLeaveDays();
		
		if(leaveDays > 3 && leaveDays <= 5) {
			System.out.println("Leave request approved by the Project Manager!!");
		}else {
			nextHandler.HandleRequest(leaverequest);
		}
	}


}
