package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver, WebDriverWait webDriverWait) {
        super(webDriver, webDriverWait);
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    private WebElement loginSignupButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    private WebElement loggedInAs;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    private WebElement deleteAccountButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    private WebElement accountDeleted;

    public WebElement getAccountDeleted() {
        return accountDeleted;
    }

    public WebElement getDeleteAccountButton() {
        return deleteAccountButton;
    }

    public WebElement getLoggedInAs() {
        return loggedInAs;
    }

    public WebElement getLoginSignupButton() {
        return loginSignupButton;
    }
}
