package tests.base;

import Pages.ChallengeMe.*;
import Pages.base.BasePage;
import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected RegisterPage registerPage=new RegisterPage(driver);
    protected ChallengePage challengePage=new ChallengePage(driver);
    protected CreateChallengePage createChallengePage=new CreateChallengePage(driver);

    @AfterSuite(alwaysRun = true)
    public void close(){
        if(HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }

}
