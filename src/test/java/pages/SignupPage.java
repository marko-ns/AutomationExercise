package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends BasePage {

    public SignupPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/h2/b")
    private WebElement enterAccountInformation;
    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(name = "days")
    private WebElement selectDays;

    public WebElement getSelectDays() {
        return selectDays;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getEnterAccountInformation() {
        return enterAccountInformation;
    }
}
