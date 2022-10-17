package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {//Constructor oluşturup public yapmamız gerekir

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;


    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucWE;


    @FindBy(xpath = "//*[@id='nav-link-accountList-nav-line-1']")
    public WebElement helloSignIn;


    @FindBy(xpath = "(//*[text()='Sign in'])[1]")
    public WebElement signIn;


    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement emailBox;

    @FindBy(xpath = "(//*[@id='continue'])[1]")
    public WebElement continueEmail;

    @FindBy(xpath = "//*[text()='There was a problem']")
    public WebElement thereWasProblem;

    @FindBy(xpath = "(//*[@class='a-expander-prompt'])[1]")
    public WebElement needHelp;

    @FindBy(xpath = "(//*[@id='auth-fpp-link-bottom'])[1]")
    public WebElement forgetPassword;

    @FindBy(xpath = "//h1")
    public WebElement passworsAsisstantText;

    @FindBy(xpath = "//*[@id='createAccountSubmit']")
    public WebElement creatYourAccount;

    @FindBy(xpath = "(//*[@class='a-spacing-small'])[1]")
    public WebElement creatYourAccountText;












}