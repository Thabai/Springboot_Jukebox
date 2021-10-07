import Jukebox.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SongTest {

    @Test
    public void testGetSetTrack(){
        Song testSong = new Song("Testy", "Testy");
        testSong.setTrack("Surfin USA");
        assertEquals("Surfin USA", testSong.getTrack(),"No Title");
    }


    @Test
    public void testGetSetArtist(){
        Song testSong = new Song("Testy", "Testy");
        testSong.setArtist("Beach Boys");
        assertEquals("Beach Boys", testSong.getArtist(),"No Artist");
    }

    @Test
    public void testGetSetSong(){
        Song testSong = new Song();
        testSong.setSong("Surfin USA", "Beach Boys");
        testSong.play();
        assertEquals("Now playing Surfin USA by the Beach Boys", testSong.getSong(),"No Song");
    }

    @Test
    public void testGetSetPlaying(){
        Song testSong = new Song();
        testSong.setSong("Surfin USA", "Beach Boys");
        testSong.play();
        assertTrue(testSong.getPlaying(), "Nothing playing");
    }
}