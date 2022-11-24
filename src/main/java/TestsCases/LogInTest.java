package TestsCases;

import Core.Basedriver;
import Mapping.LogInpage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInTest extends Basedriver {
    @BeforeTest (groups = {"Sanity"})
    public void LogInTestCases() {
        startSession();
        PageFactory.initElements(driver, LogInpage.class);
    }
    @AfterTest
    public void  NewWebFramesPage()
    {stopSession();}
    @Test(groups = {"Sanity"},priority = 1)
    public void withOutParameters () throws InterruptedException
    {
        Thread.sleep(5000);
        LogInpage.LoginInbutton.click();
        String requiredUser= LogInpage.requiredUserName.getText();
        Assert.assertTrue(requiredUser.equalsIgnoreCase("Required"));
        String requiredPassword= LogInpage.requiredPassword.getText();
        Assert.assertTrue(requiredUser.equalsIgnoreCase("Required"));
        Thread.sleep(3000);
    }

    @Test (priority = 2)
    public void WorngPassword () throws InterruptedException {
        LogInpage.userNameFiled.sendKeys("Admin");
        LogInpage.PasswordFiled.sendKeys("jjjj");
        LogInpage.LoginInbutton.click();
        String invalid = "Invalid credentials";
        Thread.sleep(2000);
        Assert.assertTrue(LogInpage.invalidCredentialsPopUp.getText().equalsIgnoreCase(invalid));


    }

    @Test(priority = 3)
    public void UserNameDoesntExist() throws InterruptedException {
        Thread.sleep(2000);
        LogInpage.userNameFiled.sendKeys("jjjj");
        LogInpage.PasswordFiled.sendKeys("hhhh");
        LogInpage.LoginInbutton.click();
        String invalid = "Invalid credentials";
        Thread.sleep(2000);
        Assert.assertTrue(LogInpage.invalidCredentialsPopUp.getText().equalsIgnoreCase(invalid));
    }
    @Test(priority = 4)
    public void LogInTest () throws InterruptedException {
       Thread.sleep(5000);
LogInpage.userNameFiled.click();
LogInpage.userNameFiled.sendKeys("Admin");
LogInpage.PasswordFiled.click();
LogInpage.PasswordFiled.sendKeys("admin123");
LogInpage.LoginInbutton.click();
    }


}
