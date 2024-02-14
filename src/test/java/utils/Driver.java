package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    public static WebDriver INSTANCE = null;

    public static void createInstance(){
        INSTANCE = new ChromeDriver();
    }

    private ChromeOptions getCromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        return options;
    }

    public static void quitInstance() {
        INSTANCE.quit();
        INSTANCE = null;
    }
}
