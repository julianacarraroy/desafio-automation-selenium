package pages;

import org.openqa.selenium.By;
import utils.FakerData;

public class MovementPage extends BasePage{

    private By movementType= By.id("tipo");
    private By incomeOption = By.cssSelector("option[value='REC']");
    private By outcomeOption= By.cssSelector("option[value='DESP']");
    private By movementDate = By.id("data_transacao");
    private By payDate = By.id("data_pagamento");
    private By incomeDescription = By.id("descricao");
    private By stakeholder = By.cssSelector("input[name='interessado']");
    private By value = By.id("valor");
    private By account = By.id("conta");
    private By selectAccount = By.cssSelector("#conta > option:nth-child(1)");
    private By radioPaid = By.cssSelector("#status_pago");
    private By radioUnpaid = By.cssSelector("#status_pendente");
    private By submitButton = By.cssSelector("button[type='submit']");
    private By message = By.cssSelector("div[role='alert']");
    private String salary = "Salário";
    private String rent = "Aluguel";





    public void clickMovementTipe(){
        click(movementType);
    }

    public void clickIncomeOption(){
        click(incomeOption);
    }

    public void clickOutcomeOption(){
        click(outcomeOption);
    }

    public void setMovementDate(){
        sendKeys(movementDate, FakerData.returnFakerFormatDate());
    }

    public void setPayDate(){
        sendKeys(payDate, FakerData.returnFakerFormatDate());
    }

    public void setIncomeDescription(){
        sendKeys(incomeDescription, salary);
    }

    public void setOutcomeDescription(){
        sendKeys(incomeDescription, rent);
    }

    public void setStakeholder(){
        sendKeys(stakeholder, FakerData.fakerFullName());
    }

    public void setValue(){
        sendKeys(value, FakerData.returnFakerValue().toString() );
    }

    public void clickAccount(){
        click(account);
    }

    public void setAccount(){
        click(selectAccount);
    }

    public void clickPaidAccount(){
        click(radioPaid);
    }

    public void clickSubmit(){
        click(submitButton);
    }

    public String getMessage(){
        return getText(message);
    }


}
