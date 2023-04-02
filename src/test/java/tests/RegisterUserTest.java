package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountCreatedPage;
import pages.HomePage;
import pages.LoginSignupPage;
import pages.SignupPage;

public class RegisterUserTest extends BaseTest {

    @Test
    public void registerUserTest() {
        HomePage homePage = new HomePage(webDriver, webDriverWait);
        LoginSignupPage loginSignupPage = new LoginSignupPage(webDriver, webDriverWait);
        Faker faker = new Faker();
        SignupPage signupPage = new SignupPage(webDriver, webDriverWait);

        homePage.getLoginSignupButton().click();

        Assert.assertEquals(loginSignupPage.getNewUserSignupMessage().getText(), "New User Signup!"); //5.

        String name = faker.name().name();
        String email = faker.internet().emailAddress();

        loginSignupPage.fillOutNameAndEmail(name, email);
        loginSignupPage.getSignupButton().click();

        Assert.assertEquals(signupPage.getEnterAccountInformation().getText().toUpperCase(), "ENTER ACCOUNT INFORMATION"); //8.

        String day = "4";
        String month = "April";
        String year = "1970";
        String country = "Canada";
        String password = faker.internet().password();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String company = faker.company().name();
        String address1 = faker.address().streetAddress();
        String address2 = faker.address().streetAddress();
        String state = faker.address().state();
        String city = faker.address().city();
        String zipcode = faker.address().zipCode();
        String mobileNumber = faker.phoneNumber().cellPhone();

        signupPage.fillOutDetails(password, firstName, lastName, company, address1,
                address2, state, city, zipcode, mobileNumber);


        Select days = new Select(signupPage.getSelectDays());
        days.selectByValue(day);

        Select months = new Select(signupPage.getSelectMonths());
        months.selectByVisibleText(month);

        Select years = new Select(signupPage.getSelectYears());
        years.selectByVisibleText(year);

        Select countries = new Select(signupPage.getSelectCountry());
        countries.selectByVisibleText(country);

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView();", signupPage.getSubmitButton());

        signupPage.getSubmitButton().click();

        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(webDriver, webDriverWait);
        Assert.assertEquals(accountCreatedPage.getAccountCreated().getText(), "ACCOUNT CREATED!"); //14.

        accountCreatedPage.getContinueButton().click();

        Assert.assertEquals(homePage.getLoggedInAs().getText(), "Logged in as " + name);
    }

}
