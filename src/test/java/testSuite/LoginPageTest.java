package testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;


public class LoginPageTest extends BaseTest {

    @Test // TC1: Verify User can navigate to website
    public void TC1(){

        // Take action on browser
        driver.get("https://davracademy.com/");

        // Request browser information
        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashkote - Bootstrap5 Admin Template";

        // Assert
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test // TC2: Verify Login Page
    public void TC2(){

        // Arrange
        driver.get(loginURL);

        // Act
        String actualTitle = driver.getTitle();
        String expectedTitle = "Login Page";

        // Assert
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test // TC3: Verify Valid Signin
    public void TC3(){
        // Step 1: Navigate to Login page
        driver.get(loginURL);

        // Step 2: Enter valid email
        driver.findElement(By.id("email")).sendKeys("myemail@gmail.com");

        // Step 3: Enter valid password
        driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys("password");

        // Step 4: Click "Submit" button
        driver.findElement(By.xpath("//button")).click();

        // Step 5: Verify Home page open
        Assert.assertEquals(driver.getTitle(), "Dashkote - Bootstrap5 Admin Template");
    }

    @Test // TC4: Verify Login page Header
    public void TC4() {
        // Step1 : Navigate to Log in Page
        driver.get(loginURL);
        // Step2:  Verify page Header "Welcome to Dashkote" is present
        String header = driver.findElement(By.xpath("//h2")).getText();
        Assert.assertEquals(header, "Welcome to Dashkote");
    }

    @Test
    public void VerifyValidSignIn(){
        // Create instance of LoginPage
        LoginPage loginPage = new LoginPage(driver);

        // Navigate to LoginPage
        driver.get("https://msmajidova.github.io/Dashkote-Automation/");

        // Select checkbox
        loginPage.selectCheckbox();

        // Login
        loginPage.login();

        // Verify user is in Home page
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Dashkote - Bootstrap5 Admin Template");

    }
}