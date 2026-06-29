package com.araMetricsPage;

import com.basePage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends BaseClass
{
    public Login_Page()
    {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//button[text()='Login']")
    WebElement clickLoginButton;

    @FindBy(xpath="//input[@type='email']")
    WebElement userName;

    @FindBy(xpath="//input[@type='password']")
    WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    WebElement loginButton;

    public @FindBy(xpath="//img[@alt='Expanded Logo']")
    WebElement verifyLoginFunction;

    @FindBy(xpath="//div[text()='Invalid credentials']")
    WebElement invalidLoginFunction;

    public void login(String name,String pass)
    {
        clickButton(clickLoginButton);
        writeText(name,userName);
        writeText(pass,password);
        clickButton(loginButton);
    }

    public String invalidActualOutput()
    {
        return invalidLoginFunction.getText();
    }

    public String invalidExpectedOutput()
    {
        return "Invalid credentials";
    }
}
