package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page023 {
    public Page023(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath= "(//*[text()='Edit'])[2]")
    public WebElement hastaEdit;

    @FindBy(xpath= "//*[@id='appointment-status']")
    public WebElement appointmentStatus;

    @FindBy(xpath= "//*[@id='save-entity']")
    public WebElement editAppointmentSaveButton;
    @FindBy(xpath= "//*[text()='The Appointment is updated with identifier 361666']")
    public WebElement appointmentUpdateText;
    @FindBy(xpath= "(//*[text()='Search Patient'])[1]")
    public WebElement searchPatient;

    @FindBy(xpath= "//*[@name='ssn']")
    public WebElement patientSsnBox;

    @FindBy(xpath= "//*[text()='Show Appointments']")
    public WebElement showAppointments;

    @FindBy(xpath= "(//*[text()='Edit'])[2]")
    public WebElement appointmentEdit;

    @FindBy(xpath= "//*[text()='The Appointment is updated with identifier 358071']")
    public WebElement patientAppointmentUpdateText;

    @FindBy(xpath= "(//*[text()='Payment / Invoice Process'])[2]")
    public WebElement paymentInvoiceUnVisble;
    @FindBy(xpath= "(//*[text()='Payment / Invoice Process'])[1]")
    public WebElement paymentInvoice;


    @FindBy(xpath= "//*[@class='form-control']")
    public WebElement formControl;

    @FindBy(xpath= " //*[text()=' Show Invoice']")
    public WebElement showInvoice;

    @FindBy(xpath= " //tbody/tr/td[2]")
    public WebElement testUcreti;

    @FindBy(xpath= " //th[text()='300']")
    public WebElement muayeneUcreti;

    @FindBy(xpath= "//*[text()=' Create Invoice']")
    public WebElement creatInvoice;

    @FindBy(xpath= "//*[text()='INVOICE']")
    public WebElement invoiceVisible;



}
