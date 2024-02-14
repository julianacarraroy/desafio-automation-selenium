package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests{

    private String unSubscribedUser = "naocadastrado@teste.com";
    private String password = "123";


    @Test
    public void testSuccessfulLogin(){
        loginSteps.logIn();
        assertTrue(homePage.getWelcomeMessage().contains("Bem vindo"), "Text is incorrect");
    }

    @Test
    public void testFailLogin(){
        loginPage.setEmail(unSubscribedUser);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        assertTrue(loginPage.getErrorMessage().contains("Problemas com o login do usuário"), "Text is incorrect");

    }

    @Test
    public void testLogOut(){
        loginSteps.logIn();
        homePage.clickLogOut();
        assertTrue(loginPage.getLoginBox( ).isDisplayed(), "LogOut Error");
    }


}

