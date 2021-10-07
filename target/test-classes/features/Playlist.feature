Feature: Add song to playlist

  Scenario: Person adds song to playlist when song is available
    Given the song is available
    When the person tries to add the song "Party Time" to the playlist
    Then song should show in the playlist

  Scenario: Person adds song to playlist when song is not available
    Given the song is not available
    When the person tries to add the song "Hip Hop Party" to the playlist
    Then the person should be told the song is not available