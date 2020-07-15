package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
//creat a EmailSendPage class we creat parent child relation. extend to util class
public class EmailSendSuccessfullPage extends Util
{
    // store emailSendSuccessMessage  xpath
    private By _emailSendSuccessMessage = By.xpath("//div/div[@class =\"result\"]");
    // print message 'Your message has been sent'
    String expectedemailsendSuccessMessage = "Your message has been sent.";
    // creat verifyUseremailsendSucessfully method
    public void verifyUseremailsendSucessfully()
    {
        // check user can see msg "Your message has been sent"
        Assert.assertEquals(getTextformElement(_emailSendSuccessMessage), expectedemailsendSuccessMessage, "try again");
    }
    // creat userIsclickOnContinuButton method
    public void userIsclickOnContinuButton()
    {
        //click on continu button
        clickonElement(_emailSendSuccessMessage);
}
}

