package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobTitlePageAdmin {
     WebDriver driver;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
    public static WebElement AddButton ;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    public static WebElement jobTitleNameButton ;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")
    public static WebElement saveButton ;
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div[1]/h6")

    public static WebElement jobTitleText;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/span")
    public static WebElement alreadyExitsJob ;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
    public static WebElement JobDescriptionFiled ;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/span")
    public static WebElement RequiredJobTitle ;


}
