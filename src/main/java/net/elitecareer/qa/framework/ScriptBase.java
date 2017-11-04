package net.elitecareer.qa.framework;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import java.net.MalformedURLException;

/**
 * Created by Mehedi on 11/4/2017.
 */
public class ScriptBase {


    protected WebDriver driver = null;

    @BeforeMethod
    public void beforeMethod(@Optional("ch") String browser) throws MalformedURLException {

        //CROSS BROWSER SETUP:-------
        if (browser.contentEquals("ch")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else if (browser.contentEquals("ff")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        }
    }


    @AfterMethod
    public void afterMethod () {
        driver.close();
        //driver.quit();

        try {
            driver.quit();
        }
        catch (Exception ex) {
        }
    }
}