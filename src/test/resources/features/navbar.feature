Feature: Interacting with the Navbar
  Scenario: Moving to the homepage
    Given I have opened a web browser
    When I navigate to "http://localhost:3000"
    Then I should see the homepage
  Scenario: Moving to the Albums page
    Given I have opened a web browser
    And I navigate to "http://localhost:3000"
    When I click the "navbarAlbums" button on the navbar
    Then I will be directed to the "/Albums" url
  Scenario: Moving to the Default Playlist page
    Given I have opened a web browser
    And I navigate to "http://localhost:3000"
    When I click the "navbarDefault" button on the navbar
    Then I will be directed to the "/defaultPlaylist" url
  Scenario: Moving to the Create Playlist page
    Given I have opened a web browser
    And I navigate to "http://localhost:3000"
    When I click the "navbarCreate" button on the navbar
    Then I will be directed to the "/createPlaylist" url