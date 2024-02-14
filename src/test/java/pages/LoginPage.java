package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    private By inputEmail = By.id("email");
    private By inputPassword = By.id("senha");
    private By entrerButton = By.cssSelector("button[type=\"submit\"]");
    private By errorMessage = By.cssSelector("div.alert-danger");
    private By createNewUser = By.linkText("Novo usuário?");
    private By loginBox = By. cssSelector("form[action='/logar']");


    public void setEmail(String email){
       sendKeys(inputEmail, email);
    }

    public WebElement getLoginBox(){
       return findElement(loginBox);
    }

    public void setPassword(String password){
        sendKeys(inputPassword, password);
    }

    public void clickLoginButton(){
        click(entrerButton);
    }

    public String getErrorMessage(){
        return getText(errorMessage);
    }

    public void clickCreateNewUser(){
        click(createNewUser);
    }

}
