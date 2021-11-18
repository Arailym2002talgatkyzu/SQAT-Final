package Pages.ChallengeMe;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage extends BasePage {
    private final By fname=By.xpath("//input[@id='firstname']");
    private final By lname=By.xpath("//input[@id='lastname']");
    private final By email=By.xpath("//input[@id='email']");
    private final By location= By.xpath("//input[@id='location']");
    private final By password= By.xpath("//input[@id='password']");
    private final By btn=By.xpath("//button[@class='btn btn-success']");
    private final By alert=By.xpath("//div[@class='alert alert-info']");


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage register(String fn, String ln, String e, String l, String p){
        waitElemenIsVisible( driver.findElement(fname));
        driver.findElement(fname).sendKeys(fn);
        driver.findElement(lname).sendKeys(ln);
        driver.findElement(email).sendKeys(e);
        driver.findElement(location).sendKeys(l);
        driver.findElement(password).sendKeys(p);
        driver.findElement(btn).click();
        return this;
    }

//    public RegisterPage isPageCorrect(){
//        Assert.assertEquals(driver.getTitle(), "Registration");
//        return this;
//    }



    public RegisterPage checkIsSuccess(){
        waitElemenIsVisible(driver.findElement(alert));
        Assert.assertTrue(driver.findElement(alert).isDisplayed());
        return this;
    }

}
