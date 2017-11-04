package net.elitecareer.qa.testscript;

import net.elitecareer.qa.framework.EliteCareerScriptBase;
import org.testng.annotations.Test;

/**
 * Created by Mehedi on 11/4/2017.
 */
public class SignInTest extends EliteCareerScriptBase {


    @Test
    public void validIdAndValidPassword() {
        homePage.navigateToSigninPage();
        homePage.verifyPageTitle();
        signInPage.signin("moniruzzaman000@yahoo.com", "tech");
        signInPage.clickSignin();
    }

    @Test
    public void invalidIdAndValidPassword() {
        homePage.navigateToSigninPage();
        homePage.verifyPageTitle();
        signInPage.signin("moniruzz@yahoo.com", "tech");
        signInPage.clickSignin();
    }

    @Test
    public void emptyIdAndEmptyPassword() {
        homePage.navigateToSigninPage();
        homePage.verifyPageTitle();
        signInPage.signin(" ", " ");
        signInPage.clickSignin();
    }

    @Test
    public void emptyIdAndValidPassword() {
        homePage.navigateToSigninPage();
        homePage.verifyPageTitle();
        signInPage.signin("", "tech");
        signInPage.clickSignin();
    }

    @Test
    public void emptyIdAndInalidPassword() {
        homePage.navigateToSigninPage();
        homePage.verifyPageTitle();
        signInPage.signin("", "tech12");
        signInPage.clickSignin();
    }
}
