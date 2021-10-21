package Jukebox;

import com.google.gson.Gson;

import java.util.*;

public class MainJukebox {

    protected static final List<Album> albums = new LinkedList<>();

    public MainJukebox() {

        Album album = new Album("Highway to Hell", "AC/DC");
        album.addAlbumSong("Girls Got Rhythm", "AC/DC");
        album.addAlbumSong("Walk All Over You", "AC/DC");
        album.addAlbumSong("Touch Too Much", "AC/DC");
        albums.add(album);

        album = new Album("Surfin USA", "Beach Boys");
        album.addAlbumSong("Farmers Daughter", "Beach Boys");
        album.addAlbumSong("Misirlou", "Beach Boys");
        album.addAlbumSong("Stoked", "Beach Boys");
        albums.add(album);
        printListAlbum(albums);

    }

    public static List<Album> getAlbums() {
        return albums;
    }

    public static String trackAvailable(String track) {
        for (Album checkedAlbum : getAlbums()) {
            if (checkedAlbum.songAvailable(track).getSongTrack() != null) {
                return checkedAlbum.songAvailable(track).toString();
            }
        }
        return "Sorry song is not available";
    }

    public String toString(){
        return new Gson().toJson(albums);
    }

    public static class Playlist {
        protected static final List<Song> defaultPlaylist = new ArrayList<>();
        private static List<Song> playlist1 = new ArrayList<>();

        public Playlist() {
            albums.get(0).addToPlaylist("Girls Got Rhythm", defaultPlaylist);
            albums.get(0).addToPlaylist("Touch Too Much", defaultPlaylist);
            albums.get(1).addToPlaylist("Stoked", defaultPlaylist);
            printPlaylist(defaultPlaylist);
        }

//        public static String createPlaylist(String track) {
//            for (Album checkedSong : getAlbums()) {
//                if (checkedSong.songAvailable(track).getSongTrack() != null) {
//                    return checkedSong.addToPlaylist(track, playlist1).toString();
//                } System.out.println(playlist1);
//            }
//            return "Something went wrong";
//        }

        public String toString(){
            return new Gson().toJson(defaultPlaylist);
        }

//        public String toString1(){
//            return new Gson().toJson(playlist1);
//        }
//
//    }


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