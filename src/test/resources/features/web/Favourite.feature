@gui
Feature: Favourite feature


  @Search
  Scenario Outline: Favourite page verification
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And click BurgerMenu
    And i click on favourite list
    And i verify favourite page "<favouritepagemessage>"
    And i click on shahid home page
    Then i Signout

    Examples:

      | LoginId               | Password   | favouritepagemessage |
      | newaccount212@mbc.net | ram1101994 | favouritepagemessage |


  @Search
  Scenario Outline: Add Series to favorite from home page and removing it from favorite menu
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And i click on favourite button on Series from Home page
    And click BurgerMenu
    And i click on favourite list
    And i click on favourite button on Series from favourite page
    And i click on shahid home page
    Then i Signout

    Examples:

      | LoginId               | Password   |
      | newaccount212@mbc.net | ram1101994 |


  @Search
  Scenario Outline: Add Program to favorite from home page and removing it from favorite menu
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And i go page down "<numberofdownpages>"
    And i go down with arrows "<numberofdownarrows>"
    And i click on favourite button on Program from Home page
    And click BurgerMenu
    And i click on favourite list
    And i click on favourite button on Program from favourite page
    And i click on shahid home page
    Then i Signout

    Examples:

      | LoginId               | Password   | numberofdownpages | numberofdownarrows |
      | newaccount212@mbc.net | ram1101994 | 4                 | 10                 |


  @Search
  Scenario Outline: Add Movies to favorite from home page and removing it from favorite menu
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And i go down with arrows "<numberofdownarrows>"
    And i click on favourite button on Movie from Home page
    And click BurgerMenu
    And i click on favourite list
    And i click on favourite button on Movie from favourite page
    And i click on shahid home page
    Then i Signout

    Examples:

      | LoginId               | Password   | numberofdownarrows |
      | newaccount212@mbc.net | ram1101994 | 7                  |


  @Search
  Scenario Outline: Add Episode to favourite
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And i pick video from home page
    And i click on favourite button on player
    And i click on Info button on Favourite page
    And i click on favourite button on player
    And click BurgerMenu
    And i click on favourite list
    And i click on favourite button on Series from favourite page
    And i click on favourite button on Episode from favourite page
    And i click on shahid home page
    Then i Signout

    Examples:

      | LoginId               | Password   |
      | newaccount212@mbc.net | ram1101994 |





