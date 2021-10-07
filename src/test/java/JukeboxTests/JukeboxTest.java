package JukeboxTests;

import Jukebox.Album;

import Jukebox.MainJukebox;
import Jukebox.Song;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static Jukebox.MainJukebox.printListAlbum;
import static Jukebox.MainJukebox.printPlaylist;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class JukeboxTest {

    @Test
    public void printAlbum() {
        LinkedList<Album> albumTest = new LinkedList<>();
        Album testing = new Album("Highway to Hell", "AC/DC");
        testing.addAlbumSong("Girls Got Rhythm", "AC/DC");
        albumTest.add(testing);
        assertEquals("= Current Albums Available =1: Highway to Hell", printListAlbum(albumTest), "No albums");
    }

    @Test
    public void printAlbumToFail() {
        LinkedList<Album> albumTest = new LinkedList<>();
        assertNull(printListAlbum(albumTest), "Did not fail");
    }

    @Test
    public void printPlaylistSongs() {
        LinkedList<Album> albumTest = new LinkedList<>();
        Album testing = new Album("Highway to Hell", "AC/DC");
        testing.addAlbumSong("Girls Got Rhythm", "AC/DC");
        albumTest.add(testing);
        ArrayList<Song> playlist = new ArrayList<Song>();
            albumTest.get(0).addToPlaylist("Girls Got Rhythm", playlist);

        assertEquals("= Current Songs On Playlist =1: Girls Got Rhythm", printPlaylist(playlist), "No songs");
    }

    @Test
    public void printPlaylistSongsToFail() {
        ArrayList<Song> playlist = new ArrayList<Song>();
        assertNull(printPlaylist(playlist), "Did not fail");
    }

    @Test
    public void availableAlbumsToStringTest(){
        LinkedList<Album> albumTest = new LinkedList<>();
        Album testing = new Album("Highway to Hell", "AC/DC");
        testing.addAlbumSong("Girls Got Rhythm", "AC/DC");
        albumTest.add(testing);
        assertEquals("[{ Albums Available: [Album Name = Highway to Hell, Artist = AC/DC, Song List = [{Track Name= Girls Got Rhythm, Artist= AC/DC}]]}]", albumTest.toString(), "No albums");
    }

    @Test
    public void defaultPlaylistToStringTest(){
        LinkedList<Album> albumTest = new LinkedList<>();
        Album testing = new Album("Highway to Hell", "AC/DC");
        testing.addAlbumSong("Girls Got Rhythm", "AC/DC");
        albumTest.add(testing);
        ArrayList<Song> playlist = new ArrayList<Song>();
            albumTest.get(0).addToPlaylist("Girls Got Rhythm", playlist);

        assertEquals("[{Track Name= Girls Got Rhythm, Artist= AC/DC}]", playlist.toString(), "No songs");
    }

    @Test
    void availableAlbumsTest() {
        MainJukebox albums = new MainJukebox();
        assertEquals("[{\"albumSongs\":[{\"Track\":\"Girls Got Rhythm\",\"Artist\":\"AC/DC\",\"Playing\":false},{\"Track\":\"Walk All Over You\",\"Artist\":\"AC/DC\",\"Playing\":false},{\"Track\":\"Touch Too Much\",\"Artist\":\"AC/DC\",\"Playing\":false}],\"albumTitle\":\"Highway to Hell\",\"albumArtist\":\"AC/DC\"},{\"albumSongs\":[{\"Track\":\"Farmer\\u0027s Daughter\",\"Artist\":\"Beach Boys\",\"Playing\":false},{\"Track\":\"Misirlou\",\"Artist\":\"Beach Boys\",\"Playing\":false},{\"Track\":\"Stoked\",\"Artist\":\"Beach Boys\",\"Playing\":false}],\"albumTitle\":\"Surfin\\u0027 USA\",\"albumArtist\":\"Beach Boys\"}]",
                albums.toString(),
                "No songs");
    }


    @Test
    void defaultPlaylistTest() {
        MainJukebox.Playlist defaultPlaylist = new MainJukebox.Playlist();
        assertEquals("[{\"Track\":\"Girls Got Rhythm\",\"Artist\":\"AC/DC\",\"Playing\":false},{\"Track\":\"Touch Too Much\",\"Artist\":\"AC/DC\",\"Playing\":false},{\"Track\":\"Stoked\",\"Artist\":\"Beach Boys\",\"Playing\":false}]", defaultPlaylist.toString(), "No songs");
    }
}