package TestsCases;

import Core.Basedriver;
import Mapping.HomeMenu;
import Mapping.LogInpage;
import Mapping.PIMaddEmployee;
import Mapping.PIMpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PIMaddEmployeeTest extends Basedriver {


    @BeforeTest
    public void LogInTestCases() {
        startSession();
        PageFactory.initElements(driver, LogInpage.class);
        PageFactory.initElements(driver, PIMpage.class);
        PageFactory.initElements(driver, PIMaddEmployee.class);
        PageFactory.initElements(driver, HomeMenu.class);
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
    public void AddEmployee() throws InterruptedException {
        Thread.sleep(4000);
        HomeMenu.pimLinkPage.click();
        Thread.sleep(2000);
        PIMpage.addEmployeebutton.click();
        Thread.sleep(2000);
        PIMaddEmployee.firstNameFiled.sendKeys("Rotem");
        PIMaddEmployee.middleNameFiled.sendKeys("Dana");
        PIMaddEmployee.lastnameFiled.sendKeys("Adini");
        Thread.sleep(2000);
        PIMaddEmployee.employeeIDfiled.sendKeys("1234");
        Thread.sleep(6000);
        PIMaddEmployee.saveButton.click();

    }

    @Test
    public void canceLToCreateEmployee() throws InterruptedException {

        Thread.sleep(4000);
        HomeMenu.pimLinkPage.click();
        Thread.sleep(2000);
        PIMpage.addEmployeebutton.click();
        Thread.sleep(2000);
        PIMaddEmployee.firstNameFiled.sendKeys("Rotem");
        PIMaddEmployee.cancelButton.click();
        Thread.sleep(3000);
        String employeeTitle = PIMpage.EmployeeInformationTitle.getText();
        Assert.assertEquals(employeeTitle, "Employee Information");

    }

    @Test
    public void CreateLoginDetailsButton() throws InterruptedException {

        Thread.sleep(4000);
        HomeMenu.pimLinkPage.click();
        Thread.sleep(2000);
        PIMpage.addEmployeebutton.click();
        Thread.sleep(2000);
        PIMaddEmployee.firstNameFiled.sendKeys("Rotem");
        PIMaddEmployee.createLoginDetailsButton.click();
        String password = PIMaddEmployee.passwordTextAfterPressDetails.getText();
        Assert.assertEquals(password, "Password");


    }

    @Test
    public void AddEmployeeCheckCount() throws InterruptedException {
        boolean t;
        Thread.sleep(7000);
        HomeMenu.pimLinkPage.click();
        Thread.sleep(4000);
        String record = PIMpage.foundRecored1.getText();
        String recordNumber=record.substring(1,3);
        int num =Integer.parseInt(recordNumber);
        num=num+1;
        Thread.sleep(2000);
        PIMpage.addEmployeebutton.click();
        Thread.sleep(4000);
        PIMaddEmployee.firstNameFiled.sendKeys("Rotem");
        PIMaddEmployee.middleNameFiled.sendKeys("Dana");
        PIMaddEmployee.lastnameFiled.sendKeys("Adini");
        Thread.sleep(2000);
        PIMaddEmployee.employeeIDfiled.sendKeys("1234");
        Thread.sleep(6000);
        PIMaddEmployee.saveButton.click();
        Thread.sleep(8000);
        HomeMenu.pimLinkPage.click();
        Thread.sleep(4000);
        String recordAfterAdd = PIMpage.foundRecored1.getText();
        String recordAfter=recordAfterAdd.substring(1,3);
        int after = Integer.parseInt(recordAfter);
        if (num == after)
        {
            System.out.println("test pass");
            t =true;
        }
        else {
            System.out.println("Test failed");
            t =false;
        }
    }
}