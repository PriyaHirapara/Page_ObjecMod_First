package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

//creat a DestopPage class we creat parent child relation. extend to util class
   public class DestopPage extends Util
    {
        private By _actualTextverifyOnDesktopPage=By.xpath("//h1[text()=\"Computers\"]");
        private String _expectedVerifyTextonDesktopPage ="Computers";
        // creat _DigitalVanquish by xpath
        private By _DigitalVanquish = By.xpath("//a[text()=\"Digital Storm VANQUISH 3 Custom Performance PC\"]");



        public void verifyTextOnDeskTopPage() {
            //waituntillElmentVisible(By.xpath("//div[@class=\"product-grid\"]/div[1]/div[2]/div[1]/div[2]/h2[1]/a"),60);
            // Sleep1(6);
            Assert.assertEquals(getTextformElement(_actualTextverifyOnDesktopPage),_expectedVerifyTextonDesktopPage, "PAGE NOT FOUND");
            System.out.println("Computers");
        }

    // creat userCanClickOnDigitalStormProduct method
    public void userCanClickOnDigitalStormProduct()
    {
           // clickon digitalvanquish product
           clickonElement(_DigitalVanquish);
       }
}



