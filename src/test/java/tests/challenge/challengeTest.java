package tests.challenge;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.CHALLENGE_ME;
import static constants.Constant.UserData.EMAIL;
import static constants.Constant.UserData.PASS;

public class challengeTest extends BaseTest {
    private final By enrolled = By.cssSelector("section[class='enrolled'] div[class='product']");
    private final By alert =By.xpath("//div[@class='alert alert-danger']");

    @Test
    public void checkEnrollTwice(){
        homePage.goToChallengePage();
        challengePage.isPageCorrect("Challenges");
        challengePage.enrollTwice();
        challengePage.waitElemenIsVisible(driver.findElement(alert));
        Assert.assertTrue(driver.findElement(alert).isDisplayed());
    }

    @Test
    public void checkEnrollOnce() throws InterruptedException {
        basePage.open(CHALLENGE_ME);
        loginPage.login(EMAIL, PASS);
        homePage.goToChallengePage();
        int countBefore=driver.findElements(enrolled).size();
        Thread.sleep(5000);
        challengePage.enrollOnce();
        Assert.assertEquals(driver.findElements(enrolled).size(),countBefore+1);
    }


}
