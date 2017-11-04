package net.elitecareer.qa.framework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mehedi on 11/4/2017.
 */
public class EliteCareerScriptBase extends ScriptBase {


    private static String ELITE_URL = "http://qa.elitecareer.net";

    protected HomePage homePage;
    protected SignInPage signInPage;

    @Parameters({"browser"})
    @BeforeMethod
    @Override
    public void beforeMethod(@Optional("ch") String browser) throws MalformedURLException {
        super.beforeMethod(browser);

        driver.navigate().to(ELITE_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
    }
}
