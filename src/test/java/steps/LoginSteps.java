package steps;

import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    String username = "qatest12@test.com";
    String password = "test123";

    public LoginSteps(){
        loginPage  = new LoginPage();
    }

    public void logIn(){
        loginPage.setEmail(username);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
    }
}
