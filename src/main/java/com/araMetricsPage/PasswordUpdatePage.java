package com.araMetricsPage;

import com.basePage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordUpdatePage extends BaseClass
{
    public PasswordUpdatePage()
    {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//span[text()='Settings']")
    WebElement settingsButton;

    @FindBy(xpath="//input[@placeholder='Enter current password']")
    WebElement currentPassword;

    @FindBy(xpath="//input[@placeholder='Enter new password']")
    WebElement newPassword;

    @FindBy(xpath="//button[text()='Update Password']")
    WebElement updatePasswordButton;


    public void updatePassword(String currentPass,String newPass)
    {
        clickButton(settingsButton);
        Actions act=new Actions(driver);

        act.moveToElement(currentPassword).perform();
        writeText(currentPass,currentPassword);
        act.moveToElement(newPassword).perform();
        writeText(newPass,newPassword);
        act.moveToElement(updatePasswordButton).perform();
        clickButton(updatePasswordButton);
    }
}
