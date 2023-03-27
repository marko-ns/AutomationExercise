package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSignupPage extends BasePage{

    public LoginSignupPage (WebDriver webDriver, WebDriverWait webDriverWait){
        super(webDriver, webDriverWait);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2")
    private WebElement newUserSignupMessage;

    public WebElement getNewUserSignupMessage() {
        return newUserSignupMessage;
    }
}
