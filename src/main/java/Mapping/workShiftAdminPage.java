package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class workShiftAdminPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
    public static WebElement addShiftButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[1]/div/div[1]/div/label")
    public static WebElement selectAllButton;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div[2]/div/div/button")
    public static WebElement deleteAllButton;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")
    public static WebElement shiftNameFiled;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")
    public static WebElement saveShiftButton;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div[2]/div/span")
    public static WebElement recordFound;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/span")
    public static WebElement alreadyExistShift;
}