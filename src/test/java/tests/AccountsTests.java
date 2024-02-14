package tests;


import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AccountsTests extends BaseTests{


    @Test
    public void testCreateNewAccount(){
        loginSteps.logIn();
        homePage.clickAddNewAccount();
        newAccountPage.nameAccount();
        newAccountPage.clickSubmitAccount();
        assertEquals(newAccountPage.getMessage(), "Conta adicionada com sucesso!", "Text is incorrect");
    }

    @Test
    public void testAnonymousNewAccount(){
        loginSteps.logIn();
        homePage.clickAddNewAccount();
        newAccountPage.clickSubmitAccount();
        assertEquals(newAccountPage.getMessage(), "Informe o nome da conta", "Text is incorrect");
    }

    @Test
    public void testSameNameNewAccount(){
        loginSteps.logIn();
        homePage.clickAddNewAccount();
        newAccountPage.setSameNameAccount();
        newAccountPage.clickSubmitAccount();
        homePage.clickAddNewAccount();
        newAccountPage.setSameNameAccount();
        newAccountPage.clickSubmitAccount();
        assertEquals(newAccountPage.getMessage(), "Já existe uma conta com esse nome!", "Text is incorrect");
    }

    @Test
    public void deleteAccount(){
        loginSteps.logIn();
        homePage.clickListAccounts();
        listAccountPage.clickRemoveButton();
        assertEquals(listAccountPage.getMessage(), "Conta removida com sucesso!", "Text is incorrect");


    }
}
