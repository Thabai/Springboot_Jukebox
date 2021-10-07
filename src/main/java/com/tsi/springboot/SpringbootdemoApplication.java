package com.tsi.springboot;

import Jukebox.MainJukebox;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}


	@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute")
	public String availableAlbums(){
		MainJukebox albums = new MainJukebox();
		return albums.toString();
	}

	@GetMapping("/customRoute?defaultPlaylist")
	public String defaultPlaylist(){
		MainJukebox.Playlist defaultPlaylist = new MainJukebox.Playlist();
//		if (MainJukebox.Playlist.defaultPlaylist.isEmpty()) {
//			MainJukebox albums = new MainJukebox();
//			return albums.toString();
//			ArrayList<Song> playlist = new ArrayList<Song>();
//			albums.get(0).addToPlaylist("Girls Got Rhythm", playlist);
//			albums.get(0).addToPlaylist("Touch Too Much", playlist);
//			albums.get(1).addToPlaylist("Stoked", playlist);
//			return playlist.toString();
//		}
		return defaultPlaylist.toString();
	}






//	@PostMapping("/savePlayerDetails")
//	public String savePlayerDetails(@RequestParam("playerId") String theInt,
//									@ModelAttribute("details") PlayerDetails playerDetails){
//
//		int theInt2 = Integer.parseInt(theInt);
//
//		playerDetailsService.savePlayerDetails(theInt2, playerDetails);
//
//		return "redirect:/players/list";
//	}
}