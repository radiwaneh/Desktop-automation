@gui
Feature: Search

  @Search
  Scenario Outline: Search Invalid without Login
    Given i navigate to the Shahid "HOME" page
    And i click on search button
    And i fill search bar with "<SearchText>"
    And I click enter button after filling search bar
    Then i validate the component the error message "<errormessage>"


    Examples:
      | SearchText | errormessage              |
      | gfdgsgsgfg | invalidSearchErrorMessage |



  @Search
  Scenario Outline:  Login and search valid & Invalid and pich the first Option
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And i click on search button
    And i fill search bar with "<SearchText>"
    And I pick the first option
    Then i validate the Video
    And Switch Driver to Default IFrame
    Then i Signout

    Examples:
      | LoginId                | Password   | SearchText |
      | dj-ram2010@hotmail.com | ram1101994 | باب الحارة |


  @Search
  Scenario Outline:   Login and search valid & Invalid
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And i click on search button
    And i fill search bar with "<SearchText>"
    And I click enter button after filling search bar
    Then i validate the component
    And Switch Driver to Default IFrame
    Then i Signout

    Examples:
      | LoginId                | Password   | SearchText |
      | dj-ram2010@hotmail.com | ram1101994 | باب الحارة |

