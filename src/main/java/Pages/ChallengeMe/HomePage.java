package Pages.ChallengeMe;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final String title=driver.getTitle();
    private final By homeButton=By.xpath("//a[@href='/challenge']");
    public HomePage checkIsPageCorrect() throws InterruptedException {
      /*  Thread.sleep(5000);
        String title=driver.getTitle();
        Assert.assertTr("Welcome Page", title);*/
        waitElemenIsVisible(driver.findElement(homeButton));
        Assert.assertTrue(driver.findElement(homeButton).isDisplayed());
        return this;
    }
}
