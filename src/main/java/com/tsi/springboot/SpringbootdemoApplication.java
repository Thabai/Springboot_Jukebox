package com.tsi.springboot;

import Jukebox.MainJukebox;
import Jukebox.Song;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static Jukebox.MainJukebox.*;


@SpringBootApplication
@RestController
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

	private static MainJukebox albums = new MainJukebox();
	private static Playlist defaultPlaylist = new Playlist();

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/api/albums")
	public static String availableAlbums() {
		if (albums == null) {
			albums = new MainJukebox();
		}
		return albums.toString();
	}

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/api/playlist")
	public static String defaultPlaylist() {
		availableAlbums();
		if (defaultPlaylist == null) {
			defaultPlaylist = new Playlist();
		}
		return defaultPlaylist.toString();
	}

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/api/trackSearch")
	public static String songTrackSearch(String songTrack) {
		return trackAvailable(songTrack);
	}

//	@CrossOrigin("http://localhost:3000")
//	@PostMapping("/createPlaylist")
//	public static String createOwnPlaylist(String songTrack) {
//		Playlist playlist1 = new Playlist();
//		Playlist.createPlaylist(songTrack);
//		return playlist1.toString1();
//	}
}