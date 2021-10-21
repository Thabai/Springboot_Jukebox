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

//    @Test
//    void testGetPlaylist(){
//        List<Album> albums = new LinkedList<>();
//        Album testSongs = new Album("Surfin USA", "Beach Boys");
//        testSongs.addAlbumSong("Party Rocking", "LMFAO");
//        albums.add(testSongs);
//        List<Song> playlist = new ArrayList<Song>();
//        assertEquals("[{\"Track Name\": \"Party Rocking\", \"Artist\":\"LMFAO\"}]", albums.get(0).addToPlaylist("Party Rocking", playlist), "Song not found");
//    }

}
