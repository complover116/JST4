package com.complover116.jst4;

import java.io.File;
import java.io.IOException;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

public class TagReader {
	public Track read(String filename) {
		try {
			Mp3File file = new Mp3File(filename);
			String title = "";
			String artist = "";
			String album = "";
			int length = (int) file.getLength();
			
			if(file.hasId3v1Tag()) {
				ID3v1 tag1 = file.getId3v1Tag();
				title = tag1.getTitle();
				artist = tag1.getArtist();
				album = tag1.getAlbum();
			}
			if(file.hasId3v2Tag()) {
				ID3v2 tag2 = file.getId3v2Tag();
				title = tag2.getTitle();
				artist = tag2.getArtist();
				album = tag2.getAlbum();
			}
			if(title=="") {
				title = new File(filename).getName();
				
				System.out.println("Track "+filename+" has no title!");
			} 
			Track track = new Track(title, artist, album, length, filename);
			return track;
		} catch (UnsupportedTagException e) {
			System.out.println("Could not read "+filename+": tag unsupported!");
			return null;
		} catch (InvalidDataException e) {
			System.out.println("Could not read "+filename+": file malformed!");
			return null;
		} catch (IOException e) {
			System.err.println("Could not read "+filename+": file i/o error!");
			return null;
		}
	}
}
