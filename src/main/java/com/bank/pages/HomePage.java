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

public class HomePage extends Utility {

    //By home = By.xpath("//button[contains(text(),'Home')]");

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement home;

    public void homebutton(){
        Reporter.log("home button"+ home.toString());
        clickOnElement(home);
        CustomListeners.test.log(Status.PASS, "home button");
    }


}
