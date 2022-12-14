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
public class AddCustomerPage extends Utility {


    // By addcustomer = By.xpath("//button[@ng-class='btnClass1']");
    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    WebElement addcustomer;


    // By FirstName = By.xpath("//input[@placeholder='First Name']");

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement FirstName;
    // By LastName = By.xpath("//input[@placeholder='Last Name']");
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement LastName;
    // By PostCode = By.xpath("//input[@placeholder='Post Code']");
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement PostCode;
    //By clickaddcustomer = By.xpath("//button[@type='submit']");

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickaddcustomer;


    public void clickAddcustromer() {
        Reporter.log("click Add custromer" + addcustomer.toString());
        clickOnElement(addcustomer);
        CustomListeners.test.log(Status.PASS, "click Add custromer");
    }

    public void filldata() {
        Reporter.log("fill data" + FirstName.toString());
        sendTextToElement(FirstName, "pradip");
        CustomListeners.test.log(Status.PASS, "fill data");

    }

    public void filldata1() {
        Reporter.log("fill data" + LastName.toString());
        sendTextToElement(LastName, "kakadiya");
        CustomListeners.test.log(Status.PASS, "fill data");
    }

    public void filldata2() {
        Reporter.log("fill data" + PostCode.toString());
        sendTextToElement(PostCode, "HA8 5QL");
        CustomListeners.test.log(Status.PASS, "fill data");
    }

    public void sabmit() {
        Reporter.log("sabmit" + clickaddcustomer.toString());
        clickOnElement(clickaddcustomer);
        CustomListeners.test.log(Status.PASS, "sabmit");
    }

    public void popalert() {
        Reporter.log("pop alert Accept");
        driver.switchTo().alert(); //Crating alert object reference and switch to alert
        String text = driver.switchTo().alert().getText(); //getting the text form alert
        System.out.println(text);
        driver.switchTo().alert().accept(); //Accept alert
        CustomListeners.test.log(Status.PASS, "pop alert Accept");
    }
}

