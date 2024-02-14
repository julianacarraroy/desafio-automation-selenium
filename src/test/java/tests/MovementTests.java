package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MovementTests extends BaseTests{

    @Test
    public void testNewIncome(){
        loginSteps.logIn();
        homePage.createMovement();
        movementPage.clickMovementTipe();
        movementPage.clickIncomeOption();
        movementPage.setMovementDate();
        movementPage.setPayDate();
        movementPage.setIncomeDescription();
        movementPage.setStakeholder();
        movementPage.setValue();
        movementPage.clickAccount();
        movementPage.setAccount();
        movementPage.clickPaidAccount();
        movementPage.clickSubmit();
        Assert.assertEquals(movementPage.getMessage(), "Movimentação adicionada com sucesso!", "Text is incorrect");

    }

    @Test
    public void testNewOutcome(){
        loginSteps.logIn();
        homePage.createMovement();
        movementPage.clickMovementTipe();
        movementPage.clickOutcomeOption();
        movementPage.setMovementDate();
        movementPage.setPayDate();
        movementPage.setOutcomeDescription();
        movementPage.setStakeholder();
        movementPage.setValue();
        movementPage.clickAccount();
        movementPage.setAccount();
        movementPage.clickPaidAccount();
        movementPage.clickSubmit();
        Assert.assertEquals(movementPage.getMessage(), "Movimentação adicionada com sucesso!", "Text is incorrect");

    }
}
