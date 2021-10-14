package JukeboxTests;

import Jukebox.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SongTest {

    @Test
    void testGetSetTrack(){
        Song testSong = new Song("Testy", "Testy");
        testSong.setSongTrack("Surfin USA");
        assertEquals("Surfin USA", testSong.getSongTrack(),"No Title");
    }


    @Test
    void testGetSetArtist(){
        Song testSong = new Song("Testy", "Testy");
        testSong.setSongArtist("Beach Boys");
        assertEquals("Beach Boys", testSong.getSongArtist(),"No Artist");
    }

    @Test
    void testGetSetSong(){
        Song testSong = new Song();
        testSong.setSong("Surfin USA", "Beach Boys");
        testSong.play();
        assertEquals("Now playing Surfin USA by the Beach Boys", testSong.getSong(),"No Song");
    }

    @Test
    void testGetSetPlaying(){
        Song testSong = new Song();
        testSong.setSong("Surfin USA", "Beach Boys");
        testSong.play();
        assertTrue(testSong.getSongPlaying(), "Nothing playing");
    }
}