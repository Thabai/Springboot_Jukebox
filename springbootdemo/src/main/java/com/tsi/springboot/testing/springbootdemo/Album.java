package com.tsi.springboot.testing.springbootdemo;

import com.tsi.springboot.testing.springbootdemo.Song;

import java.util.LinkedList;
import java.util.List;

public class Album {

    private List<Song> albumSongs = new LinkedList<>();
    private String albumTitle;
    private String albumArtist;

    public Album (String albumTitle, String albumArtist){
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
    }

    public String getAlbumSongs() {

        for (int i = 0; i < this.albumSongs.size(); i++) {
            return "Song in album " + this.albumSongs.get(i).getTrack();
        }
        return null;
    }

    public void addAlbumSong(String track, String artist) {
        albumSongs.add(new Song(track, artist));
    }

    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAlbumArtist() {
        return this.albumArtist;
    }

    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    public Song songAvailable(String Track) {

        for (Song checkedSong : this.albumSongs) {
            if (checkedSong.getTrack().equals(Track)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(String Track, LinkedList<Song> playlist) {
        Song checkedSong = songAvailable(Track);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }


}
