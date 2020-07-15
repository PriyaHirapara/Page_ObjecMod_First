package org.example;

import org.openqa.selenium.By;
//creat a DestopPage class we creat parent child relation. extend to util class
public class BookCategoryPage extends Util{
    //store locater veriable
    private By _FahrenheitProduct1 = By.xpath("//div[@class =\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _Close = By.xpath("//span[@class =\"close\"]");//user need to click on "The product has been added to your shopping cart"
    private By _FirstPrizePiesProduct2 = By.xpath("//div[@class =\"item-grid\"]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _ShoppingIcone = By.xpath("//li[@id=\"topcartlink\"]");

    // creat userCanAddProductInBasket method
    public void userCanAddProductInBasket()
    {
        // click on Fahrenhe product
        clickonElement(_FahrenheitProduct1);
        // click close
        clickonElement(_Close);
        // click on FirstPrizePies Product
        clickonElement(_FirstPrizePiesProduct2);
    }
    // creat userCanCheckInShoppingCart method
    public void userCanCheckInShoppingCart()
    {
        // click on shopping icone
        clickonElement(_ShoppingIcone);
    }
}
