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
public class AccountPage extends Utility {


    //By Deposit = By.xpath("//button[@ng-click='deposit()']");
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='deposit()']")
    WebElement Deposit;

    //By Depositbutton = By.xpath("//button[@type='submit']");

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Depositbutton;
    // By DepositSuccessful = By.xpath("//span[contains(text(),'Deposit Successful')]");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement DepositSuccessful;

    // By withdrawl = By.xpath("//button[@ng-click='withdrawl()']");
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    WebElement withdrawl;


    //By Withdrawbutton = By.xpath("//button[@type='submit']");
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Withdrawbutton;

    //By TransactionSuccessful = By.xpath("//span[contains(text(),'Transaction Successful')]");

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction Successful')]")
    WebElement TransactionSuccessful;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement addamount1;
@CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement withdrawlamout;


    public void clickdeposit() {
        Reporter.log("Login Button"+ Deposit.toString());
        clickOnElement(Deposit);
        CustomListeners.test.log(Status.PASS, "Click on login Button");
    }

    public void addamout() {
        Reporter.log("Add amount"+ addamount1.toString());
        sendTextToElement(addamount1, "100");
        CustomListeners.test.log(Status.PASS, "Add amount");
    }


    public void clickdepositbutton() {
        Reporter.log("click deposit button" + Depositbutton.toString());
        clickOnElement(Depositbutton);
        CustomListeners.test.log(Status.PASS, "click deposit button");
    }


    public String VerifyDepositSuccessfull() {
        Reporter.log("Verify Deposit Successfull"+ DepositSuccessful.toString());
        String message =  getTextFromElement(DepositSuccessful);
        CustomListeners.test.log(Status.PASS, "Verify Deposit Successfull");
        return message;

    }

    public void clickwithdrawl() {
        Reporter.log("click withdrawl"+ withdrawl.toString());
        clickOnElement(withdrawl);
        CustomListeners.test.log(Status.PASS, "click withdrawl");
    }

    public void withdrawlamout() {
        Reporter.log("withdrawl amount" + withdrawlamout.toString());
        sendTextToElement(withdrawlamout, "50");
        CustomListeners.test.log(Status.PASS, "withdrawl amount");
    }

    public void clickdrawtbutton() {
        Reporter.log("click drawt button"+ Withdrawbutton.toString());
        clickOnElement(Withdrawbutton);
        CustomListeners.test.log(Status.PASS, "click drawt button");
    }

    public String VerifyTransactionSuccessful() {
        return getTextFromElement(TransactionSuccessful);
    }


}