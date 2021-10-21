package JukeboxTests;

import Jukebox.Album;
import Jukebox.Song;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @Test
    void testGetSetArtist(){

        Album testSongs = new Album( "test", "test");
        testSongs.setAlbumArtist("Beach Boys");
        assertEquals("Beach Boys", testSongs.getAlbumArtist(),"No Artist set");
    }


    @Test
    void testGetSetTitle(){

        Album testSongs = new Album("test", "test");
        testSongs.setAlbumTitle("Surfin USA");
        assertEquals("Surfin USA", testSongs.getAlbumTitle(),"No Title set");
    }

}
