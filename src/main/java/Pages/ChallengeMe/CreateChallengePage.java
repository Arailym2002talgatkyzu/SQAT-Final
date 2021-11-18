package Pages.ChallengeMe;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateChallengePage extends BasePage {
    private final By title=By.xpath("//input[@id='title']");
    private final By type=By.xpath("//input[@id='type']");
    private final By desc=By.xpath("//input[@id='description']");
    private final By img= By.xpath("//input[@id='image']");
    private final By submit= By.xpath("//input[@type='submit']");

    public CreateChallengePage(WebDriver driver) {
        super(driver);
    }

    public CreateChallengePage createChallenge(){
        waitElemenIsVisible(driver.findElement(title));
        driver.findElement(title).sendKeys("Writing");
        driver.findElement(type).sendKeys("Education");
        driver.findElement(desc).sendKeys("Read and Write!");
        driver.findElement(img).sendKeys("https://www.sussex.ac.uk/wcm/assets/media/original/40627.jpg");
        driver.findElement(submit).click();
        return this;
    }



}
