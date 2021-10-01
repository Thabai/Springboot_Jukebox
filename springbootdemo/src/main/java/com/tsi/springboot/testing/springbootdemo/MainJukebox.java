package com.tsi.springboot.testing.springbootdemo;

import com.google.gson.Gson;

import java.util.LinkedList;

public class MainJukebox {

    private static final LinkedList<Album> albums = new LinkedList<>();
//    private static LinkedList<Song> playlist = new LinkedList<>();

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
//        printListAlbum(albums);

//        albums.get(0).addToPlaylist("Girls Got Rhythm", playlist);
//        albums.get(0).addToPlaylist("Touch Too Much", playlist);
//        albums.get(1).addToPlaylist("Stoked", playlist);
//        ////        printPlaylist(playlist);
    }

    public String toString(){
        return new Gson().toJson(albums);
    }

    public static class Playlist{
        private static final LinkedList<Song> playlist = new LinkedList<>();

        public Playlist() {
            albums.get(0).addToPlaylist("Girls Got Rhythm", playlist);
            albums.get(0).addToPlaylist("Touch Too Much", playlist);
            albums.get(1).addToPlaylist("Stoked", playlist);
            ////        printPlaylist(playlist);
        }

        public String toString(){
            return new Gson().toJson(playlist);
        }
    }



//    public static void printListAlbum(LinkedList<Album> linkedList) {
//        System.out.println("= Current Albums Available =");
//
//        Iterator<Album> albumName = linkedList.iterator();
//        int albumNum = 0;
//        while (albumName.hasNext()) {
//
//            albumNum++;
//            Album currentAlbum = albumName.next();
//            System.out.println(albumNum + ": " + currentAlbum.getAlbumTitle());
//
//
//        }
//        System.out.println("= End of Albums =");
//
//    }

//    public static void printPlaylist(LinkedList<Song> playlist) {
//        System.out.println("= Current Playlist Songs =");
//
//        Iterator<Song> track = playlist.iterator();
//        int songNum = 0;
//        while (track.hasNext()) {
//
//            songNum++;
//            Song currentSong = track.next();
//            System.out.println(songNum + ": " + currentSong.getTrack());
//        }
//        System.out.println("= End of Playlist =");
//
//    }

}