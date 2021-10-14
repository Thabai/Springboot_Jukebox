package com.tsi.springboot;

import Jukebox.MainJukebox;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import static Jukebox.MainJukebox.*;


@SpringBootApplication
@RestController
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/api/albums")
	public static String availableAlbums() {
		MainJukebox albums = new MainJukebox();
		return albums.toString();
	}

	@GetMapping("/api/playlist")
	public static String defaultPlaylist() {
		availableAlbums();
		Playlist defaultPlaylist = new Playlist();
		return defaultPlaylist.toString();
	}

	@GetMapping("/api/trackSearch")
	public static String songTrackSearch(String songTrack) {
		MainJukebox albums = new MainJukebox();
		return albums.trackAvailable(songTrack);
	}
}