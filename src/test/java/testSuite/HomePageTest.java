package testSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HomePageTest extends BaseTest {

    WebDriver driver;
    String url;
    String dashPage = "http://localhost:5500/dashboard.html";
    String username;
    String password;

    FileInputStream input = new FileInputStream("C:\\tmp\\Dashkote-Automation\\src\\test\\resources\\config.properties");




    public HomePageTest() throws FileNotFoundException {
    }

    @BeforeTest
    public void beforeTest() throws IOException {
        System.out.println("Before Test");

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        // Reading form Property file to extract the values
        Properties prop = new Properties();
        prop.load(input);
        username = prop.getProperty("username");
        password = prop.getProperty("password");
        url = prop.getProperty("url");
    }

    @Test
    public void test_01(){

        System.out.println(loginName);

        // Signin - Enter Username and Password
        System.out.println("Username is " + username + ". Password is: " + password + ". Url is: " + url);
        driver.get(url);
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "SDET - Home");
    }

    @Test
    public void test_02(){
        System.out.println("Test 2");
        driver.get(url);
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "SDET - Home");
    }

    @Test
    public void test_03(){
        System.out.println("Test 3");
        driver.get(dashPage);
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Live Dashboard");
    }

    @Test
    public void test_04(){
        System.out.println("Test 4");
        driver.get(dashPage);
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Live Dashboard");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    
}
