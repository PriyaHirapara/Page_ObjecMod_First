package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends BaseTest{
    // creat all object from all class
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    ComputerPage computerPage = new ComputerPage();
    DestopPage destopPage = new DestopPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    EmailSendPage emailSendPage = new EmailSendPage();
    EmailSendSuccessfullPage emailSendSuccessfullPage = new EmailSendSuccessfullPage();
    BookCategoryPage bookCategoryPage = new BookCategoryPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();



    @Test
    public void verifyEachproducthasName(){

        List<WebElement> productList = driver.findElements(By.xpath("//div [@class =\"product-grid\"]/div[1]/div/div[1]/div[2]/h2"));
        System.out.println("productlist count :" +productList.size());

        for (WebElement product:productList)
        {
            System.out.println(product.getText());
        }
    }

    @Test
    // creat method for registeretion
    public void userShouldRegisterSuccesfully()
    {
        // through object call  all method
        homePage.varifyuserIsOnHomePage();
        // through click on registration
        homePage.clickOnRegisterButton();
        // though user enter registration detiail
        registerPage.userEnterRegistrationDetails();
         // through click on registrationbutton
        registerPage.userIsClickingonRegistrationButton();
        // through verify registerd sucessfully
        registerSuccessPage.verifyUserRegisterdSucessfully();
         // through user click on continubutton
        registerSuccessPage.userIsclickOnContinuButton();
    }
    @Test(priority = 1)
    // creat registerUserCanReferProductToFriend method for refer product to friend
    public void registerUserCanReferProductToFriend()
    {
        // through object call  all method
        homePage.varifyuserIsOnHomePage();
        homePage.clickOnRegisterButton();
        registerPage.userEnterRegistrationDetails();
        registerPage.userIsClickingonRegistrationButton();
        registerSuccessPage.verifyUserRegisterdSucessfully();
        registerSuccessPage.userIsclickOnContinuButton();
        homePage.userCanClickOnComputerCategory();
        //computerPage.verifyTextonDesktoppage();
        computerPage.userCanClickOndestop();
       // destopPage.verifyTextOnDeskTopPage();
        destopPage.userCanClickOnDigitalStormProduct();
        emailAFriendPage.userIsclickOnEmailOnFriend();
        emailSendPage.userIsclickOnSendEmail();
        //emailSendPage.verifytextOnEmilsendpage();
        emailSendSuccessfullPage.verifyUseremailsendSucessfully();
    }
    @Test(priority = 2)
    // creat method to add product in basket
    public void UserShouldAbleToAddProductTOBasketSuccessfully ()
    {
        // through object call  all method
        homePage.varifyuserIsOnHomePage();
        homePage.userCanClickOnBookCategory();
        bookCategoryPage.userCanAddProductInBasket();
        bookCategoryPage.userCanCheckInShoppingCart();
        shoppingCartPage.verifyUserCanAbleToSeeShoopingCart();
        shoppingCartPage.verifyUserCanAbleToSeeSelectedProductInCart();
    }
}



