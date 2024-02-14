package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestResult;


public class ExtentReportUtils {

    public static ExtentReports EXTENT_REPORT = null;
    public static ExtentTest TEST;
    public static ExtentSparkReporter SPARK_REPORT = null;


    public static void createReport() {
        if (EXTENT_REPORT == null) {
            SPARK_REPORT = new ExtentSparkReporter("extentReport.html");
            EXTENT_REPORT = new ExtentReports();
            SPARK_REPORT.config().setEncoding("UTF-8");
            EXTENT_REPORT.attachReporter(SPARK_REPORT);
            TEST = EXTENT_REPORT.createTest("Result test - Seu Barriga" + GeneralUtils.getNowDate("yyyy-MM-dd_HH-mm-ss"));
        }
    }

    public static void addTest(String testName, String testCategory) {
        TEST = EXTENT_REPORT.createTest(testName).assignCategory(testCategory.replace("Tests", ""));
    }
//    public static void addTest() {
//        if (TEST != null) {
//            TEST.log(Status.PASS, "Success!");
//            TEST.pass("Test passed");
//        }
//    }

    public static void addTestResult(ITestResult result) {
        switch (result.getStatus()) {

            case ITestResult.FAILURE:
                TEST.log(Status.FAIL, "Test result " + Status.FAIL);
                break;
            case ITestResult.SUCCESS:
                TEST.log(Status.PASS, "Test result " + Status.PASS);
                break;
        }
    }

    public static void generateReport() {
        if (EXTENT_REPORT != null) {
            EXTENT_REPORT.flush();
        }
    }
}
