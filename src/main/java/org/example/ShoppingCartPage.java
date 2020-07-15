package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Util {
    // declared expected massage
    String expectedMassage = "Shopping cart";
    // declared expected massage
    String expectedBradburyProductName = "Fahrenheit 451 by Ray Bradbury";
    // declared expected massage
    String expectedFirstPrizeProductName = "First Prize Pies";

    // creat verifyUserCanAbleToSeeShoopingCart method
    public void verifyUserCanAbleToSeeShoopingCart()
    {
        // store actual massage
        String actualMassageShoppingCartTital = getTextformElement(By.xpath("//div[@class= \"page-title\"]/h1"));
        // store expected massage
        String expectedMassageShoppingCartTital = "Shopping cart";
        // assert expected to actual
        Assert.assertEquals(actualMassageShoppingCartTital, expectedMassageShoppingCartTital);
    }
    // creat  verifyUserCanAbleToSeeSelectedProductInCart method
    public void verifyUserCanAbleToSeeSelectedProductInCart()
    {
         // actual product name
        String actualBradburyProductName = getTextformElement(By.xpath("//table[@class =\"cart\"]/tbody[1]/tr[1]/td[4] "));
        //expected product name
        String expectedBradburyProductName = "Fahrenheit 451 by Ray Bradbury";
        // assert to actual to expected
        Assert.assertEquals(actualBradburyProductName,expectedBradburyProductName);
        // actual product name
        String actualFirstPrizeProductName = getTextformElement(By.xpath("//table[@class =\"cart\"]/tbody[1]/tr[2]/td[4]"));
        // expected product name
        String expectedFirstPrizeProductName = "First Prize Pies";
        // assert to actual to expected
        Assert.assertEquals(actualFirstPrizeProductName,expectedFirstPrizeProductName);
    }}


