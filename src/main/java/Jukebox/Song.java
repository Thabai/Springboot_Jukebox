package Jukebox;

import com.google.gson.Gson;

public class Song {
    private String songTrack;
    private String songArtist;
    private boolean songPlaying = false;

    public Song() {
    }


    public Song(String track, String artist) {
        super();
        this.songTrack = track;
        this.songArtist = artist;
    }

    public String getSongTrack() {
        return songTrack;
    }

    public void setSongTrack(String songTrack) {
        this.songTrack = songTrack;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public void setSong(String track, String artist) {
        this.songTrack = track;
        this.songArtist = artist;
    }

    public String getSong() {
        return "Now playing " + this.songTrack + " by the " + this.songArtist;
    }

    public void play() {
        songPlaying = true;
    }

    public boolean getSongPlaying() {
        return songPlaying;
    }

    @Override
    public String toString() {
        return
                "{" +
                        "\"Track Name\": \"" + this.songTrack +
                        "\", \"Artist\":\"" +  this.songArtist +
                        "\"}";
    }
}