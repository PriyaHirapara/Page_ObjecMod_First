package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends BasePage {

    public  void waituntilElementislickble(By by, int a) {
        WebDriverWait wait = new WebDriverWait(driver, a);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public  void sleep1(int n)
    {
        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    // method for click element
    public  void clickonElement(By by) {
        driver.findElement(by).click();
    }
    //method for sendkey
    public  void sendKeyElement(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    // method for get text
    public  String getTextformElement(By by)
    {
        return driver.findElement(by).getText();
    }
    //method for drop down text
    public void selectFromDropDownByVisibleText(By by, String vtext)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(vtext);
    }
    //methodfor drop down value
    public void selectFromDropDownByValue(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    // method for drop down index
    public void selectFromDropDownByIndex(By by, int Indexvalue)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(Indexvalue);
    }
    //method for timestamp
    public  long timestamp()
    {
        return (System.currentTimeMillis());
    }
}
