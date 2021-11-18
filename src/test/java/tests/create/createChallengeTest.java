package tests.create;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.CHALLENGE_ME;
import static constants.Constant.UserData.EMAIL;
import static constants.Constant.UserData.PASS;

public class createChallengeTest extends BaseTest {
    private final By my = By.cssSelector("section[class='owner'] div[class='product']");

    @Test
    public void checkCreateChallenge() throws InterruptedException {
        basePage.open(CHALLENGE_ME);
        loginPage.login(EMAIL, PASS);
        homePage.goToChallengePage();
        challengePage.goToCreate();
        createChallengePage.createChallenge();
        Assert.assertEquals(driver.findElements(my).size(), 1);
    }
}
