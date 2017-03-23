package com.complover116.jst4;

import java.util.ArrayList;
import com.google.gson.Gson;

public class TrackDB {
	private static TrackDB instance;
	
	private ArrayList<Track> tracks;
	private Gson gson;
	private TrackDB() {
		
		gson = new Gson();
	}
}
