package net.elitecareer.qa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Mehedi on 11/4/2017.
 */
public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    @FindBy(linkText = "Signin")
    private WebElement signinLink;

    public void navigateToSigninPage() {
        signinLink.click();
    }

    public void verifyPageTitle() {
        String expectedTitle = "SignIn | EliteCareer";
        verifyPageTitle(expectedTitle);
    }
}
