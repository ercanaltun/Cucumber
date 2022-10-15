package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriverPage {

    public  WebDriverPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Login Portal']")
    public WebElement loginPortal;

    @FindBy(xpath = "//*[@placeholder='Username']")
    public WebElement userName;





















}
