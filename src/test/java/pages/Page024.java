package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Page024 {

    public Page024(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatient;

    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;

    @FindBy(xpath = "(//*[text()='Show Tests'])[2]")
    public WebElement showTests;


    @FindBy(xpath = "//tbody/tr/td[1]")
    public WebElement testsVisible;

    @FindBy(xpath = "//*[text()='View Results']")
    public WebElement viewResults;

    @FindBy(xpath = "//tbody/tr[1]")
    public List<WebElement> testResultInfo;

    @FindBy(xpath = "(//*[text()='Show Invoice'])[1]")
    public WebElement showInvoice;


    @FindBy(xpath = "//th[text()='2022-12-01T11:08:59.090876Z']")
    public WebElement invoiceDate;





















}
