package com.complover116.jst4;

public class Track {
	private String title;
	private String artist;
	private String album;
	private int length;
	
	public Track(String title_par, String artist_par, String album_par, int length_par) {
		title = title_par;
		artist = artist_par;
		album = album_par;
		length = length_par;
	}
	/***
	 * Get human-readable track length
	 * @return Track length in "MM:SS" format
	 */
	public String getLengthForHumans() {
		return length/60+":"+ ((""+length%60).length()==1 ? "0"+length%60 : length%60);
	}
	public String getTitle() {
		return title;
	}
	public String getAlbum() {
		return album;
	}
	public String getArtist() {
		return artist;
	}
}
