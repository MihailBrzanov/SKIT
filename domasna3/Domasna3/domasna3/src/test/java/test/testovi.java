package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.LoginPage;
import selenium.ProductPage;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testovi {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = getDriver();
    }
    @Test
    public void Test1(){
        driver.get("https://www.omeka.net/dashboard");

        final WebElement username = driver.findElement(By.id("username"));
        final WebElement password = driver.findElement(By.id("password"));
        final WebElement login = driver.findElement(By.id("submit"));


        username.sendKeys("proba");
        password.sendKeys("123");

        login.click();
    }
    @Test
    public void Test2(){
        driver.get("https://www.omeka.net/dashboard");

        final WebElement username = driver.findElement(By.id("username"));
        final WebElement password = driver.findElement(By.id("password"));
        final WebElement login = driver.findElement(By.id("submit"));


        username.sendKeys("");
        password.sendKeys("123");

        login.click();
    }
    @Test
    public void Test3(){
        driver.get("https://www.omeka.net/dashboard");

        final WebElement username = driver.findElement(By.id("username"));
        final WebElement password = driver.findElement(By.id("password"));
        final WebElement login = driver.findElement(By.id("submit"));
        username.sendKeys("MihailBrzanov");
        password.sendKeys("Mikifinki@99");

        login.click();
    }

    private WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "D:/FINKI/Intelij Projects/Domasna3/domasna3/src/main/resources/drivers/chromedriver");
        return new ChromeDriver();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
