package com.tsi.springboot;

import Jukebox.MainJukebox;
import Jukebox.Song;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.tsi.springboot.SpringbootdemoApplication.songTrackSearch;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootdemoApplicationTest {

    @Test
    void contextLoads() {
    }

    @Test
    void defaultPlaylistTest() {
        assertEquals("[{\"songTrack\":\"Girls Got Rhythm\",\"songArtist\":\"AC/DC\",\"songPlaying\":false},{\"songTrack\":\"Touch Too Much\",\"songArtist\":\"AC/DC\",\"songPlaying\":false},{\"songTrack\":\"Stoked\",\"songArtist\":\"Beach Boys\",\"songPlaying\":false}]",
                SpringbootdemoApplication.defaultPlaylist(), "No playlist found");
    }

    @Test
    void trackSearchTest() {
        assertEquals("{\"Track Name\": \"Stoked\", \"Artist\":\"Beach Boys\"}", songTrackSearch("Stoked"), "Not found in albums");
    }

    @Test
    void trackSearchFailTest() {
        assertEquals("Sorry song is not available", songTrackSearch("Party 123"), "Failed to check albums");
    }

    @Test
    void createPlaylistTest() {
        assertEquals("Added to playlist", SpringbootdemoApplication.createOwnPlaylist("Stoked"), "Failed to add to playlist");
    }

//    @Test
//    void createPlaylistFailTest() {
//        assertEquals("Something went wrong", SpringbootdemoApplication.createOwnPlaylist("Party 123"), "Failed to check playlist");
//    }

}