package TestsCases;

import Core.Basedriver;
import Mapping.AdminPage;
import Mapping.HomeMenu;
import Mapping.LogInpage;
import Mapping.workShiftAdminPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workShiftTest extends Basedriver {
    @BeforeTest (groups = {"Sanity"})
    public void AdminPageTestCases(){
        startSession();
        PageFactory.initElements(driver, AdminPage.class);
        PageFactory.initElements(driver, HomeMenu.class);
        PageFactory.initElements(driver, workShiftAdminPage.class);
        PageFactory.initElements(driver, LogInpage.class);

        try {
            logInToWeb();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterTest
    public void  NewWebFramesPage()
    {stopSession();}
    @Test(groups = {"Sanity"},priority = 1)
    public void createShift () throws InterruptedException {
        Thread.sleep(3000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(2000);
        AdminPage.jobButton.click();
        Thread.sleep(2000);
        AdminPage.workShiftButton.click();
        Thread.sleep(2000);
        workShiftAdminPage.addShiftButton.click();
        Thread.sleep(4000);
        workShiftAdminPage.shiftNameFiled.sendKeys("morning shift");
        workShiftAdminPage.saveShiftButton.click();
        Thread.sleep(8000);
        String found1 = workShiftAdminPage.recordFound.getText();
        Assert.assertEquals(found1,"(1) Record Found");
    }
    @Test(priority = 2)
    public void existsshift () throws InterruptedException {
        Thread.sleep(3000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(2000);
        AdminPage.jobButton.click();
        Thread.sleep(2000);
        AdminPage.workShiftButton.click();
        Thread.sleep(2000);
        workShiftAdminPage.addShiftButton.click();
        Thread.sleep(2000);
        workShiftAdminPage.shiftNameFiled.sendKeys("morning shift");
        Thread.sleep(8000);
        String alreadytExist= workShiftAdminPage.alreadyExistShift.getText();
        System.out.println(alreadytExist);
        Assert.assertEquals(alreadytExist,"Already exists");
    }
    @Test (priority = 3)
    public void removeAll() throws InterruptedException {
        Thread.sleep(2000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(2000);
        AdminPage.jobButton.click();
        Thread.sleep(2000);
        AdminPage.workShiftButton.click();
        Thread.sleep(2000);
        workShiftAdminPage.selectAllButton.click();
        Thread.sleep(5000);
        workShiftAdminPage.deleteAllButton.click();
        Thread.sleep(2000);
        AdminPage.yesDeleteButton.click();
        Thread.sleep(8000);
        String found0 = workShiftAdminPage.recordFound.getText();
        Assert.assertTrue(found0.equalsIgnoreCase("No Records Found"));
    }

}
