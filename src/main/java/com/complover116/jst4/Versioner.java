package com.complover116.jst4;

public class Versioner {
	public static final int BUILD_NUMBER=-1;
	
	@SuppressWarnings("unused")
	public static void printVersion() {
		if(Versioner.BUILD_NUMBER != -1)
			System.out.println("Running build "+Versioner.BUILD_NUMBER);
			else
			System.out.println("Running a development build");
	}
}
