package com.bank.pages;

import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class BankManagerLoginPage extends Utility {

    //By BankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement BankManagerLogin;

    // By BankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickBankManagerLogin() {
        Reporter.log("click Bank Manager Login"+ BankManagerLogin.toString());
        clickOnElement(BankManagerLogin);
    }


}


