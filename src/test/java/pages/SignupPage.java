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

    @FindBy(id = "id_gender1")
    private WebElement titleMr;

    @FindBy(name = "days")
    private WebElement selectDays;

    @FindBy(name = "months")
    private WebElement selectMonths;

    @FindBy(name = "years")
    private WebElement selectYears;

    @FindBy(name = "newsletter")
    private WebElement newsletterCheckbox;

    @FindBy(name = "optin")
    private WebElement receiveSpecialOffersCheckbox;

    @FindBy(name = "first_name")
    private WebElement firstNameInput;

    @FindBy(name = "last_name")
    private WebElement lastNameInput;

    @FindBy(name = "company")
    private WebElement companyInput;

    @FindBy(name = "address1")
    private WebElement addressOneInput;

    @FindBy(name = "address2")
    private WebElement addressTwoInput;

    @FindBy(name = "country")
    private WebElement selectCountry;

    @FindBy(name = "state")
    private WebElement stateInput;

    @FindBy(name = "city")
    private WebElement cityInput;

    @FindBy(name = "zipcode")
    private WebElement zipcodeInput;

    @FindBy(name = "mobile_number")
    private WebElement mobileNumberInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/form/button")
    private WebElement submitButton;


    public WebElement getSelectMonths() {
        return selectMonths;
    }

    public WebElement getSelectYears() {
        return selectYears;
    }

    public WebElement getSelectDays() {
        return selectDays;
    }

    public WebElement getSelectCountry() {
        return selectCountry;
    }

    public WebElement getTitleMr() {
        return titleMr;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getEnterAccountInformation() {
        return enterAccountInformation;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void fillOutDetails(String password, String firstName, String lastName, String company,
                               String address, String address2, String state, String city, String zipcode, String mobileNumber) {
        titleMr.click();
        newsletterCheckbox.click();
        receiveSpecialOffersCheckbox.click();
        passwordInput.sendKeys(password);
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        companyInput.sendKeys(company);
        addressOneInput.sendKeys(address);
        addressTwoInput.sendKeys(address2);
        stateInput.sendKeys(state);
        cityInput.sendKeys(city);
        zipcodeInput.sendKeys(zipcode);
        mobileNumberInput.sendKeys(mobileNumber);

    }
}
