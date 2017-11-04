package net.elitecareer.qa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Mehedi on 11/4/2017.
 */
public class SignInPage extends PageBase {


    public SignInPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20), this);
    }

    @FindBy(name = "Email")
    private WebElement emailTextbox;

    @FindBy(name = "Password")
    private WebElement passwordTextbox;

    @FindBy(name = "submit")
    private WebElement signinLink;


    public void enterEmail(String email){
        emailTextbox.clear();
        emailTextbox.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordTextbox.clear();
        passwordTextbox.sendKeys(password);
    }

    public void signin(String email, String password){
        enterEmail(email);
        enterPassword(password);
    }

    public void clickSignin(){
        signinLink.click();
    }
}
