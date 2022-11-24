package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMaddEmployee {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")
    public static WebElement firstNameFiled;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")
    public static WebElement middleNameFiled;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")
    public static WebElement lastnameFiled ;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    public static WebElement saveButton ;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    public static WebElement  employeeIDfiled;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[1]")
    public static WebElement  cancelButton;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")
    public static WebElement  createLoginDetailsButton;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[1]/label")
    public static WebElement  passwordTextAfterPressDetails;


}
