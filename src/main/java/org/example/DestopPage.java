package org.example;

import org.openqa.selenium.By;
    //creat a DestopPage class we creat parent child relation. extend to util class
   public class DestopPage extends Util
    {
     // creat _DigitalVanquish by xpath
    private By _DigitalVanquish = By.xpath("//a[text()=\"Digital Storm VANQUISH 3 Custom Performance PC\"]");
    // creat userCanClickOnDigitalStormProduct method
    public void userCanClickOnDigitalStormProduct()
    {
           // clickon digitalvanquish product
           clickonElement(_DigitalVanquish);
       }
}



