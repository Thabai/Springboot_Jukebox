package com.tsi.springboot.testing.springbootdemo;

import com.tsi.springboot.testing.springbootdemo.Album;
import com.tsi.springboot.testing.springbootdemo.Song;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(null, testSongs.getAlbumSongs(),"No album songs");
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
        LinkedList<Album> albums = new LinkedList<>();
        Album testSongs = new Album("Surfin USA", "Beach Boys");
        testSongs.addAlbumSong("Party Rocking", "LMFAO");
        albums.add(testSongs);
        LinkedList<Song> playlist = new LinkedList<Song>();
        assertEquals(true, albums.get(0).addToPlaylist("Party Rocking", playlist),"Song not found");
    }


    @Test
    public void testGetPlaylistToFail(){
        LinkedList<Album> albums = new LinkedList<>();
        Album testSongs = new Album("Surfin USA", "Beach Boys");
        testSongs.addAlbumSong("Surfin USA", "Beach Boys");
        albums.add(testSongs);
        LinkedList<Song> playlist = new LinkedList<Song>();
        assertEquals(false, albums.get(0).addToPlaylist("Party Rocking", playlist),"Song not found");
    }
}
