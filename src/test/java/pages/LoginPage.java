package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    String email = "MyEmailAddress";
    String pass = "MyPassword";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page Elements
    private By emailTextfield = By.id("email");
    private By passwordTextfield = By.id("pwd");
    private By submitButton = By.xpath("//button");
    private By title = By.xpath("//h2");
    private By checkbox = By.xpath("//input[@type='checkbox']");

    // Page Actions
    public void login(){

        String title = getTitle();
        if (title.equals("Welcome to Dashkote")) {

            // Enter email
            driver.findElement(emailTextfield).sendKeys(email);

            // Enter password
            driver.findElement(passwordTextfield).sendKeys(pass);

            // Click Submit
            driver.findElement(submitButton).click();
        } else {
            System.out.println("Page not displayed can not login");
        }


    }

    public String getTitle(){
        return driver.findElement(title).getText();
    }

    public void selectCheckbox(){
        driver.findElement(checkbox).click();
    }

}
