package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class CustomerPage extends Utility {

    //By CustomerLogin = By.xpath("//button[contains(text(),'Customer Login')]");

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement CustomerLogin;

    // By yourname = By.xpath("//select[@id='userSelect']");

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourname;
    // By submitbutton = By.xpath("//button[contains(text(),'Login')]");

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement submitbutton;

    // By Logout = By.xpath("//button[contains(text(),'Logout')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement Logout;

    // By Logout1 = By.xpath("//button[contains(text(),'Logout')]");

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement Logout1;

    //By yournameverify = By.xpath("//span[@class='fontBig ng-binding']");

    @CacheLookup
    @FindBy(xpath = "//span[@class='fontBig ng-binding']")
    WebElement yournameverify;


    public void clickcustomerlogin() {
        Reporter.log("click ustomer login" + CustomerLogin.toString());
        clickOnElement(CustomerLogin);
        CustomListeners.test.log(Status.PASS, "click ustomer login");
    }

    public void clickyourname() {
        Reporter.log("click your name" + yourname.toString());
        clickOnElement(yourname);
        CustomListeners.test.log(Status.PASS, "click your name");
    }

    public void clicksubmitbutton() {
        Reporter.log("click submit button" + submitbutton.toString());
        clickOnElement(submitbutton);
        CustomListeners.test.log(Status.PASS, "click submit button");
    }

    public void clicklogout() {
        Reporter.log("click logout" + Logout.toString());
        clickOnElement(Logout);
        CustomListeners.test.log(Status.PASS, "click logout");
    }

    public String verifyText() {
        Reporter.log("click logout" + Logout1.toString());
        return getTextFromElement(Logout1);
    }

    public String VerifyYourName() {
        Reporter.log("click logout" + yournameverify.toString());
        return getTextFromElement(yournameverify);
    }

}