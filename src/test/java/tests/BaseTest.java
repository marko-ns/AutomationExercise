package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {

    protected WebDriver webDriver;

    protected WebDriverWait webDriverWait;

    protected ChromeOptions chromeOptions;

    @BeforeClass
    public void beforeClass() {
        this.chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        this.webDriver = new ChromeDriver(chromeOptions);
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(20));

    }

    @BeforeMethod
    public void beforeMethod() {
        webDriver.get("https://automationexercise.com/");
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.quit();
    }
}
