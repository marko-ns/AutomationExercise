package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSignupPage extends BasePage {

    public LoginSignupPage(WebDriver webDriver, WebDriverWait webDriverWait) {
        super(webDriver, webDriverWait);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2")
    private WebElement newUserSignupMessage;

    @FindBy(name = "name")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    private WebElement signupButton;

    public WebElement getNewUserSignupMessage() {
        return newUserSignupMessage;
    }

    public WebElement getSignupButton() {
        return signupButton;
    }

    public void fillOutNameAndEmail(String name, String email) {
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
    }
}
