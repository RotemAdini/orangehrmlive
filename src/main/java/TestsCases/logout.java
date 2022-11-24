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

import java.util.Base64;

public class logout extends Basedriver {
    @BeforeTest
    public void AdminPageTestCases(){
        startSession();
        PageFactory.initElements(driver, AboutPage.class);
        PageFactory.initElements(driver, HomeMenu.class);
        PageFactory.initElements(driver, LogInpage.class);
        PageFactory.initElements(driver, AdminPage.class);
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
    public void logout () throws InterruptedException {
        Thread.sleep(2000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(2000);
        AboutPage.pageinfo.click();
        Thread.sleep(1000);
        AboutPage.logOutButton.click();
        Thread.sleep(2000);
        String Login = LogInpage.LoginInText.getText();
        Assert.assertTrue( Login.equalsIgnoreCase("Login"));


    }
}

