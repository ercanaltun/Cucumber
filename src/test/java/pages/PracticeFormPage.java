package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeFormPage {

    public PracticeFormPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='comments']")
    public WebElement texArea;

    @FindBy(xpath = "//input[@name='filename']")
    public WebElement dosyaSec;

    @FindBy(xpath = "(//input[@name='checkboxes[]'])[1]")
    public WebElement checkBox1;

    @FindBy(xpath = "(//input[@name='checkboxes[]'])[2]")
    public WebElement checkBox2;


    @FindBy(xpath = "(//input[@name='checkboxes[]'])[3]")
    public WebElement checkBox3;

    @FindBy(xpath = "(//input[@name='radioval'])[1]")
    public WebElement radio1;

    @FindBy(xpath = "(//input[@name='radioval'])[2]")
    public WebElement radio2;

    @FindBy(xpath = "(//input[@name='radioval'])[3]")
    public WebElement radio3;

    @FindBy(xpath = "//option[@value='ms3']")
    public WebElement multipleSelect3;

    @FindBy(xpath = "//select[@name='dropdown']")
    public WebElement dropdown;


    @FindBy(xpath = "//input[@value='submit']")
    public WebElement submitButton;


    @FindBy(xpath = "//*[.='test.text.txt']")
    public WebElement fileVisible;










}
