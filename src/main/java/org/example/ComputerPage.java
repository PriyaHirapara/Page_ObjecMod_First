package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

//creat a ComputerPage class we creat parent child relation. extend to util class
public class ComputerPage extends Util
{
    private By _verifyDesktopPagetext=By.xpath("/h1[text()=\"Desktops\"]");
    private String _expectedTextofDesktop ="Desktops";
    // private By _Destop =By.xpath("//img[@title =\"Show products in category Desktops\"]");



        // store locaters in _Destop veriable
        private By _Destop =By.xpath("//img[@title =\"Show products in category Desktops\"]");

        //creat userCanClickOndestop method
        public void userCanClickOndestop()
        {
           // click on destop
            clickonElement(_Destop);
        }
    }

