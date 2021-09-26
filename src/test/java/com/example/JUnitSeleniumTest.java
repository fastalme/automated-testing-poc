package com.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitSeleniumTest {

    private static WebDriver driver;
    public static final String
            DRIVER_PATH =
            "/Users/fas/OneDrive/Cursos/20210927-PruebasAutomatizadas/Descargas/chromedriverbeta94";

    public final String TEST_FORM_URL = "https://demoqa.com/automation-practice-form";
    private final String TEST_FORM_TITLE = "ToolsQA";

    @BeforeAll
    public static void runBeforeAllTheTestsOfThisClass() {

        System.setProperty ("webdriver.chrome.driver",
                DRIVER_PATH);
        driver = new ChromeDriver ();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        driver.manage ().window ().maximize ();

    }

    @BeforeEach
    public void runBeforeEachTest() {

        driver.get (TEST_FORM_URL);

    }

    @Test
    public void testPageTitle() {

        Assertions.assertEquals (TEST_FORM_TITLE, driver.getTitle ());

    }

    @Test
    public void testPageUrl() {

        Assertions.assertEquals (TEST_FORM_URL, driver.getCurrentUrl ());

    }

    @AfterAll
    public static void runAfterAllTheTestsOfThisClass() {

        driver.close ();

    }

}
