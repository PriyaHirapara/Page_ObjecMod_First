package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

public class RegisterSuccessPage extends Util
{
    // store registerSuccessMessage veriable
    private By _registerSuccessMessage = By.xpath("//div/div[text()=\"Your registration completed\"]");
    // declared expecter message
    String expectedRegisterSuccessMessage = "Your registration completed";
    // store clickOnContinueButto veriable
    private By _clickOnContinueButton = By.xpath("//input[@name=\"register-continue\"]");

    // creat verifyUserRegisterdSucessfully method
    public void verifyUserRegisterdSucessfully()
    {
        // assert expected to expected method
        Assert.assertEquals(getTextformElement(_registerSuccessMessage), expectedRegisterSuccessMessage, "try again");
    }
    // creat userIsclickOnContinuButton method
    public void userIsclickOnContinuButton()
    {
        clickonElement(_clickOnContinueButton);
    }
}

