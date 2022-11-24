package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMpage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    public static WebElement addEmployeebutton;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    public static WebElement employeeListPage ;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")
    public static WebElement  foundRecored1;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    public static WebElement  searchButton;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
    public static WebElement firstNameButtonSearch;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")
    public static WebElement  resetButton;
        @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
    public static WebElement typeForHintsText ;
        @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
    public static WebElement EmployeeInformationTitle  ;





}