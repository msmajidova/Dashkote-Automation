package testSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {


    WebDriver driver;
    String loginURL = "https://msmajidova.github.io/Dashkote-Automation/";

    String loginName = "DavronLogin";
    String loginPassword = "MyPassword";

    @BeforeTest
    public void beforeTestExecutes(){
        // Start the session
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void cleanup(){
        driver.quit();
    }
}
