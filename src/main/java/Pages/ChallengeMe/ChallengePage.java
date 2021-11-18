package Pages.ChallengeMe;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChallengePage extends BasePage {
    private final By enrolTwiceBtn=By.xpath("//a[@href='/enroll/8']");
    private final By enrolOnceBtn=By.xpath("//a[@href='/enroll/17']");
    private final By createBtn=By.xpath("//a[@href='/showNewChallengeForm']");
    public ChallengePage(WebDriver driver) {
        super(driver);
    }

    public ChallengePage enrollTwice(){
        driver.findElement(enrolTwiceBtn).click();
        return this;
    }

    public ChallengePage enrollOnce(){
        driver.findElement(enrolOnceBtn).click();
        return this;
    }

    public ChallengePage goToCreate(){
        driver.findElement(createBtn).click();
        return this;
    }


}
