@gui
Feature: Login with valid data

  @Search
  Scenario Outline: Login with invalid username
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    Then i can see the validation message on email "<validationMessage>"


    Examples:
      | LoginId               | Password | validationMessage |
      | dasdasdsad@fadsss.com | f123456  | error.wrongemail  |


  @Search
  Scenario Outline: Login with invalid password
    Given i navigate to the Shahid "HOME" page
    And i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    Then i can see the validation message on password "<validationMessage>"



    Examples:
      | LoginId                | Password | validationMessage         |
      | dj-ram2010@hotmail.com | f123456  | error.rightEmailwrongPass |


  @Search
  Scenario Outline: Login with valid credentials
    Given i navigate to the Shahid "HOME" page
    And i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    #Then i validate the Logged in home page component
    And Switch Driver to Default IFrame
    Then i Signout

    Examples:
      | LoginId                | Password   |
      | dj-ram2010@hotmail.com | ram1101994 |