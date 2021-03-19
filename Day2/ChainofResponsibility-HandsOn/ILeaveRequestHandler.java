package com.dp.chainofresponsibility.handson;

public interface ILeaveRequestHandler {
	void nextHandler(ILeaveRequestHandler nextHandler);
	void HandleRequest(LeaveRequest leaverequest);
}
