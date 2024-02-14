package pages;

import org.openqa.selenium.By;

public class MonthlyReportPage extends BasePage{

    private By deleteButton = By.cssSelector("#tabelaExtrato > tbody > tr:nth-child(1) > td:nth-child(6) > a");
    private By successMessage = By.cssSelector("div[role='alert']");

    public void clickDeleteMovement(){
        click(deleteButton);
    }

    public String getMessage(){
        return getText(successMessage);
    }
}
