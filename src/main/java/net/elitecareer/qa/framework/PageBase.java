package net.elitecareer.qa.framework;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Mehedi on 11/4/2017.
 */
public class PageBase {

    protected WebDriver driver=null;

    public PageBase(WebDriver driver){
        this.driver=driver;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void verifyPageTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}

