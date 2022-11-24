package TestsCases;

import Core.Basedriver;
import Mapping.AboutPage;
import Mapping.AdminPage;
import Mapping.HomeMenu;
import Mapping.LogInpage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AboutTest extends Basedriver {
    @BeforeTest
    public void AdminPageTestCases(){
        startSession();
        PageFactory.initElements(driver, AdminPage.class);
        PageFactory.initElements(driver, HomeMenu.class);
        PageFactory.initElements(driver, LogInpage.class);
        PageFactory.initElements(driver, AboutPage.class);
        try {
            logInToWeb();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterTest
    public void  NewWebFramesPage()
    {stopSession();}


    @Test
    public void AboutText() throws InterruptedException {
        Thread.sleep(5000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(5000);
        AboutPage.pageinfo.click();
        AboutPage.aboutButton.click();
        Thread.sleep(2000);
        String about = AboutPage.aboutText.getText();
        Assert.assertTrue( about.equalsIgnoreCase("About"));

    }
}
