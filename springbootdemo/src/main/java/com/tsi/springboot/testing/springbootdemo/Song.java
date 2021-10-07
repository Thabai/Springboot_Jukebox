package com.tsi.springboot.testing.springbootdemo;

public class Song {
    private String Track;
    private String Artist;
    private boolean Playing = false;

    public Song() {
        this("test");
    }

    public Song(String track) {
        this("test", "tester");
    }

    public Song(String Track, String Artist) {
        super();
        this.Track = Track;
        this.Artist = Artist;
    }

    public String getTrack() {
        return Track;
    }

    public void setTrack(String track) {
        this.Track = track;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        this.Artist = artist;
    }

    public void setSong(String track, String artist) {
        this.Track = track;
        this.Artist = artist;
    }

    public String getSong() {
        return "Now playing " + this.Track + " by the " + this.Artist;
    }

    public void play() {
        Playing = true;
    }

    public boolean getPlaying() {
        return Playing;
    }

    @Override
    public String toString() {
        return
                "{" +
                        "\"Track Name\"= \"" + this.Track +
                        "\", \"Artist\"=\"" + this.Artist  +
                        "\"}";
    }
}