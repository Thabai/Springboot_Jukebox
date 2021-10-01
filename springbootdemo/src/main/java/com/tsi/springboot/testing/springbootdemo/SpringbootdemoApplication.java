package com.tsi.springboot.testing.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute")
	public String myResponse(){
		MainJukebox albums = new MainJukebox();
		return albums.toString();
	}
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute2")
	public String myPlaylist(){
		MainJukebox.Playlist playlist = new MainJukebox.Playlist();
		return playlist.toString();
	}
}