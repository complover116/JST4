package com.complover116.jst4.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.complover116.jst4.Track;

public class Track_Test {
	@Test
	public void testLengthForHumans() {
		Track testTrack = new Track("Title", "Artist", "Album", 183, null);
		Track testTrack2 = new Track("Title2", "Artist2", "Album2", 255, null);
		assertEquals("183 seconds long track should be 3:03", testTrack.getLengthForHumans(), "3:03");
		assertEquals("255 seconds long track should be 4:15", testTrack2.getLengthForHumans(), "4:15");
	}
}
