package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoPage {

    public SaucedemoPage(){PageFactory.initElements(Driver.getDriver(),this);}

@FindBy(id="user-name")
    public WebElement userName;

@FindBy(xpath ="//input[@id='password']")
    public WebElement password;

@FindBy(xpath = "//input[@id='login-button']")
    public WebElement login;

@FindBy(xpath = "(//select[@class='product_sort_container'])")
    public WebElement nameAtoZ;

@FindBy(xpath = "(//*[text()='Price (low to high)'])[2]")
    public WebElement price;









}
