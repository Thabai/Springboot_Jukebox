package Jukebox;

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

    public Song songAvailable(String track) {

        for (Song checkedSong : this.albumSongs) {
            if (checkedSong.getSongTrack().equals(track)) {
                return checkedSong;
            }
        }
        return new Song();
    }

    public boolean addToPlaylist(String track, List<Song> playlist) {
        Song checkedSong = songAvailable(track);
        if (checkedSong.getSongTrack() != null) {
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }

    //cucumber

    public Boolean songCucumberAvailable(String track) {

        for (Song checkedSong : this.albumSongs) {
            if (checkedSong.getSongTrack().equals(track)) {
                return true;
            }
        }
        return false;
    }
    public boolean addToNewPlaylist(String track) {
        Boolean checkingSong = songCucumberAvailable(track);
        if (checkingSong) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "{ Albums Available: " +
                "[Album Name = " + this.albumTitle +
                ", Artist = " + this.albumArtist +
                ", Song List = " + this.albumSongs + "]}";
    }

}
