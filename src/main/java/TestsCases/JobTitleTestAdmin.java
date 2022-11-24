package TestsCases;

import Core.Basedriver;
import Mapping.AdminPage;
import Mapping.HomeMenu;
import Mapping.JobTitlePageAdmin;
import Mapping.LogInpage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JobTitleTestAdmin extends Basedriver {



    @BeforeTest
    public void JobTitleTestAdmin() {
        startSession();
        PageFactory.initElements(driver, AdminPage.class);
        PageFactory.initElements(driver, HomeMenu.class);
        PageFactory.initElements(driver, LogInpage.class);
        PageFactory.initElements(driver, JobTitlePageAdmin.class);
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
  public void   createJob() throws InterruptedException {
        Thread.sleep(2000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(1000);
        AdminPage.jobButton.click();
        AdminPage.jobTitleButton.click();
        Thread.sleep(4000);
        JobTitlePageAdmin.AddButton.click();
        Thread.sleep(3000);
        JobTitlePageAdmin.jobTitleNameButton.sendKeys("abc");
        Thread.sleep(2000);
        JobTitlePageAdmin.saveButton.click();
        Thread.sleep(10000);
        JobTitlePageAdmin.jobTitleText.getText();

    }

    @Test
    public void alreadyExistJob() throws InterruptedException {
        Thread.sleep(2000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(2000);
        AdminPage.jobButton.click();
        AdminPage.jobTitleButton.click();
        Thread.sleep(7000);
        JobTitlePageAdmin.AddButton.click();
        Thread.sleep(4000);
        JobTitlePageAdmin.jobTitleNameButton.sendKeys("abc");
        Thread.sleep(8000);
        String already = JobTitlePageAdmin.alreadyExitsJob.getText();
        Assert.assertTrue(already.equalsIgnoreCase("Already exists"));

    }

    @Test
    public void createJobWithOutTitle() throws InterruptedException {
        Thread.sleep(4000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(2000);
        AdminPage.jobButton.click();
        AdminPage.jobTitleButton.click();
        Thread.sleep(2000);
        JobTitlePageAdmin.AddButton.click();
        Thread.sleep(2000);
        JobTitlePageAdmin.JobDescriptionFiled.sendKeys("abc");
        JobTitlePageAdmin.saveButton.click();
        String Required=JobTitlePageAdmin.RequiredJobTitle.getText();
        Assert.assertEquals(Required,"Required");
    }
    }



