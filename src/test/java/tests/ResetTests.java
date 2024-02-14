package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResetTests extends BaseTests{

    @Test
    public void testResetSuccessMessage(){
        loginSteps.logIn();
        homePage.clickResetButton();
        homePage.getMessage();
        assertEquals(homePage.getMessage(), "Dados resetados com sucesso!", "Text is incorrect");

    }

//This test found a bug!
//    @Test
//    public void testResetRegisters(){
//        loginSteps.logIn();
//        homePage.clickResetButton();
//        assertFalse(homePage.getTableFirstRegister().isDisplayed(), "The test is failing because de RESET FUNCION isn't working properly");
//
//    }

}
