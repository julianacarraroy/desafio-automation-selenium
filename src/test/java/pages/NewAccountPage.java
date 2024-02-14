package pages;


import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import java.util.Locale;

public class NewAccountPage extends BasePage{

    private By inputName = By.id("nome");
    private By submitButton = By.cssSelector("button[type='submit']");
    private By successMessage = By.cssSelector("div[role='alert']");

    String prefixAccount = "Conta";
    String sameName = "Conta Fabio";
    Faker faker = new Faker(Locale.forLanguageTag("pt-BR"));
    String account = faker.name().lastName();

    public void nameAccount(){
        sendKeys(inputName, prefixAccount + account);
    }

    public void clickSubmitAccount(){
        click(submitButton);
    }

    public String getMessage(){
        return getText(successMessage);
    }

    public void setSameNameAccount(){
        driver.findElement(inputName).sendKeys(sameName);

    }
}
