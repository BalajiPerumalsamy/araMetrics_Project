package com.positiveTests;

import com.araMetricsPage.Login_Page;
import com.araMetricsPage.LogoutPage;
import com.basePage.BaseClass;
import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutPageTest
{
    public BaseClass baseclass;
    public Login_Page loginPage;
    public LogoutPage logoutPage;

    @BeforeMethod
    public void setup()
    {
        baseclass=new BaseClass();
        baseclass.navigateToApplication();
        loginPage=new Login_Page();
        loginPage.login(baseclass.properties.getProperty("email"),baseclass.properties.getProperty("password"));
        Assert.assertTrue(loginPage.verifyLoginFunction.isDisplayed(),
                "couldn't navigate to Dashboard page");
    }

    @Test
    public void verifyLogoutFunction()
    {
        logoutPage=new LogoutPage();
        logoutPage.logout();
        Assert.assertTrue(logoutPage.validationMessage.isDisplayed(),"Logout Failed");
    }

    @After
    public void tearDown()
    {
        baseclass.quitApplication();
    }
}
