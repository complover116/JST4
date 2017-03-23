package com.complover116.jst4;

public class Track {
	private String title;
	private String artist;
	private String album;
	private int length;
	
	public Track(String string, String string2, String string3, int i) {
		title = string;
		artist = string2;
		album = string3;
		length = i;
	}
	/***
	 * Get human-readable track length
	 * @return Track length in "MM:SS" format
	 */
	public String getLengthForHumans() {
		return length/60+":"+ ((""+length%60).length()==1 ? "0"+length%60 : length%60);
	}
}
