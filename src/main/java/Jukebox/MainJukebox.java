package Jukebox;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainJukebox {

    public static List<Album> albums = new LinkedList<Album>();

    public MainJukebox() {

        Album album = new Album("Highway to Hell", "AC/DC");
        album.addAlbumSong("Girls Got Rhythm", "AC/DC");
        album.addAlbumSong("Walk All Over You", "AC/DC");
        album.addAlbumSong("Touch Too Much", "AC/DC");
        albums.add(album);

        album = new Album("Surfin' USA", "Beach Boys");
        album.addAlbumSong("Farmer's Daughter", "Beach Boys");
        album.addAlbumSong("Misirlou", "Beach Boys");
        album.addAlbumSong("Stoked", "Beach Boys");
        albums.add(album);
        printListAlbum(albums);

    }


    public String toString(){
        return new Gson().toJson(albums);
    }

    public static class Playlist{
        public static List<Song> defaultPlaylist = new ArrayList<Song>();

        public Playlist() {
            albums.get(0).addToPlaylist("Girls Got Rhythm", defaultPlaylist);
            albums.get(0).addToPlaylist("Touch Too Much", defaultPlaylist);
            albums.get(1).addToPlaylist("Stoked", defaultPlaylist);
            printPlaylist(defaultPlaylist);
        }

        public String toString(){
            return new Gson().toJson(defaultPlaylist);
        }

    }



    public static String printListAlbum(List<Album> linkedList) {

        Iterator<Album> albumName = linkedList.iterator();
        int albumNum = 0;
        while (albumName.hasNext()) {

            albumNum++;
            Album currentAlbum = albumName.next();
            return "= Current Albums Available =" + albumNum + ": " + currentAlbum.getAlbumTitle();
        }

        return null;
    }

    public static String printPlaylist(List<Song> playlist) {

        Iterator<Song> track = playlist.iterator();
        int songNum = 0;
        while (track.hasNext()) {

            songNum++;
            Song currentSong = track.next();
            return "= Current Songs On Playlist =" + songNum + ": " + currentSong.getSongTrack();
        }
        return null;

    }

}