package Mapping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeMenu {

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/div/div/input")
    public static WebElement searchfiled;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    public  static WebElement adminlinkpage;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    public static WebElement pimLinkPage;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")
    public static WebElement leaveLinkPage;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")
    public static WebElement timeLinkPage;

    @FindBy(xpath = "")
    public static WebElement LinkPage;

    @FindBy(xpath = "")
    public static WebElement LinkPage9;



}
