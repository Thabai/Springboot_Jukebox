package JukeboxTests;

import Jukebox.Album;
import Jukebox.Song;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static Jukebox.MainJukebox.printListAlbum;
import static Jukebox.MainJukebox.printPlaylist;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class JukeboxTest {

    @Test
    void printAlbum() {
        LinkedList<Album> albumTest = new LinkedList<>();
        Album testing = new Album("Highway to Hell", "AC/DC");
        testing.addAlbumSong("Girls Got Rhythm", "AC/DC");
        albumTest.add(testing);
        assertEquals("= Current Albums Available =1: Highway to Hell", printListAlbum(albumTest), "No albums");
    }

    @Test
    void printAlbumToFail() {
        LinkedList<Album> albumTest = new LinkedList<>();
        assertNull(printListAlbum(albumTest), "Did not fail");
    }

    @Test
    void printPlaylistSongs() {
        LinkedList<Album> albumTest = new LinkedList<>();
        Album testing = new Album("Highway to Hell", "AC/DC");
        testing.addAlbumSong("Girls Got Rhythm", "AC/DC");
        albumTest.add(testing);
        ArrayList<Song> playlist = new ArrayList<Song>();
            albumTest.get(0).addToPlaylist("Girls Got Rhythm", playlist);

        assertEquals("= Current Songs On Playlist =1: Girls Got Rhythm", printPlaylist(playlist), "No songs");
    }

    @Test
    void printPlaylistSongsToFail() {
        ArrayList<Song> playlist = new ArrayList<Song>();
        assertNull(printPlaylist(playlist), "Did not fail");
    }

    @Test
    void availableAlbumsToStringTest(){
        LinkedList<Album> albumTest = new LinkedList<>();
        Album testing = new Album("Highway to Hell", "AC/DC");
        testing.addAlbumSong("Girls Got Rhythm", "AC/DC");
        albumTest.add(testing);
        assertEquals("[{ Albums Available: [Album Name = Highway to Hell, Artist = AC/DC, Song List = [{Track Name= Girls Got Rhythm, Artist= AC/DC}]]}]", albumTest.toString(), "No albums");
    }

    @Test
    void defaultPlaylistToStringTest(){
        LinkedList<Album> albumTest = new LinkedList<>();
        Album testing = new Album("Highway to Hell", "AC/DC");
        testing.addAlbumSong("Girls Got Rhythm", "AC/DC");
        albumTest.add(testing);
        ArrayList<Song> playlist = new ArrayList<Song>();
            albumTest.get(0).addToPlaylist("Girls Got Rhythm", playlist);

        assertEquals("[{Track Name= Girls Got Rhythm, Artist= AC/DC}]", playlist.toString(), "No songs");
    }

}