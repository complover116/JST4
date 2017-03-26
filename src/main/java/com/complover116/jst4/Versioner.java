package com.complover116.jst4;

public class Versioner {
	public static final int BUILD_NUMBER=-1;
	
	@SuppressWarnings("unused")
	public static void printVersion() {
		if(Versioner.BUILD_NUMBER != -1)
			Logger.getInstance().log(Logger.LogType.SYSTEM, "Running build "+Versioner.BUILD_NUMBER);
			else
			Logger.getInstance().log(Logger.LogType.SYSTEM, "Running a development build");
	}
}
