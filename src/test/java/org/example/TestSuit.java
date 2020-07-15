package org.example;


import org.testng.annotations.Test;

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
        computerPage.userCanClickOndestop();
        destopPage.userCanClickOnDigitalStormProduct();
        emailAFriendPage.userIsclickOnEmailOnFriend();
        emailSendPage.userIsclickOnSendEmail();
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



