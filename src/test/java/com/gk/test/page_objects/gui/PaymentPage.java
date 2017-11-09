package com.gk.test.page_objects.gui;

import com.gk.test.framework.PageObject;
import com.gk.test.framework.helpers.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by radiwaneh on 10/23/2017.
 */
public class PaymentPage extends PageObject {


      private By shahidhomepage = By.xpath("//*[@id=\'appLogo\']/a/img");

    private By clickPaymentWidget = By.xpath("//*[@id=\"promoForm\"]/div[5]/div[2]/a");
    private By iClickOnSubscribeNow = By.id("subscribeNow");
    private By iClickOnSubscribeCreditCard = By.xpath("//*[@id=\"ascendon-payment-credit-card\"]/div/div/div[2]/div/div/div/div[3]/div/div/div/div[10]/div[1]/div[2]/div/div[2]/a");

    private By iClickOnVouchers = By.xpath("//*[@id=\"paymentMethodsForm\"]/div[3]/div[2]/div[3]/label/img");
    private By iClickOnCreditCard = By.xpath("//*[@id=\"paymentMethodsForm\"]/div[3]/div[2]/div[1]/label/img");
    private By iClickOnTpay = By.xpath("//*[@id=\"paymentMethodsForm\"]/div[3]/div[2]/div[2]/label/img");
    private By iOpenDropDownVoucherList = By.xpath("//*[@id=\"voucherPorviders\"]/div/span");
    private By iPickVoucherTypeMBC = By.id("MBC");
    private By iPickVoucherTypeSamsung = By.id("Samsung");

    private By iClickRegisterVoucher = By.id("voucherCodeSubmit");
    private By iClickRegisterTpay = By.id("submitTpayPayment");

    private By iEnterVoucherNumber = By.xpath("//*[@id=\"voucherForm\"]/div[3]/input");

    private By cardname = By.id("NameOnCard-input-0");
    private By cardtype = By.xpath("//*[@id=\"CreditCardTypeSelect-input-0\"]//option[4]");
    private By cardnumber = By.id("CardNumber-input-0");
    private By CVV = By.id("SecurityCode-input-0");
    private By monthenddate = By.xpath("//*[@id=\"ExpirationMonth-input-0\"]//option[10]");
    private By yearenddate = By.xpath("//*[@id=\"ExpirationYear-input-0\"]//option[4]");
    private By address = By.id("LineOne-input0");
    private By counrty = By.id("City-input0");


    private By TpayCountry = By.xpath("//*[@id=\"tpayCountries\"]//option[2]");
    private By ServiceProvider1 = By.xpath("//*[@id=\"tpayCarrierName\"]//option[1]");
    private By ServiceProvider2 = By.xpath("//*[@id=\"tpayCarrierName\"]//option[2]");
    private By ServiceProvider3 = By.xpath("//*[@id=\"tpayCarrierName\"]//option[3]");
    private By PhoneNum = By.id("tpayPhoneNumber");
    private By VoucherValidationText = By.xpath("//*[@id=\"formGeneralMsgs\"]/ul/li");
    private By TpayValidationText = By.xpath("//*[@id=\"form-content\"]/div[1]/h3");



    public WebElement cardname() {
        return waitForExpectedElement(cardname);
    }

    public void cardtype() {
        waitForExpectedElement(cardtype).click();
    }


    public WebElement cardnumber() {
        return waitForExpectedElement(cardnumber);
    }

    public WebElement CVV() {
        return waitForExpectedElement(CVV);
    }

    public void monthenddate() {
        waitForExpectedElement(monthenddate).click();
    }

    public void yearenddate() {
        waitForExpectedElement(yearenddate).click();
    }

    public WebElement address() {
        return waitForExpectedElement(address);
    }

    public WebElement counrty() {
        return waitForExpectedElement(counrty);
    }


    public void TpayCountry() {
        waitForExpectedElement(TpayCountry).click();
    }

    public void ServiceProviderUmnia() {
        waitForExpectedElement(ServiceProvider1).click();
    }
    public void ServiceProviderZain() {
        waitForExpectedElement(ServiceProvider2).click();
    }
    public void ServiceProviderOrange() {
        waitForExpectedElement(ServiceProvider3).click();
    }

    public WebElement PhoneNum() {
        return waitForExpectedElement(PhoneNum);
    }


    public void clickPaymentWidget() {
        waitForExpectedElement(clickPaymentWidget).click();
    }

    public void iClickOnSubscribeNow() {
        waitForExpectedElement(iClickOnSubscribeNow).click();
    }

    public void iClickOnSubscribeCreditCard() {
        waitForExpectedElement(iClickOnSubscribeCreditCard).click();
    }

    public void iClickOnVouchers() {
        waitForExpectedElement(iClickOnVouchers).click();
    }

    public void iClickOnCreditCard() {
        waitForExpectedElement(iClickOnCreditCard).click();
    }

    public void iClickOnTpay() {
        waitForExpectedElement(iClickOnTpay).click();
    }

    public void iOpenDropDownVoucherList() {
        waitForExpectedElement(iOpenDropDownVoucherList).click();
    }

    public void iPickVoucherTypeMBC() {
        waitForExpectedElement(iPickVoucherTypeMBC).click();
    }

    public void iPickVoucherTypeSamsung() {
        waitForExpectedElement(iPickVoucherTypeSamsung).click();
    }


    public WebElement iEnterVoucherNumber() {
        return waitForExpectedElement(iEnterVoucherNumber);
    }

    public void iClickRegisterVoucher() {
        waitForExpectedElement(iClickRegisterVoucher).click();
    }
    public void iClickRegisterTpay() {
        waitForExpectedElement(iClickRegisterTpay).click();
    }

    public String getVoucherValidation (){
        return waitForExpectedElement(VoucherValidationText).getText();
    }

    public String TpayValidationText (){
        return waitForExpectedElement(TpayValidationText).getText();
    }

    public void Signout() throws InterruptedException {

        Thread.sleep(10000);
        WebDriverHelper.HoverOverBurgerMenu(".//*[@id=\"appRoot\"]/div/div/header/div/div[2]/span/div/div[2]/div[2]/div/a",
                "//a[@href='/ar/widget/logout']");


    }

    public void Signout2() throws InterruptedException {

        WebDriverHelper.HoverOverBurgerMenu("//*[@id=\"appRoot\"]/div/div/header/div/div[2]/span/div/div[2]/div[2]/div/a","//*[@id=\"appRoot\"]/div/div/header/div/div[2]/span/div/div[2]/div[2]/span/div/div/a[4]");

    }

    public void shahidhomepage() {
        waitForExpectedElement(shahidhomepage).click();

    }
}
