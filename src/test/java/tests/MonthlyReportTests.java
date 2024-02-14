package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MonthlyReportTests extends BaseTests{

    @Test
    public void testDeleteMovement(){
        loginSteps.logIn();
        homePage.clickMonthlyReport();
        monthlyReportPage.clickDeleteMovement();
        assertEquals(monthlyReportPage.getMessage(), "Movimentação removida com sucesso!", "Text is incorrect");
    }

}
