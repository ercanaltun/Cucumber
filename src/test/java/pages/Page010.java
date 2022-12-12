package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Page010 {

  public Page010(){

      PageFactory.initElements(Driver.getDriver(),this);
  }

    @FindBy(xpath= "//*[@class='dropdown nav-item']")
   public WebElement enbas;

 @FindBy(xpath= "(//*[text()='Sign in'])[1]")
 public WebElement signIn;


    @FindBy(xpath= "//*[@placeholder='Your username']")
    public WebElement username;


    @FindBy(xpath= "//*[@placeholder='Your password']")
    public WebElement password;


    @FindBy(xpath= "(//*[text()='Sign in'])[3]")
    public WebElement signInButton;

    @FindBy(xpath= "//*[text()='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath= "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;

    @FindBy(id = "fromDate")
    public WebElement fromDate; ;

    @FindBy(id = "toDate")
    public WebElement toDate;

    @FindBy(xpath= "//thead")
    public List<WebElement> randevuList;

    @FindBy(xpath= "//tbody/tr/td[1]")
   public WebElement patientId;

    @FindBy(xpath= "//tbody/tr/td[2]")
    public WebElement startDate;

    @FindBy(xpath= "//tbody/tr/td[3]")
    public WebElement endDate;

    @FindBy(xpath= "//tbody/tr/td[4]")
    public WebElement status;



}
