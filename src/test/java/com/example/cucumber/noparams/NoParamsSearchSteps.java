package com.example.cucumber.noparams;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoParamsSearchSteps {

    private WebDriver driver;

    private By searchBoxLocator = By.id("search_query_top");
    private By searchBtnLocator = By.name("submit_search");
    private By resultTextLocator = By.cssSelector("span.heading-counter");

    public static final String
            DRIVER_PATH =
            "/Users/fas/OneDrive/Cursos/20210927-PruebasAutomatizadas/Descargas/chromedriverbeta94";
    public static final String TEST_FORM_URL = "http://automationpractice.com/index.php";

    @Given ("Abre el web browser Chrome y direcciona a la aplicación$")
    public void openBrowser () {
        System.setProperty ("webdriver.chrome.driver",
                DRIVER_PATH);
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.get (TEST_FORM_URL);
    }

    @When ("Ingreso el nombre del producto a buscar blouse$")
    public void whenSearchBlouse () {
        System.out.println ("Llega al when");
        driver.findElement(searchBoxLocator).sendKeys("blouse");
        driver.findElement(searchBtnLocator).click();
    }

    @When ("Ingreso el nombre del producto a buscar shoes$")
    public void whenSearchShoes () {
        System.out.println ("Llega al when");
        driver.findElement(searchBoxLocator).sendKeys("shoes");
        driver.findElement(searchBtnLocator).click();
    }

    @Then ("Visualizo resultado de la búsqueda$")
    public void then () {
        System.out.println ("Llega al then");
        String resultText = driver.findElement(resultTextLocator).getText();
        System.out.println("Resultado:" + resultText);
    }

    @And ("Cierro el web browser$")
    public void and () {
        driver.close ();
    }

}
