package JukeboxTests;

import Jukebox.Album;
import Jukebox.MainJukebox;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddSongTest {
    private String songAvailable;
    private String actualAnswer;

    static String checkSong (String songAvailable) {
        Album testSongs = new Album("Surfin USA", "Beach Boys");
        testSongs.addAlbumSong("Farmer's Daughter", "Beach Boys");
        return testSongs.songCucumberAvailable(songAvailable) ? "Yes" : "No";
    }

    static String addSongToPlaylist (String songAvailable) {
        Album testSongs = new Album("Surfin USA", "Beach Boys");
        testSongs.addAlbumSong("Farmer's Daughter", "Beach Boys");
        MainJukebox.Playlist playlist = new MainJukebox.Playlist();
        return testSongs.addToNewPlaylist(songAvailable) ? "Added to playlist" : "Not Added to playlist";
    }

    @Given("the song is available")
    public void the_song_is_available() {
        songAvailable = "Farmer's Daughter";
    }

    @Given("the song is not available")
    public void the_song_is_not_available() {
        songAvailable = "Boogie";
    }

    @When("the person tries to add the song \"Party Time\" to the playlist")
    public void the_person_tries_to_add_the_song_Party_Time_to_the_playlist() {
        actualAnswer = checkSong(songAvailable);
        assertEquals("Yes", actualAnswer);
    }

    @When("the person tries to add the song \"Hip Hop Party\" to the playlist")
    public void the_person_tries_to_add_the_song_Hip_Hop_Party_to_the_playlist() {
        actualAnswer = checkSong(songAvailable);
        assertEquals("No", actualAnswer);
    }

    @Then("song should show in the playlist")
    public void song_should_show_in_the_playlist() {
        actualAnswer = addSongToPlaylist(songAvailable);
        assertEquals("Added to playlist", actualAnswer);
    }
    @Then("the person should be told the song is not available")
    public void the_person_should_be_told_the_song_is_not_available() {
        actualAnswer = addSongToPlaylist(songAvailable);
        assertEquals("Not Added to playlist", actualAnswer);
    }

}