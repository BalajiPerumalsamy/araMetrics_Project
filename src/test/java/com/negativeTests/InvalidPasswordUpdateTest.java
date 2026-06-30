package com.negativeTests;

import com.araMetricsPage.Login_Page;
import com.araMetricsPage.PasswordUpdatePage;
import com.basePage.BaseClass;
import com.listeners.MyListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class InvalidPasswordUpdateTest
{
    public BaseClass baseClass;
    public Login_Page loginPage;
    public PasswordUpdatePage passwordUpdatePage;

    @BeforeMethod
    public void setup()
    {
        baseClass=new BaseClass();
        baseClass.navigateToApplication();
        loginPage=new Login_Page();
        loginPage.login(baseClass.properties.getProperty("email"),baseClass.properties.getProperty("password"));
        Assert.assertTrue(loginPage.verifyLoginFunction.isDisplayed(),
                "couldn't navigate to Dashboard page");
        Assert.assertTrue(loginPage.toastMessage.isDisplayed(),
                "couldn't navigate to Dashboard Page");
    }

    @Test (priority = 1)
    public void verifyInvalidPasswordUpdate1()
    {
        passwordUpdatePage=new PasswordUpdatePage();
        passwordUpdatePage.updatePassword(baseClass.properties.getProperty("currentPassword"),
                baseClass.properties.getProperty("invalidPassword1"));
        Assert.assertTrue(passwordUpdatePage.errorMessage.isDisplayed(),"Password changed successfully");
    }

    @Test (priority = 2)
    public void verifyInvalidPasswordUpdate2()
    {
        passwordUpdatePage=new PasswordUpdatePage();
        passwordUpdatePage.updatePassword(baseClass.properties.getProperty("currentPassword"),
                baseClass.properties.getProperty("invalidPassword2"));
        Assert.assertTrue(passwordUpdatePage.errorMessage.isDisplayed(),"Password changed successfully");
    }

    @Test (priority = 3)
    public void verifyInvalidPasswordUpdate3()
    {
        passwordUpdatePage=new PasswordUpdatePage();
        passwordUpdatePage.updatePassword(baseClass.properties.getProperty("currentPassword"),
                baseClass.properties.getProperty("invalidPassword3"));
        Assert.assertTrue(passwordUpdatePage.errorMessage.isDisplayed(),"Password changed successfully");
    }

    @Test (priority = 4)
    public void verifyInvalidPasswordUpdate4()
    {
        passwordUpdatePage=new PasswordUpdatePage();
        passwordUpdatePage.updatePassword(baseClass.properties.getProperty("currentPassword"),
                baseClass.properties.getProperty("invalidPassword4"));
        Assert.assertTrue(passwordUpdatePage.errorMessage.isDisplayed(),"Password changed successfully");
    }

    @Test (priority = 5)
    public void verifyInvalidPasswordUpdate5()
    {
        passwordUpdatePage=new PasswordUpdatePage();
        passwordUpdatePage.updatePassword(baseClass.properties.getProperty("currentPassword"),
                baseClass.properties.getProperty("invalidPassword5"));
        Assert.assertTrue(passwordUpdatePage.lessThanErrorMessage.isDisplayed(),"Password changed successfully");
    }

    @AfterMethod
    public void tearDown()
    {
        baseClass.quitApplication();
    }
}
