package com.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFullScript {

    public static final String
            DRIVER_PATH =
            "/Users/fas/OneDrive/Cursos/20210927-PruebasAutomatizadas/Descargas/chromedriverbeta94";
    public static final String TEST_FORM_URL = "https://demoqa.com/automation-practice-form";

    public static void main (String[] args) throws InterruptedException {

        System.setProperty ("webdriver.chrome.driver",
                DRIVER_PATH);

        WebDriver driver = new ChromeDriver ();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        driver.manage ().window ().maximize ();
        driver.get (TEST_FORM_URL);

        System.out.println (driver.getTitle ());

        driver.findElement (By.id ("firstName")).sendKeys ("Aname");
        driver.findElement (By.id ("lastName")).sendKeys ("Alastname");
        driver.findElement (By.id ("userEmail")).sendKeys ("mail@server.com");
        driver.findElement (By.id ("userNumber")).sendKeys ("1234567890");

        //Radio buttons
        WebElement radioButtonMale = driver.findElement (By.id ("gender-radio-1"));
        javascriptExecutor.executeScript ("arguments[0].checked = true", radioButtonMale);

        //Checkboxes
        WebElement checkButtonHobbieSports = driver.findElement (By.id ("hobbies-checkbox-1"));
        javascriptExecutor.executeScript ("arguments[0].checked = true", checkButtonHobbieSports);

        WebElement checkButtonHobbieMusic = driver.findElement (By.id ("hobbies-checkbox-3"));
        javascriptExecutor.executeScript ("arguments[0].checked = true", checkButtonHobbieMusic);

        //Date picker
        Actions actions = new Actions (driver);
        actions.moveToElement (driver.findElement (By.xpath ("//*[@id='dateOfBirthInput']")));
        actions.click ();
        actions.sendKeys (Keys.BACK_SPACE).sendKeys (Keys.BACK_SPACE).sendKeys (Keys.BACK_SPACE)
                .sendKeys (Keys.BACK_SPACE).sendKeys (Keys.BACK_SPACE).sendKeys (Keys.BACK_SPACE)
                .sendKeys (Keys.BACK_SPACE).sendKeys (Keys.BACK_SPACE).sendKeys (Keys.BACK_SPACE)
                .sendKeys (Keys.BACK_SPACE).sendKeys (Keys.BACK_SPACE);

        Thread.sleep (3000);

        actions.sendKeys ("1980-12-10");
        actions.sendKeys (Keys.ESCAPE);
        actions.build ().perform ();

        //File upload
        WebElement uploadElement = driver.findElement (By.id ("uploadPicture"));
        uploadElement.sendKeys ("/Users/fas/OneDrive/Cursos/20210927-PruebasAutomatizadas/Descargas/image.png");

        //Text area
        driver.findElement (By.id ("currentAddress")).sendKeys ("A address");

        //Select list
        WebElement select3 = driver.findElement (By.id ("react-select-3-input"));
        select3.sendKeys ("NCR");
        select3.sendKeys (Keys.TAB);

        WebElement select4 = driver.findElement (By.id ("react-select-4-input"));
        select4.sendKeys ("Delhi");
        select4.sendKeys (Keys.TAB);

        //Submit #1 way, not worked for me
        //driver.findElement (By.id ("submit")).click ();
        //Submit #2, safer way (if recieving "org.openqa.selenium.ElementClickInterceptedException: element click intercepted" message)
        WebDriverWait wait = new WebDriverWait (driver, 10);
        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='submit']")));
        javascriptExecutor.executeScript ("arguments[0].click();", submit);

        Thread.sleep (3000);

        driver.close ();

    }

}
