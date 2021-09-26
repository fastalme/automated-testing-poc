package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicScript {

    public static final String
            DRIVER_PATH =
            "/Users/fas/OneDrive/Cursos/20210927-PruebasAutomatizadas/Descargas/chromedriverbeta94";

    public static void main (String[] args) {

        System.setProperty ("webdriver.chrome.driver",
                DRIVER_PATH);

        WebDriver driver = new ChromeDriver ();

        driver.manage ().window ().maximize ();
        driver.get ("https://demoqa.com/automation-practice-form");

        System.out.println (driver.getTitle ());

        driver.close ();

    }

}
