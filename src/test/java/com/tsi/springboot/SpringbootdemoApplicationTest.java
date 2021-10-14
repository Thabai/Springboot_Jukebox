package com.tsi.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
        assertEquals("{Track Name= Stoked, Artist= Beach Boys}", SpringbootdemoApplication.songTrackSearch("Stoked"), "Not found in albums");
    }

    @Test
    void trackSearchFailTest() {
        assertEquals("Sorry song is not available", SpringbootdemoApplication.songTrackSearch("Party 123"), "Failed to check albums");
    }
}