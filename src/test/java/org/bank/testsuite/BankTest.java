package org.bank.testsuite;

import com.bank.pages.*;
import org.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    BankManagerLoginPage bankManagerLoginPage;
    OpenAccountPage openAccountPage;
    AddCustomerPage addCustomerPage;
    CustomerPage customerPage;
    AccountPage accountPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        bankManagerLoginPage = new BankManagerLoginPage();
        openAccountPage = new OpenAccountPage();
        addCustomerPage = new AddCustomerPage();
        customerPage = new CustomerPage();
        accountPage = new AccountPage();
        homePage = new HomePage();

    }

    @Test(groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        bankManagerLoginPage.clickBankManagerLogin();
        addCustomerPage.clickAddcustromer();
        addCustomerPage.filldata();
        addCustomerPage.filldata1();
        addCustomerPage.filldata2();
        addCustomerPage.sabmit();
        addCustomerPage.popalert();

    }

    @Test(groups = {"smoke","regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        bankManagerLoginPage.clickBankManagerLogin();
        addCustomerPage.clickAddcustromer();
        addCustomerPage.filldata();
        addCustomerPage.filldata1();
        addCustomerPage.filldata2();
        addCustomerPage.sabmit();
        addCustomerPage.popalert();
        openAccountPage.clickopenaccout();
        openAccountPage.customername();
        openAccountPage.clickrightcustomername();
        openAccountPage.currency();
        openAccountPage.clickyourcurrency();
        openAccountPage.clickprocess();
        openAccountPage.popalert1();

    }

    @Test(groups = {"regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {
        bankManagerLoginPage.clickBankManagerLogin();
        addCustomerPage.clickAddcustromer();
        addCustomerPage.filldata();
        addCustomerPage.filldata1();
        addCustomerPage.filldata2();
        addCustomerPage.sabmit();
        addCustomerPage.popalert();
        homePage.homebutton();
        customerPage.clickcustomerlogin();
        customerPage.clickyourname();
        openAccountPage.clickrightcustomername();
        customerPage.clicksubmitbutton();
        Assert.assertEquals(customerPage.verifyText(), "", "text verified");
        Assert.assertEquals(customerPage.VerifyYourName(), "pradip kakadiya", "VerifyYourName");
        customerPage.clicklogout();

    }

    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully() {
        bankManagerLoginPage.clickBankManagerLogin();
        addCustomerPage.clickAddcustromer();
        addCustomerPage.filldata();
        addCustomerPage.filldata1();
        addCustomerPage.filldata2();
        addCustomerPage.sabmit();
        addCustomerPage.popalert();
        openAccountPage.clickopenaccout();
        openAccountPage.customername();
        openAccountPage.clickrightcustomername();
        openAccountPage.currency();
        openAccountPage.clickyourcurrency();
        openAccountPage.clickprocess();
        openAccountPage.popalert1();
        homePage.homebutton();
        customerPage.clickcustomerlogin();
        customerPage.clickyourname();
        openAccountPage.clickrightcustomername();
        customerPage.clicksubmitbutton();
        accountPage.clickdeposit();
        accountPage.addamout();
        accountPage.clickdepositbutton();
        Assert.assertEquals(accountPage.VerifyDepositSuccessfull(), "Deposit Successful", "Verfiy Your Deposit Successful or Not");


    }

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() {
        bankManagerLoginPage.clickBankManagerLogin();
        addCustomerPage.clickAddcustromer();
        addCustomerPage.filldata();
        addCustomerPage.filldata1();
        addCustomerPage.filldata2();
        addCustomerPage.sabmit();
        addCustomerPage.popalert();
        openAccountPage.clickopenaccout();
        openAccountPage.customername();
        openAccountPage.clickrightcustomername();
        openAccountPage.currency();
        openAccountPage.clickyourcurrency();
        openAccountPage.clickprocess();
        openAccountPage.popalert1();
        homePage.homebutton();
        customerPage.clickcustomerlogin();
        customerPage.clickyourname();
        openAccountPage.clickrightcustomername();
        customerPage.clicksubmitbutton();
        accountPage.clickdeposit();
        accountPage.addamout();
        accountPage.clickdepositbutton();
        accountPage.clickwithdrawl();
        accountPage.withdrawlamout();
        accountPage.clickdrawtbutton();
       //Assert.assertEquals(accountPage.VerifyTransactionSuccessful(), "Transaction Successful", "Verfiy Your Transaction Successful or Not");

    }

}

