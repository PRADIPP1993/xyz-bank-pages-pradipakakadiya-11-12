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
public class OpenAccountPage extends Utility {
    //By openaccout = By.xpath("//button[@ng-class='btnClass2']");

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement openaccout;
   // By clickcustomername = By.xpath("//select[@id='userSelect']");

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement clickcustomername;

  //  By clickrightname = By.xpath("//option[@value='6']");

    @CacheLookup
    @FindBy(xpath = "//option[@value='6']")
    WebElement clickrightname;
    //By clickcurrency = By.xpath("//select[@id='currency']");

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement clickcurrency;
    //By clickyourcurrency = By.xpath("//option[@value='Pound']");

    @CacheLookup
    @FindBy(xpath = "//option[@value='Pound']")
    WebElement  clickyourcurrency;

   // By process = By.xpath("//button[contains(text(),'Process')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement  process;

    public void clickopenaccout(){
        Reporter.log("click open accout"+ openaccout.toString());
        clickOnElement(openaccout);
        CustomListeners.test.log(Status.PASS, "click open accout");
    }

    public void customername(){
        Reporter.log("customer name"+ clickcustomername.toString());
        clickOnElement(clickcustomername);
        CustomListeners.test.log(Status.PASS, "customer name");
    }

    public void clickrightcustomername(){
        Reporter.log("click right customer name"+ clickrightname.toString());
        clickOnElement(clickrightname);
        CustomListeners.test.log(Status.PASS, "click right customer name");
    }
    public void currency(){
        Reporter.log("currency"+ clickcurrency.toString());
        clickOnElement(clickcurrency);
        CustomListeners.test.log(Status.PASS, "currency");
    }
    public void clickyourcurrency(){
        Reporter.log("click your currency"+ clickyourcurrency.toString());
        clickOnElement(clickyourcurrency);
        CustomListeners.test.log(Status.PASS, "click your currency");
    }
    public void clickprocess(){
        Reporter.log("click process"+ process.toString());
        clickOnElement(process);
        CustomListeners.test.log(Status.PASS, "click process");
    }

    public void popalert1() {
        Reporter.log("pop alert Accept");
        driver.switchTo().alert(); //Crating alert object reference and switch to alert
        String text = driver.switchTo().alert().getText(); //getting the text form alert
        System.out.println(text);
        driver.switchTo().alert().accept(); //Accept alert
        CustomListeners.test.log(Status.PASS, "pop alert Accept");
    }
}
