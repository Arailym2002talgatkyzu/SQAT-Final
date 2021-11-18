package Pages.ChallengeMe;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {
   /* private final By homeButton=By.xpath("//a[@href='/challenge']");*/
    private final By challengeButton=By.xpath("//a[@href='/challenge']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

   /* public HomePage checkIsPageCorrect() {
        waitElemenIsVisible(driver.findElement(homeButton));
        Assert.assertTrue(driver.findElement(homeButton).isDisplayed());
        return this;
    }*/

    public HomePage goToChallengePage(){
    driver.findElement(challengeButton).click();
    return this;
    }


}
