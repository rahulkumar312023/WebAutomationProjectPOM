package testcases;

import org.testng.annotations.Test;
import pages.LogInPage;
import pages.ProductPage;
import utilities.DriverSetUp;

public class TestLogIn extends DriverSetUp {

    LogInPage logInPage = new LogInPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void testLogIn(){
        getBrowser().get(logInPage.loginPageURL);
        logInPage.writeOnElement(logInPage.usernameBox, "standard_user");
        logInPage.writeOnElement(logInPage.passwordInputBox, "secret_sauce");
        logInPage.clickOnElement(logInPage.loginButton);

    }
}
