package com.seuprojeto.testes.pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DefaultPage {

    WebDriver driver;

    public DefaultPage(){
        ChromeOptions options = new ChromeOptions();

        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver(options);

    }

    public WebDriver getDriver() {
        return driver;

    }
    public void navigateTo(String url) {
        driver.get(url);
        //driver.manage().window().maximize();
    }

    public void inputText(By locator, String value){
        WebElement element = getDriver().findElement(locator);
        element.clear();
        element.sendKeys(value);
    }

    public void click(By locator){
        WebElement element = getDriver().findElement(locator);
        element.click();
    }
}
