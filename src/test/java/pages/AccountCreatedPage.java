package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreatedPage extends BasePage{

    public AccountCreatedPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    private WebElement accountCreated;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    private WebElement continueButton;

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getAccountCreated() {
        return accountCreated;
    }
}
