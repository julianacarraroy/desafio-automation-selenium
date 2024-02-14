package pages;

import org.openqa.selenium.By;

public class ListAccountPage extends BasePage{

    private By removeButton = By.cssSelector("#tabelaContas > tbody > tr:nth-child(2) > td:nth-child(2) > a:nth-child(2)");
    private By successMessage = By.cssSelector("div[role='alert']");

    public void clickRemoveButton(){
        click(removeButton);
    }

    public String getMessage(){
        return getText(successMessage);
    }
}
