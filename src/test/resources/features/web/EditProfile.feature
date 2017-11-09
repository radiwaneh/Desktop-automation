@gui
Feature: edit personal profile

  @Search
  Scenario Outline: Edit Personal Data for account
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And click BurgerMenu
    And Switch Driver to Widget IFrame
    And i click On Personal Profile Widget
    And i click Edit Profile Link
    And i change First Name "<FirstName>"
    And i change Last Name "<LastName>"
    And i change Month of birth
    And i change Year of Birth
    And i change the Female Gender
    And i click on Save info
    And i verify Editing Profile "<ValidationMessage>"
    And i Validate all changes made
    And Switch Driver to Default IFrame
    And i click on shahid home page
    Then i Signout

    Examples:

      | LoginId                | Password   | FirstName | LastName | ValidationMessage         |
      | dj-ram2010@hotmail.com | ram1101994 | رامز      | ديوانه   | Notify.SuccessfulEditInfo |
      | dj-ram2010@hotmail.com | ram1101994 | Ramez     | Diwaneh  | Notify.SuccessfulEditInfo |

