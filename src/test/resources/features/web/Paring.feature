@gui
Feature: Pairing

  @Search
  Scenario Outline: Pairing Device Page Verification
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And click BurgerMenu
    And Switch Driver to Widget IFrame
    And i Click on DeviceManagement
    And i Validate Pairing Page Component "<ParingPageObject>"
    And Switch Driver to Default IFrame
    And i click on shahid home page
    Then i Signout

    Examples:
      | LoginId                | Password   | ParingPageObject |
      | dj-ram2010@hotmail.com | ram1101994 | ParingPageObject |