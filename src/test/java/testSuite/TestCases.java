package testSuite;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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


    @Test
    public void TestCase03(){

        // Open the browser
        WebDriver driver = WebDriverManager.chromedriver().create();

        // Maximise current window
        driver.manage().window().maximize();

        // Navigate to Dashkote website
        driver.get("https://davracademy.com/");

        // Verify the Title
        String title = driver.getTitle();
        Assert.assertEquals(title, "Dashkote - Bootstrap5 Admin Template");

        // Close the browser
        driver.quit();

    }

    @Test
    public void ValidateDownloadButton() throws InterruptedException {

        // 1. Open Chrome browser
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();

        // 2. Navigate to "http://localhost:5500/dashboard.html"
        driver.get("http://localhost:5500/dashboard.html");

        // 3. Select any product from "Select Project" drop-down
        driver.findElement(By.id("navbarDropdown")).click();
        driver.findElement(By.xpath("//*[@id=\"fetchBtn\"]/a[3]")).click();

        // 4. Click first "Artifact" button from Download column
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"list\"]/tr[1]/td[7]/button")).click();

        // 5. Verify popup window is displayed with unique url
        Thread.sleep(2000);

            String parentWindow = driver.getWindowHandle();
            // Switch the driver context to the alert
            Alert alertDialog = driver.switchTo().alert();
            // Get the alert text
            String alertText1 = alertDialog.getText();
            // Click the OK button on the alert.
            alertDialog.accept();

            driver.switchTo().window(parentWindow);

        // 6. Click another "Artifact" button from Download column
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"list\"]/tr[2]/td[7]/button")).click();
            Thread.sleep(2000);
            // Switch the driver context to the alert
            Alert alertDialog2 = driver.switchTo().alert();
            // Get the alert text
            String alertText2 = alertDialog2.getText();
            // Click the OK button on the alert.
            alertDialog2.accept();


        // 7. Verify each popup window has unique url present
        Assert.assertNotEquals(alertText1, alertText2);

        // 8. Close the Browser
        driver.quit();
    }


}
