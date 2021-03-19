package com.dp.chainofresponsibility.demo;

//This is our Logger Abstract Class
public abstract class Logger {
	public static int OUTPUTINFO = 1;
	public static int ERRORINFO = 2;
	public static int DEBUGINFO = 3;
	
	protected int levels;
	
	protected Logger nextlevelLogger;
	
	public void setNextLevelLogger(Logger nextLevelLogger) {
		this.nextlevelLogger = nextLevelLogger;
	}
	
	public void logMessage(int levels, String msg) {
		if(this.levels <= levels) {
			displayLogInfo(msg);
		}
	}

	protected abstract void displayLogInfo(String msg);
}
