import Jukebox.Album;
import Jukebox.Song;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AlbumTest {

    @Test
    public void testGetSetAlbum() {
        Album testSongs = new Album("Surfin USA", "Beach Boys");
        testSongs.addAlbumSong("Farmer's Daughter", "Beach Boys");
        assertEquals("Song in album Farmer's Daughter", testSongs.getAlbumSongs(),"No album songs");
    }

    @Test
    public void testGetSetAlbumToFail() {
        Album testSongs = new Album("Surfin USA", "Beach Boys");
        assertNull(testSongs.getAlbumSongs(), "Did not fail");
    }

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
        ArrayList<Album> albums = new ArrayList<>();
        Album testSongs = new Album("Surfin USA", "Beach Boys");
        testSongs.addAlbumSong("Party Rocking", "LMFAO");
        albums.add(testSongs);
        ArrayList<Song> playlist = new ArrayList<Song>();
        assertTrue(albums.get(0).addToPlaylist("Party Rocking", playlist), "Song not found");
    }


    @Test
    public void testGetPlaylistToFail(){
        ArrayList<Album> albums = new ArrayList<>();
        Album testSongs = new Album("Surfin USA", "Beach Boys");
        testSongs.addAlbumSong("Surfin USA", "Beach Boys");
        albums.add(testSongs);
        ArrayList<Song> playlist = new ArrayList<Song>();
        assertFalse(albums.get(0).addToPlaylist("Party Rocking", playlist), "Did not fail");
    }
}
