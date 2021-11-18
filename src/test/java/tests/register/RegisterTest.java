package tests.register;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.CHALLENGE_ME;

public class RegisterTest extends BaseTest {
    private final String email="aali024@gmail.com";
    private final String pass="123456";
    private final String name="Aruzhan";
    private final String lname="Ali";
    private final String location="Nur-Sultan";

    @Test
    public void checkRegister(){
        basePage.open(CHALLENGE_ME);
        loginPage.goToRegistration();
        registerPage.isPageCorrect("Registration");
        registerPage
                .register(name, lname, email, location, pass)
                .checkIsSuccess();
    }
}
