package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
    WebDriver driver;
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")
    public static WebElement systemUserDropButtom ;

    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    public static WebElement userNameFiledSystem ;
    //*[@id="app"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    public static WebElement searchButtomSystem ;
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")
    public static WebElement resetButtomSystem;
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/span")
    public static WebElement recordsFound20Text;
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")

    public static WebElement recordsFound1Text ;
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]")
    public static WebElement jobTitleButton;
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")
    public static WebElement jobButton ;
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div[1]/h6")
    public static WebElement jobTitleText;

    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div/div[1]/div/div/label")
    public static WebElement secondBoxEmployeList;
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button")
    public static WebElement deleteSelectedButton;
    @FindBy (xpath = "//*[@id=\'app\']/div[3]/div/div/div/div[1]/p")

    public static WebElement areYouSurePopup;

    @FindBy (xpath = "//*[@id=\'app\']/div[3]/div/div/div/div[3]/button[2]")
    public static WebElement yesDeleteButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")
    public static WebElement noRecordsFoundText;
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[4]/div/div[1]/div/div/label/span/i")
    //
    public static WebElement thirdBoxEmployeList;
    @FindBy (xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[6]/div/div[1]/div/div/label")
    public static WebElement oneBoxEmployeList;
        @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[1]/label")
    public static WebElement  systemUsersText;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")
    public static WebElement userRoleDropButton ;

    @FindBy(xpath = "//*[@id='app'']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    public static WebElement userRoleSelectText ;

    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[1]/label")
    public static WebElement userNameText ;


    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[5]/a")
    public static WebElement workShiftButton ;
        @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]")

    public static WebElement  adminSelectUserRole;
        @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    public static WebElement  adminTextSelectUserRole;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    public static WebElement addEmployeeNameFiled ;
            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/span")
    public static WebElement RequiredEmployeeNameText ;
            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
    public static WebElement  addUserNameeFiled;
            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/span")
    public static WebElement  shouldBeAtleast5CharactersPopup;
            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    public static WebElement  addEmployeeButton ;
            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
             public static WebElement saveEmployeeButton ;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")
    public static WebElement resetButton ;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]")
    public static WebElement selectOptionButton ;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    public static WebElement selectOptionText ;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[3]")
    public static WebElement essOptionButton ;
    @FindBy(xpath = "//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    public static WebElement essOptionText ;
}
