package Pages.ChallengeMe;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends BasePage {
    private final By login = By.xpath("//input[@id='login-submit']");
    private final By emailInput = By.xpath("//input[@id='username']");
    private final By passInput = By.xpath("//input[@id='password']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login(String email, String pass){
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passInput).sendKeys(pass);
        driver.findElement(login).click();
        return this;
    }
/*
    public LoginPage  checkPage() throws InterruptedException {
        Thread.sleep(5000);
        String title=driver.getTitle();
        Assert.assertEquals("Welcome Page", title);
        return this;
    }*/
}
