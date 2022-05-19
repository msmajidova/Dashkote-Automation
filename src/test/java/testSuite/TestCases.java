package testSuite;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

    @Test
    public void testCase01(){
        // Open the Browser
        WebDriver driver = WebDriverManager.chromedriver().create();

        // Maximize the Browser

        // Navigate to Dashkote website
        driver.get("https://davracademy.com/");

        // Verify the Title
        Assert.assertEquals(driver.getTitle(), "Dashkote - Bootstrap5 Admin Template");

        // Close Browser
        driver.quit();
    }


    @Test
    public void TestCase02(){
        // Open the browser
        WebDriver driver = WebDriverManager.chromedriver().create();
        // Maximise current window
        driver.manage().window().maximize();
        
        // Navigate to Dashkote website
        driver.get("https://davracademy.com/");
        // Verify the Title
        Assert.assertEquals(driver.getTitle(), "Dashkote - Bootstrap5 Admin Template");

        // Close the browser
        driver.quit();
    }






}
