package com.complover116.jst4;

public class JST4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Logger.getInstance().log(Logger.LogType.SYSTEM, "Logger Initialized");
		if(Versioner.BUILD_NUMBER != -1)
		Logger.getInstance().log(Logger.LogType.SYSTEM, "Running build "+Versioner.BUILD_NUMBER);
		else
		Logger.getInstance().log(Logger.LogType.SYSTEM, "Running a development build");
	}

}
