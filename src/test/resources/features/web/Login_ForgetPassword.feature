@gui
Feature: Forget Password

  @Search
  Scenario Outline: ForgetPassword with Valid Email and captcha
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i click on ForgetPassword button on the Login Page
    And i enter Email "<Email>"
    ############# Enter captcha ##########
    And i click on Submit button on the ForgetPassword Page
    Then i can see the validation message for successful action "<validationMessage>"

    Examples:
      | Email                 | validationMessage |
      | Plustest222@gmail.com | SucessfulAction   |

  @Search
  Scenario Outline: ForgetPassword with empty captcha
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i click on ForgetPassword button on the Login Page
    And i enter Email "<Email>"
    And i click on Submit button on the ForgetPassword Page
    Then i can see the validation message for empty captcha "<validationMessage>"

    Examples:
      | Email                 | validationMessage  |
      | Plustest222@gmail.com | error.EmptyCaptcha |


  @Search
  Scenario Outline: ForgetPassword with empty Email
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i click on ForgetPassword button on the Login Page
    And i enter Captcha "<Captcha>"
    And i click on Submit button on the ForgetPassword Page
    Then i can see the validation message for invalid captcha "<validationMessage>"

    Examples:
      | Captcha | validationMessage                   |
      | abcdef  | error.EmptyEmailFieldWithAnyCaptcha |


  @Search
  Scenario Outline: ForgetPassword with empty Email and empty Captcha
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i click on ForgetPassword button on the Login Page
    And i click on Submit button on the ForgetPassword Page
    Then i can see the validation message for empty captcha "<validationMessage>"

    Examples:
      | validationMessage  |
      | error.EmptyCaptcha |


  @Search
  Scenario Outline: ForgetPassword with Incorrect email format/Speacial characters
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i click on ForgetPassword button on the Login Page
    And i enter Email "<Email>"
    And i enter Captcha "<Captcha>"
    And i click on Submit button on the ForgetPassword Page
    Then i can see the validation message for Invalid Email format"<validationMessage>"

    Examples:
      | Email                    | Captcha | validationMessage                  |
      | ThisIsInvalidEmailFormat | abcdef  | error.incorrectForgotenEmailFormat |


  @Search
  Scenario Outline: ForgetPassword with right email and wrong captcha
    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i click on ForgetPassword button on the Login Page
    And i enter Email "<Email>"
    And i enter Captcha "<Captcha>"
    And i click on Submit button on the ForgetPassword Page
    Then i can see the validation message for valid Email with invalid captcha"<validationMessage>"

    Examples:
      | Email                 | Captcha | validationMessage            |
      | plustest222@gmail.com | abcdef  | error.RightEmailWrongCaptcha |


