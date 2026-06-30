package com.positiveTests;

import com.araMetricsPage.Login_Page;
import com.basePage.BaseClass;
import com.listeners.MyListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class LoginPageTest
{
    public BaseClass baseClass;
    public Login_Page loginPage;

    @BeforeMethod
    public void setup()
    {
        baseClass=new BaseClass();
        baseClass.navigateToApplication();
    }

    @Test
    public void VerifyLogin()
    {
        loginPage=new Login_Page();
        loginPage.login(baseClass.properties.getProperty("email"),baseClass.properties.getProperty("password"));
        Assert.assertTrue(loginPage.verifyLoginFunction.isDisplayed(),
                "couldn't navigate to Dashboard page");
        Assert.assertTrue(loginPage.toastMessage.isDisplayed(),
                "couldn't navigate to Dashboard page");
    }

    @AfterMethod
    public void tearDown()
    {
        baseClass.quitApplication();
    }
}