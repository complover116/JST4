package com.complover116.jst4.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.complover116.jst4.TagReader;
import com.complover116.jst4.Track;

public class TagReader_Test {
	@Test
	public void testReadNormalFile() {
		Track track = new TagReader().read("testData/This is a test track.mp3");
		assertEquals("Track title should be read correctly!", track.getTitle(), "Test track");
		assertEquals("Track artist should be read correctly!", track.getArtist(), "complover116");
		assertEquals("Track album should be read correctly!", track.getAlbum(), "JST4 test album");
	}
	@Test
	public void testReadFileWithoutData() {
		Track track = new TagReader().read("testData/This is a track with no id3 tags.mp3");
		assertEquals("Track title should be set to the filename if not specified!", track.getTitle(), "This is a track with no id3 tags.mp3");
	}
}
