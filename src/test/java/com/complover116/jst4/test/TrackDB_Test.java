package com.complover116.jst4.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.complover116.jst4.Track;
import com.complover116.jst4.TrackDB;

public class TrackDB_Test {
	@Test
	public void testSearch() {
		TrackDB testDB = new TrackDB();
		testDB.addTrack(new Track("A test song", "complover116", "JST4 test album", 425, null));
		testDB.addTrack(new Track("A test song 2", "complover116", "JST4 test album", 425, null));
		testDB.addTrack(new Track("Continious integration", "complover116", "JST4 test album", 425, null));
		testDB.addTrack(new Track("This is a little bunny", "complover116", "Fake album 3", 425, null));
		ArrayList<Track> tracks = testDB.search("omplo", false);
		assertEquals("You should be able to search by artist", tracks.size(), 4);
		tracks = testDB.search("omplo", true);
		assertEquals("You should be able to enforce search by title only", tracks.size(), 0);
		tracks = testDB.search("asdafasd", false);
		assertEquals("The search results should be empty if no matching tracks are found", tracks.size(), 0);
		tracks = testDB.search("test song", false);
		assertEquals("Searching should return all results that match", tracks.size(), 2);
		tracks = testDB.search("This IS a LITTLE bunny", false);
		assertEquals("Searching should not be case sensitive", tracks.size(), 1);
	}
}
