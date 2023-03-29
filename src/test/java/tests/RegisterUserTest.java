package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
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

        Select days = new Select(signupPage.getSelectDays());
        days.selectByValue("4");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
