package pages;

import org.openqa.selenium.By;
import utils.FakerData;

public class RegisterPage extends BasePage{

    private By inputName = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputPassword = By.id("senha");
    private By registerButton = By.cssSelector("input[value='Cadastrar']");
    private By successMessage = By.cssSelector("div[role='alert']");

    String invalidEmail = "qatest12@test.com";

    public void setName(){
        sendKeys(inputName, FakerData.fakerFullName());
    }

    public void setEmail(){
        sendKeys(inputEmail, FakerData.fakerEmail());
    }

    public void setPassword(){
        sendKeys(inputPassword, FakerData.fakerPassword());
    }

    public void clickRegisterButton(){
        click(registerButton);
    }

    public String getMessage(){
        return getText(successMessage);
    }

    public void setInvalidEmail(){
        sendKeys(inputEmail, invalidEmail );
    }
}
