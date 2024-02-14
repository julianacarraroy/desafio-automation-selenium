package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;
import java.time.Duration;


public class BasePage {

    WebDriver driver;
    private WebDriverWait wait;


    public BasePage(){
        driver = Driver.INSTANCE;
    }

    public void waitVisibilityOfElement(By element, int seconds){
        wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void sendKeys(By locale, String text){
        driver.findElement(locale).sendKeys(text);
    }

    public void click(By locale){
        driver.findElement(locale).click();
    }

    public String getText(By locale){
        waitVisibilityOfElement(locale, 5);
        return driver.findElement(locale).getText();
    }

    public WebElement findElement(By locale){
        return driver.findElement(locale);
    }
}
