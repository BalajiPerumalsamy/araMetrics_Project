package com.positiveTests;

import com.araMetricsPage.Login_Page;
import com.araMetricsPage.PasswordUpdatePage;
import com.basePage.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PasswordUpdatePageTest
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

    }

    @Test
    public void verifyUpdatePassword()
    {
        passwordUpdatePage=new PasswordUpdatePage();
        passwordUpdatePage.updatePassword(baseClass.properties.getProperty("currentPassword"),
                baseClass.properties.getProperty("newPassword"));

    }

    @AfterMethod
    public void tearDown()
    {
        baseClass.quitApplication();
    }
}
