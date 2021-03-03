package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver  driver){
        this.driver = driver;
    }

    public void openBrowser() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
