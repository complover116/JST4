package com.complover116.jst4;

import java.util.ArrayList;
import com.google.gson.Gson;

public class TrackDB {
	
	private ArrayList<Track> tracks;
	private Gson gson;
	public TrackDB() {
		gson = new Gson();
		tracks = new ArrayList<Track>();
	}
	public void addTrack(Track track) {
		tracks.add(track);
	}
	public ArrayList<Track> search(String query, boolean titleOnly) {
		ArrayList<Track> result = new ArrayList<Track>();
		for(Track track : tracks) {
			if(track.getTitle().toLowerCase().contains(query.toLowerCase()) || 
					(!titleOnly && track.getArtist().toLowerCase().contains(query.toLowerCase()))) {
				result.add(track);
			}
		}
		
		return result;
	}
}
