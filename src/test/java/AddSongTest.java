//
//import Jukebox.Playlist;
//import Jukebox.Song;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AddSongTest {
//    private String songAvailable;
//    private String actualAnswer;
//
//    static String addSongToPlaylist (String songAvailable) {
//        Playlist testPlay = new Playlist();
//        testPlay.addToPlaylist(new Song ("Party Time", "Eminem"));
//        return testPlay.getPlaySong(songAvailable) ? "Yes" : "No";
//    }
//
//
//    @Given("the song is available")
//    public void the_song_is_available() {
//        songAvailable = "Party Time";
//    }
//
//    @Given("the song is not available")
//    public void the_song_is_not_available() {
//        songAvailable = "Boogie";
//    }
//
//    @When("the person tries to add the song \"Party Time\" to the playlist")
//    public void the_person_tries_to_add_the_song_Party_Time_to_the_playlist() {
//        actualAnswer = addSongToPlaylist(songAvailable);
//    }
//
//    @When("the person tries to add the song \"Hip Hop Party\" to the playlist")
//    public void the_person_tries_to_add_the_song_Hip_Hop_Party_to_the_playlist() {
//        actualAnswer = addSongToPlaylist(songAvailable);
//    }
//
//    @Then("song should show in the playlist")
//    public void song_should_show_in_the_playlist() {
//        actualAnswer = addSongToPlaylist(songAvailable);
//        assertEquals("Yes", actualAnswer);
//    }
//    @Then("the person should be told the song is not available")
//    public void the_person_should_be_told_the_song_is_not_available() {
//        actualAnswer = addSongToPlaylist(songAvailable);
//        assertEquals("No", actualAnswer);
//    }
//
//}