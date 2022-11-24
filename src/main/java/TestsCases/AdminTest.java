package TestsCases;

import Core.Basedriver;
import Mapping.AdminPage;
import Mapping.HomeMenu;
import Mapping.LogInpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdminTest extends Basedriver {
    @BeforeTest
    public void AdminPageTestCases() {
        startSession();
        PageFactory.initElements(driver, AdminPage.class);
        PageFactory.initElements(driver, HomeMenu.class);
        PageFactory.initElements(driver, LogInpage.class);
        try {
            logInToWeb();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest
    public void NewWebFramesPage() {
        stopSession();
    }

    @Test
    public void bSearchEmployee() throws InterruptedException {
        Thread.sleep(5000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(1000);
//       AdminPage.systemUserDropButtom.click();
       Thread.sleep(5000);
        AdminPage.userNameFiledSystem.sendKeys("Admin");
        Thread.sleep(2000);
        AdminPage.searchButtomSystem.click();
        Thread.sleep(6000);
        String found1 = AdminPage.recordsFound1Text.getText();
        SoftAssert softAssertion = new SoftAssert();
        Assert.assertEquals(found1, "(1) Record Found");
        AdminPage.resetButtomSystem.click();
        Thread.sleep(2000);
        found1 = AdminPage.recordsFound1Text.getText();
        Assert.assertNotEquals(found1, "(1) Record Found");

    }

    @Test
    public void countCorrectly() throws InterruptedException {
        Thread.sleep(4000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(6000);
        AdminPage.secondBoxEmployeList.click();
        AdminPage.thirdBoxEmployeList.click();
        AdminPage.oneBoxEmployeList.click();
        Thread.sleep(4000);
        String found3 = AdminPage.recordsFound20Text.getText();
        Assert.assertEquals(found3, "(3) Records Selected");
    }

    @Test
    public void deleteEmployee() throws InterruptedException {
        Thread.sleep(5000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(4000);
        AdminPage.thirdBoxEmployeList.click();
        Thread.sleep(2000);
        AdminPage.deleteSelectedButton.click();
        Thread.sleep(3000);
        String sure = AdminPage.areYouSurePopup.getText();
        Assert.assertEquals(sure, ("Are you Sure?"));
        AdminPage.yesDeleteButton.click();
    }

    @Test
    public void noUsernameFound() throws InterruptedException {
        Thread.sleep(5000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(6000);
        AdminPage.userNameFiledSystem.sendKeys("kjh");
        AdminPage.searchButtomSystem.click();
        Thread.sleep(2000);
        String noRecord = AdminPage.noRecordsFoundText.getText();
        Assert.assertEquals(noRecord, "No Records Found");
    }

    @Test
    public void DropDwonButtonCheck() throws InterruptedException {
        Thread.sleep(7000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(5000);
        String username = AdminPage.userNameText.getText();
        if (AdminPage.systemUserDropButtom.isSelected()) {
            Assert.assertEquals(username, "Username");

        } else {
            Thread.sleep(3000);
            AdminPage.systemUserDropButtom.click();
            Assert.assertEquals(username, "Username");
        }
    }

    @Test
    public void dropDownSelect() throws InterruptedException {
        Thread.sleep(2000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(6000);
        AdminPage.userRoleDropButton.click();
        AdminPage.adminSelectUserRole.click();
        String admin = AdminPage.adminTextSelectUserRole.getText();
        Assert.assertTrue(admin.equalsIgnoreCase("Admin"));

    }

    @Test
    public void saveEmployeeWith4char() throws InterruptedException {
        Thread.sleep(2000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(2000);
        AdminPage.addEmployeeButton.click();
        Thread.sleep(2000);
        AdminPage.addUserNameeFiled.sendKeys("Dana");
        Thread.sleep(2000);
        String fivechar = AdminPage.shouldBeAtleast5CharactersPopup.getText();
        Assert.assertEquals(fivechar, "Should be at least 5 characters");

    }

    @Test
    public void saveEmployeeWithOutName() throws InterruptedException {
        Thread.sleep(2000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(2000);
        AdminPage.addEmployeeButton.click();
        Thread.sleep(2000);
        AdminPage.saveEmployeeButton.click();
        String noName = AdminPage.RequiredEmployeeNameText.getText();
        Assert.assertEquals(noName, "Required");
    }

    @Test
    public void dropDownChangeSelect() throws InterruptedException {
        Thread.sleep(2000);
        HomeMenu.adminlinkpage.click();
        Thread.sleep(2000);
        AdminPage.userRoleDropButton.click();
        AdminPage.adminSelectUserRole.click();
        String admin = AdminPage.adminTextSelectUserRole.getText();
        Assert.assertTrue(admin.equalsIgnoreCase("Admin"));
        AdminPage.userRoleDropButton.click();
        AdminPage.selectOptionButton.click();
        String select = AdminPage.selectOptionText.getText();
        Assert.assertEquals(select,"-- Select --");
        AdminPage.userRoleDropButton.click();
        AdminPage.essOptionButton.click();
        String ess = AdminPage.essOptionText.getText();
        Assert.assertTrue(ess.equalsIgnoreCase("ESS"));
    }

}