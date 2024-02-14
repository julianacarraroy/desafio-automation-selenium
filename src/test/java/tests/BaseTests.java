package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;
import steps.LoginSteps;
import utils.Driver;
import utils.ExtentReportUtils;
import java.lang.reflect.Method;
import java.time.Duration;


public class BaseTests {


    LoginPage loginPage;
    HomePage homePage;
    RegisterPage registerPage;
    NewAccountPage newAccountPage;
    ListAccountPage listAccountPage;
    LoginSteps loginSteps;
    MovementPage movementPage;
    MonthlyReportPage monthlyReportPage;



    @BeforeMethod
    public void setUp(Method method){
        ExtentReportUtils.addTest(method.getName(), method.getDeclaringClass().getSimpleName());
        WebDriverManager.chromedriver().setup();
        Driver.createInstance();
        Driver.INSTANCE.get("https://seubarriga.wcaquino.me/login");
        Driver.INSTANCE.manage().window().maximize();
        Driver.INSTANCE.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        loginPage = new LoginPage();
        homePage = new HomePage();
        registerPage = new RegisterPage();
        newAccountPage = new NewAccountPage();
        listAccountPage = new ListAccountPage();
        loginSteps = new LoginSteps();
        movementPage = new MovementPage();
        monthlyReportPage = new MonthlyReportPage();
    }

    @BeforeTest
    public void beforeTest(){
        ExtentReportUtils.createReport();
    }

    @AfterMethod
    public void afterTest(ITestResult result) {
        ExtentReportUtils.addTestResult(result);
        Driver.quitInstance();
    }

    @AfterSuite
    public void tearDown() {
        ExtentReportUtils.generateReport();
    }

}
