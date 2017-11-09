@gui
Feature: Change Password and edit personal profile

  @Search
  Scenario Outline: Change Password for account with valid data
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And click BurgerMenu
    And Switch Driver to Widget IFrame
    And i click On Personal Profile Widget
    And i click on update password link
    And i enter old password "<OldPass>" and new password and the confirmation of new password
    And i click on submit
    And i click on update password link
    And i enter old password x and new password "<OldPass>" and the confirmation of new password
    And i click on submit
    And Switch Driver to Default IFrame
    And i click on shahid home page
    Then i Signout

    Examples:

      | LoginId                | Password   | OldPass    |
      | dj-ram2010@hotmail.com | ram1101994 | ram1101994 |


  @Search
  Scenario Outline: Check error Change Password message for account with invalid data
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And click BurgerMenu
    And Switch Driver to Widget IFrame
    And i click On Personal Profile Widget
    And i click on update password link
    And i enter old password "<OldPass>" and new password and the confirmation of new password
    And i click on submit
    And i validate error message for change password "<ValidationErrorMessage>"
    And Switch Driver to Default IFrame
    And i click on shahid home page
    Then i Signout

    Examples:

      | LoginId                | Password   | OldPass  | ValidationErrorMessage     |
      | dj-ram2010@hotmail.com | ram1101994 | 12345678 | changepasswordErrorMessage |
      | dj-ram2010@hotmail.com | ram1101994 | abcdefg  | changepasswordErrorMessage |
      | dj-ram2010@hotmail.com | ram1101994 | ()*^#)@  | changepasswordErrorMessage |
      | dj-ram2010@hotmail.com | ram1101994 | ابتثجحخ  | changepasswordErrorMessage |
      | dj-ram2010@hotmail.com | ram1101994 | Empty  | changepasswordErrorMessage |

