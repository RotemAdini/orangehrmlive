package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[1]/a")
    public static WebElement aboutButton;

    @FindBy(xpath = "//*[@id=\'app\']/div[2]/div/div/div/div[1]/h6")
    public static WebElement  aboutText;

    @FindBy(xpath = "//*[@id=\'app\']/div[2]/div/div/div/button")
    public static WebElement  exitButtonAbout;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
    public static WebElement  logOutButton;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")
    public static WebElement pageinfo ;
//    @FindBy(xpath = "")
//    public static WebElement  ;
//    @FindBy(xpath = "")
//    public static WebElement  ;

}
