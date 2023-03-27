package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginSignupPage;

public class RegisterUserTest extends BaseTest{

    @Test
    public void newUserSignupVisible(){
        HomePage homePage = new HomePage(webDriver, webDriverWait);
        LoginSignupPage loginSignupPage = new LoginSignupPage(webDriver, webDriverWait);

        homePage.getLoginSignupButton().click();

        Assert.assertEquals(loginSignupPage.getNewUserSignupMessage().getText(), "New User Signup!");
    }
}
