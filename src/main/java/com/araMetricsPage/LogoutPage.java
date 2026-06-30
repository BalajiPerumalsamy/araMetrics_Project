package com.araMetricsPage;

import com.basePage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BaseClass
{
    public LogoutPage()
    {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//span[text()='Logout']")
    WebElement clickLogoutButton;

    public @FindBy(xpath="//h1[text()='Welcome to araMetrics!']")
    WebElement validationMessage;


    public void logout()
    {
        clickButton(clickLogoutButton);
    }
}
