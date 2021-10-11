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
        assertEquals("[{\"albumSongs\":[{\"songTrack\":\"Girls Got Rhythm\",\"songArtist\":\"AC/DC\",\"songPlaying\":false},{\"songTrack\":\"Walk All Over You\",\"songArtist\":\"AC/DC\",\"songPlaying\":false},{\"songTrack\":\"Touch Too Much\",\"songArtist\":\"AC/DC\",\"songPlaying\":false}],\"albumTitle\":\"Highway to Hell\",\"albumArtist\":\"AC/DC\"},{\"albumSongs\":[{\"songTrack\":\"Farmer\\u0027s Daughter\",\"songArtist\":\"Beach Boys\",\"songPlaying\":false},{\"songTrack\":\"Misirlou\",\"songArtist\":\"Beach Boys\",\"songPlaying\":false},{\"songTrack\":\"Stoked\",\"songArtist\":\"Beach Boys\",\"songPlaying\":false}],\"albumTitle\":\"Surfin\\u0027 USA\",\"albumArtist\":\"Beach Boys\"}]",
                albums.toString(),
                "No songs");
    }


    @Test
    void defaultPlaylistTest() {
        MainJukebox.Playlist defaultPlaylist = new MainJukebox.Playlist();
        assertEquals("[{\"songTrack\":\"Girls Got Rhythm\",\"songArtist\":\"AC/DC\",\"songPlaying\":false},{\"songTrack\":\"Touch Too Much\",\"songArtist\":\"AC/DC\",\"songPlaying\":false},{\"songTrack\":\"Stoked\",\"songArtist\":\"Beach Boys\",\"songPlaying\":false}]", defaultPlaylist.toString(), "No songs");
    }
}