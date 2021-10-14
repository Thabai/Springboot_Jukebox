package JukeboxTests;

import Jukebox.Album;
import Jukebox.Song;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class AlbumTest {

    @Test
    public void testGetSetArtist(){

        Album testSongs = new Album( "test", "test");
        testSongs.setAlbumArtist("Beach Boys");
        assertEquals("Beach Boys", testSongs.getAlbumArtist(),"No Artist set");
    }


    @Test
    public void testGetSetTitle(){

        Album testSongs = new Album("test", "test");
        testSongs.setAlbumTitle("Surfin USA");
        assertEquals("Surfin USA", testSongs.getAlbumTitle(),"No Title set");
    }

    @Test
    public void testGetPlaylist(){
        LinkedList<Album> albums = new LinkedList<>();
        Album testSongs = new Album("Surfin USA", "Beach Boys");
        testSongs.addAlbumSong("Party Rocking", "LMFAO");
        albums.add(testSongs);
        LinkedList<Song> playlist = new LinkedList<Song>();
        assertTrue(albums.get(0).addToPlaylist("Party Rocking", playlist), "Song not found");
    }

    @Test
    public void testGetPlaylistFail(){
        LinkedList<Album> albums = new LinkedList<>();
        Album testSongs = new Album("Surfin USA", "Beach Boys");
        testSongs.addAlbumSong("Party Rocking", "LMFAO");
        albums.add(testSongs);
        LinkedList<Song> playlist = new LinkedList<Song>();
        assertFalse(albums.get(0).addToPlaylist("Party123", playlist), "Song not found");
    }
}
