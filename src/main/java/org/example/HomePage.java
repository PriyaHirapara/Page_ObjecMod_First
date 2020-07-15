package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
//creat a homePage class we creat parent child relation. extend to util class
public class HomePage extends Util
{
    //store locaters in _registerButton veriable
    private By _registerButton = By.xpath("//a[@class=\"ico-register\"]");
    //store locater _welcomeTitleText veriable
    private By _welcomeTitleText =By.xpath("//div[@class =\"topic-block-title\"]/h2");
    //store locater veriable
    private String _expecetedTitleOOfThePage ="Welcome to our store";
    //store locater veriable
    private By _computer = By.xpath("//a[text() =\"Computers \"]");
    //store locater veriable
    private By _bookCategory = By.xpath("//div[@class =\"header-menu\"]/ul[1]/li[5]/a"); // select book category

    //creat varifyuserIsOnHomePage method
    public void varifyuserIsOnHomePage()
    {
        // to check user is no right page or not by using assert
        Assert.assertEquals(getTextformElement(_welcomeTitleText),_expecetedTitleOOfThePage,"Welcome to our store");
    }
    //creat clickonregistter button method
    public void clickOnRegisterButton()
    {
        // give instrtion to user can clickon registration button
        clickonElement(_registerButton);
    }
    //creat userCanClickOnComputerCategory method
    public void userCanClickOnComputerCategory()
    {
        // click on comuter button
        clickonElement(_computer);
    }
    //creat userCanClickOnBookCategory method
    public void userCanClickOnBookCategory()
    {
        // click on book category
        clickonElement(_bookCategory);
    }
}


