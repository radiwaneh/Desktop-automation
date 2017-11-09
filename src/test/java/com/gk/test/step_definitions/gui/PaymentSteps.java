package com.gk.test.step_definitions.gui;

import com.gk.test.framework.helpers.Props;
import com.gk.test.framework.helpers.UrlBuilder;
import com.gk.test.framework.helpers.WebDriverHelper;
import com.gk.test.page_objects.gui.MyShahidPage;
import com.gk.test.page_objects.gui.PaymentPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;

import static com.gk.test.framework.helpers.WebDriverHelper.getWebDriver;
import static com.gk.test.framework.helpers.WebDriverHelper.switchToDefaultIframe;
import static java.sql.DriverManager.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by radiwaneh on 10/23/2017.
 */
public class PaymentSteps {

    private PaymentPage PaymentSteps;

    public PaymentSteps(PaymentPage PaymentPage) {
        this.PaymentSteps = PaymentPage;
    }

    @And("^i click on Payment Widget$")
    public void iClickOnPaymentWidget() {
        PaymentSteps.clickPaymentWidget();
    }

    @And("^i click on subscribe now$")
    public void iClickOnSubscribeNow() {
        PaymentSteps.iClickOnSubscribeNow();
    }


    @And("^i click on Vouchers$")
    public void iClickOnVouchers() {
        PaymentSteps.iClickOnVouchers();
    }

    @And("^i open DropDown Voucher list$")
    public void iOpenDropDownVoucherList() {
        PaymentSteps.iOpenDropDownVoucherList();
    }

    @And("^i pick Voucher Type MBC$")
    public void iPickVoucherTypeMBC() {
        PaymentSteps.iPickVoucherTypeMBC();
    }

    @And("^i pick Voucher Type Samsung$")
    public void iPickVoucherTypeSamsung() {
        PaymentSteps.iPickVoucherTypeSamsung();

    }

    @And("^i enter voucher number \"([^\"]*)\"$")
    public void iEnterVoucherNumber(String VoucherNum) {
        PaymentSteps.iEnterVoucherNumber().clear();
        PaymentSteps.iEnterVoucherNumber().sendKeys(VoucherNum);

    }

    @And("^i click register voucher$")
    public void iClickRegisterVoucher() {
        PaymentSteps.iClickRegisterVoucher();
    }


    @And("^i click on CreditCard$")
    public void iClickOnCreditCard() {
        PaymentSteps.iClickOnCreditCard();
    }

    @And("^i click on Tpay$")
    public void iClickOnTpay() {
        PaymentSteps.iClickOnTpay();
    }

    @And("^i click on subscribe CreditCard now$")
    public void iClickOnSubscribeCreditCardNow() throws InterruptedException {
        PaymentSteps.iClickOnSubscribeCreditCard();

    }

    @And("^i Fill in Card name \"([^\"]*)\" and Card type and Card Number \"([^\"]*)\" and CVV \"([^\"]*)\"$")
    public void iFillInCardNameAndCardTypeAndCardNumberAndCVV(String cardname, String cardnumber, String CVV) {
        PaymentSteps.cardname().sendKeys(cardname);
        PaymentSteps.cardtype();
        PaymentSteps.cardnumber().sendKeys(cardnumber);
        PaymentSteps.CVV().sendKeys(CVV);
    }

    @And("^i Fill Card End Date$")
    public void iFillCardEndDate() {

        PaymentSteps.monthenddate();

        PaymentSteps.yearenddate();
    }

    @And("^i enter Address \"([^\"]*)\" and country \"([^\"]*)\"$")
    public void iEnterAddressAndCountry(String address, String counrty) {
        PaymentSteps.address().sendKeys(address);
        PaymentSteps.counrty().sendKeys(counrty);

    }

    @And("^i enter Phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String PhoneNum) {PaymentSteps.PhoneNum().sendKeys(PhoneNum);
    }


    @And("^i open DropDown country list and choose$")
    public void iOpenDropDownCountryListAndChoose() {
        PaymentSteps.TpayCountry();
    }

    @And("^i open DropDown Service Provider list and choose Umniah$")
    public void iOpenDropDownServiceProviderListAndChooseUmniah() {
        PaymentSteps.ServiceProviderUmnia();
    }
    @And("^i open DropDown Service Provider list and choose Zain$")
    public void iOpenDropDownServiceProviderListAndChooseZain() {
        PaymentSteps.ServiceProviderZain();
    }
    @And("^i open DropDown Service Provider list and choose Orange$")
    public void iOpenDropDownServiceProviderListAndChooseOrange() {
        PaymentSteps.ServiceProviderOrange();
    }

    @And("^i Signout$")
    public void iSignout() throws InterruptedException {
        Thread.sleep(3000);
        PaymentSteps.Signout2();
        Thread.sleep(2000);


    }

    @And("^i click on shahid home page$")
    public void iClickOnShahidHomePage() {
       PaymentSteps.shahidhomepage();
    }

    @And("^i click register Tpay$")
    public void iClickRegisterTpay() throws InterruptedException {
        PaymentSteps.iClickRegisterTpay();
        Thread.sleep(10000);
    }

    @And("^i validate voucher error message \"([^\"]*)\"$")
    public void iValidateVoucherErrorMessage(String VoucherValidation) {
        assertThat(PaymentSteps.getVoucherValidation()).contains(Props.getMessage(VoucherValidation));
    }

    @And("^i validate Tpay Registration \"([^\"]*)\"$")
    public void iValidateTpayRegistration(String TpayValidation) {

            assertThat(PaymentSteps.TpayValidationText()).contains(Props.getMessage(TpayValidation));
        }


    public static int counter = 0;
    public  void setConditionBack() throws InterruptedException {

        boolean breakIt = true;
        while (true) {
            breakIt = true;
            try {

                do {
                    Thread.sleep(10000);
                    getWebDriver().findElement(By.xpath("//a[@href='/ar/widget/login']")).click(); // Sign in home page
                    Thread.sleep(200);
                    counter++;

                    breakIt = true;


                }
                while (breakIt);


            } catch (Exception e) {
                if (e.getMessage().contains("Unable to locate")) {
                    // do the sign out steps from home page
                    //UrlBuilder.startAtHomePage();
                    switchToDefaultIframe();
                    iSignout();
                    breakIt = true;
                }
                if (e.getMessage().contains("is not clickable")){

                    UrlBuilder.startAtHomePage();

                }

            }
            if (breakIt) {
                break;
            }

        }

        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



}

