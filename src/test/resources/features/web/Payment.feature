@gui
Feature: Payment

  @Search
  Scenario Outline: Visa/Credit

    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And i click on shahid home page
    And click BurgerMenu
    And Switch Driver to Widget IFrame
    And i click on Payment Widget
    And i click on subscribe now
    And i click on CreditCard
    And i Fill in Card name "<CardName>" and Card type and Card Number "<CardNumber>" and CVV "<CVV>"
    And i Fill Card End Date
    And i enter Address "<Address>" and country "<country>"
    And i click on subscribe CreditCard now
    And Switch Driver to Default IFrame
    And i click on shahid home page
    Then i Signout


    Examples:

      | LoginId              | Password   | CardName | CardNumber       | CVV | Address | country |
      | testnew@testnew.test | ram1101994 | MM PP    | 5361220000521142 | 261 | amman   | amman   |


  @Search
  Scenario Outline: Check Tpay

    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And click BurgerMenu
    And Switch Driver to Widget IFrame
    And i click on Payment Widget
    And i click on subscribe now
    And i click on Tpay
    And i open DropDown country list and choose
    And i open DropDown Service Provider list and choose Umniah
    # And i open DropDown Service Provider list and choose Zain
    # And i open DropDown Service Provider list and choose Orange
    And i enter Phone number "<PhoneNum>"
    And i click register Tpay
    And i validate Tpay Registration "<TpayValidation>"
    And Switch Driver to Default IFrame
    Then i Signout


    Examples:

      | LoginId              | Password   | PhoneNum  | TpayValidation |
      | testnew@testnew.test | ram1101994 | 795295191 | TpayValidation |

  @Search

  Scenario Outline: Check Voucher error messages

    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And click BurgerMenu
    And Switch Driver to Widget IFrame
    And i click on Payment Widget
    And i click on subscribe now
    And i click on Vouchers
    And i open DropDown Voucher list
    And i pick Voucher Type MBC
    And i enter voucher number "<VoucherNum>"
    And i click register voucher
    And i validate voucher error message "<VoucherValidation>"
    And Switch Driver to Default IFrame
    Then i Signout

    Examples:

      | LoginId              | Password   | VoucherNum  | VoucherValidation |
      | testnew@testnew.test | ram1101994 | SBWXpDlrGRo | VoucherValidation |


  @Search
  Scenario Outline: Samsung Voucher error messages

    Given i navigate to the Shahid "HOME" page
    When i click "SIGN_IN" on the Home Page
    And Switch Driver to Widget IFrame
    And i enter loginId "<LoginId>" and password "<Password>"
    And i click on Sign In button on the Login Page
    And Switch Driver to Default IFrame
    And click BurgerMenu
    And Switch Driver to Widget IFrame
    And i click on Payment Widget
    And i click on subscribe now
    And i click on Vouchers
    And i open DropDown Voucher list
    And i pick Voucher Type Samsung
    And i enter voucher number "<VoucherNum>"
    And i click register voucher
    And i validate voucher error message "<VoucherValidation>"
    And Switch Driver to Default IFrame
    Then i Signout

    Examples:

      | LoginId              | Password   | VoucherNum  | VoucherValidation |
      | testnew@testnew.test | ram1101994 | SBWXpDlrGRo | VoucherValidation |