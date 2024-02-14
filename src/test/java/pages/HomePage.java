package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private By welcomeMessage = By.cssSelector("div.alert-success");
    private By accountButton = By.linkText("Contas");
    private By addNewAcountButton = By.linkText("Adicionar");
    private By listAccounts = By.linkText("Listar");
    private By movementButton = By.linkText("Criar Movimentação");
    private By monthlyReport = By.linkText("Resumo Mensal");
    private By logOutButton = By.linkText("Sair");
    private By resetButton = By.linkText("reset");
    private By successMessage = By.cssSelector("div[role='alert']");
    private By tableFirstRegister = By.cssSelector("#tabelaSaldo > tbody > tr:nth-child(1)");


    public String getWelcomeMessage(){
        return getText(welcomeMessage);

    }

    public void clickAddNewAccount(){
        click(accountButton);
        click(addNewAcountButton);

    }

    public void clickListAccounts(){
        click(accountButton);
        click(listAccounts);

    }

    public void createMovement(){
        click(movementButton);
    }

    public void clickMonthlyReport(){
        click(monthlyReport);
    }

    public void clickLogOut(){
        click(logOutButton);
    }

    public void clickResetButton(){
        click(resetButton);
    }

    public String getMessage(){
        return getText(successMessage);
    }

    public WebElement getTableFirstRegister(){
        return findElement(tableFirstRegister);
    }
}
