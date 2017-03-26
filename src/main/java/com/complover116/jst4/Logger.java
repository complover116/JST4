package com.complover116.jst4;

public class Logger {
	enum LogType{
		SYSTEM, DATABASE, LOGTYPECOUNT;
	}
	
	
	private boolean logTypes[];
	
	private static Logger instance;
	private Logger() {
		logTypes = new boolean[LogType.LOGTYPECOUNT.ordinal()];
		//Everything is enabled by default
		for(int i = 0; i < logTypes.length; i ++)
			logTypes[i] = true;
	}
	public static Logger getInstance() {
		if(instance == null) instance = new Logger();
		return instance;
	}
	/***
	 * Log a message - this will print it to the console (and write to a file, if file logging is enabled) if the specified logtype is enabled
	 * @param type LogType
	 * @param message The message to log
	 */
	public void log(LogType type, String message) {
		if(logTypes[type.ordinal()]){
			System.out.println(message);
		}
	}
}
