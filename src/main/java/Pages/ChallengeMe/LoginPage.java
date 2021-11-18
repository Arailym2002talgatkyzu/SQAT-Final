package Pages.ChallengeMe;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By login = By.xpath("//input[@id='login-submit']");
    private final By emailInput = By.xpath("//input[@id='username']");
    private final By passInput = By.xpath("//input[@id='password']");
    private final By register=By.xpath("//a[@href='/registration']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login(String email, String pass){
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passInput).sendKeys(pass);
        driver.findElement(login).click();
        return this;
    }

    public LoginPage goToRegistration(){
        driver.findElement(register).click();
        return this;
    }

}
