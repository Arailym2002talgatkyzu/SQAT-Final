package tests.login;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.CHALLENGE_ME;

public class LoginTest extends BaseTest {
    private final String email="danatalgatkyzy29@gmail.com";
    private final String pass="123456";

    @Test
    public void checkLogin() {
        basePage.open(CHALLENGE_ME);
        loginPage.login(email, pass);
        homePage.isPageCorrect("Welcome Page");
    }
}
