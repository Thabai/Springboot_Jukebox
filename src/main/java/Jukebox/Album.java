package Jukebox;

import java.util.ArrayList;
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
                return "Songs in album: " + this.albumSongs.get(i).getTrack();
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

    public boolean addToPlaylist(String Track, ArrayList<Song> playlist) {
        Song checkedSong = songAvailable(Track);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }

    //cucumber

    public Boolean songCucumberAvailable(String Track) {

        for (Song checkedSong : this.albumSongs) {
            if (checkedSong.getTrack().equals(Track)) {
                return true;
            }
        }
        return false;
    }
    public boolean addToNewPlaylist(String Track, MainJukebox.Playlist playlist) {
        Boolean checkedSong = songCucumberAvailable(Track);
        if (checkedSong != false) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "{ Albums Available: [Album Name = " + this.albumTitle + ", Artist = " + this.albumArtist + ", Song List = " + this.albumSongs + "]}";
    }

}
