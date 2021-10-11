package com.tsi.springboot;

import Jukebox.MainJukebox;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}


	@CrossOrigin("http://localhost:3000")
//	@RequestMapping(value="api/albums", method= RequestMethod.GET)
	@GetMapping("/api/albums")
	public String availableAlbums(){
		MainJukebox albums = new MainJukebox();
		return albums.toString();
	}

//	@RequestMapping(value="/api/playlist", method= RequestMethod.GET)
	@GetMapping("/api/playlist")
	public String defaultPlaylist(){
		availableAlbums();
		MainJukebox.Playlist defaultPlaylist = new MainJukebox.Playlist();
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