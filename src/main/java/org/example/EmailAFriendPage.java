package org.example;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Util
{
    // creat EmailAfriend by xpath
    private By _EmailAfriend = By.xpath("//input[@value=\"Email a friend\"]");
    // creat userIsclickOnEmailOnFriend method
    public void userIsclickOnEmailOnFriend()
    {
        // click on emailfriend icon
        clickonElement(_EmailAfriend);
    }
}
