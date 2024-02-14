package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTests{

    @Test
    public void testSuccessfulRegistration(){
        loginPage.clickCreateNewUser();
        registerPage.setName();
        registerPage.setEmail();
        registerPage.setPassword();
        registerPage.clickRegisterButton();
        Assert.assertEquals(registerPage.getMessage(), "Usuário inserido com sucesso", "Text is incorrect");

    }

    @Test
    public void testUnsuccessfulRegistration(){
        loginPage.clickCreateNewUser();
        registerPage.setName();
        registerPage.setInvalidEmail();
        registerPage.setPassword();
        registerPage.clickRegisterButton();
        Assert.assertEquals(registerPage.getMessage(), "Endereço de email já utilizado", "Text is incorrect");

    }

}
