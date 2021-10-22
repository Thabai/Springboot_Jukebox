package com.tsi.springboot;

import Jukebox.MainJukebox;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

import static Jukebox.MainJukebox.*;


@SpringBootApplication
@RestController
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootdemoApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "9001"));
		app.run(args);
	}

	private static MainJukebox albums = new MainJukebox();
	private static Playlist defaultPlaylist = new Playlist();


	@CrossOrigin("http://localhost:3000")
	@GetMapping("/api/albums")
	public static String availableAlbums() {
		return albums.toString();
	}

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/api/playlist")
	public static String defaultPlaylist() {
		availableAlbums();
		return defaultPlaylist.toString();
	}

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/api/trackSearch")
	public static String songTrackSearch(String songTrack) {
		return trackAvailable(songTrack);
	}

	@CrossOrigin("http://localhost:3000")
	@PostMapping("/createPlaylist")
	public static String createOwnPlaylist(String songTrack) {
		return Playlist.createPlaylist(songTrack);
	}
}