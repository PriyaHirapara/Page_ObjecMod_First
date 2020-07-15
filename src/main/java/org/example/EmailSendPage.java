package org.example;

import org.openqa.selenium.By;
//creat a EmailSendPage class we creat parent child relation. extend to util class
public class EmailSendPage extends Util
{
    //store locaters in veriable
    private By _FriendEmail = By.xpath("//input[@id=\"FriendEmail\"]");
    private By _personalMassage = By.xpath("//textarea[@id=\"PersonalMessage\"]");
    private By _SendEmail = By.xpath("//input[@value=\"Send email\"]");

    // creat userIsclickOnSendEmail method
    public void userIsclickOnSendEmail()
    {
        // send text in  friendemail
        sendKeyElement(_FriendEmail,"pu2111@gmail.com");
        // send text in personalMassage
        sendKeyElement(_personalMassage, " its my recomanda product");
        // click on sendemail button
        clickonElement(_SendEmail);
    }
}
