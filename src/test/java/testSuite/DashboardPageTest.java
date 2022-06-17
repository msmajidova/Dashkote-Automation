package testSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashboardPageTest {

    WebDriver driver;

    @BeforeTest
    public void BeforeTest(){
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void AfterTest(){
        driver.quit();
    }

    @Test
    public void TestCase_01_VerifyUserCanNavigateToDashboard(){
        //      Step 1 - Open browser
        //      Step 2 - Navigate to default Dashboard
        driver.get("https://davracademy.com/index.html");
        //      Step 3 - Verify Dashboard page is displayed
        String actualTitle = driver.findElement(By.xpath("//div[@class=\"breadcrumb-title pe-3\"]")).getText();
        Assert.assertEquals(actualTitle, "Dashboard");
    }

    @Test
    public void TestCase_02_UserShouldBeAbleToSearchFromDashboard(){

    }




    // Test Case 01 - Verify User can navigate to Dashboard
    //      Step 1 - Open browser
    //      Step 2 - Navigate to default Dashboard
    //      Step 3 - Verify Dashboard page is displayed

    // Test Case 02 - User should be able to search from Dashboard

    // Test Case 03 - Verify Dashboard page elements

    // Test Case 04 - Verify "Settings" dropdown

    // Test Case 05 - Verify user can switch page mode from bright to dark
    //      Step 1 - Navigate to Dashboard page
    //      Step 2 - Click moon icon from top right
    //      Step 3 - Verify page mode changed to dark mode
    //      Step 4 - Verify moon icon changed to sun icon
    //      Step 5 - Click the sun icon
    //      Step 6 - Verify page switched to bright mode
}
