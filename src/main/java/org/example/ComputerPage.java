package org.example;

import org.openqa.selenium.By;
//creat a ComputerPage class we creat parent child relation. extend to util class
public class ComputerPage extends Util
{
        // store locaters in _Destop veriable
        private By _Destop =By.xpath("//img[@title =\"Show products in category Desktops\"]");

        //creat userCanClickOndestop method
        public void userCanClickOndestop()
        {
           // click on destop
            clickonElement(_Destop);
        }
    }

