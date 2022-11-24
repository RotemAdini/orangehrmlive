package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInpage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/h5")
    public static WebElement LoginInText;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[1]/label")
    public static WebElement UserNameText;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    public static WebElement userNameFiled;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[1]/label")
    public  static WebElement PasswordText;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    public static WebElement PasswordFiled;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public static  WebElement LoginInButtonText;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]")
    public static WebElement LoginInbutton;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")
    public static WebElement Forgotyourpasswordbutton;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span")
    public static WebElement requiredUserName;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span")
    public static WebElement requiredPassword;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    public static WebElement invalidCredentialsPopUp;

        @FindBy(xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/h5")
    public static WebElement  logInTextPage;
}
