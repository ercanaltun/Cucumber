package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoexercisePage {

    public AutoexercisePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='fa fa-envelope']")
    public WebElement contactUs;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement getInTouchVisible;


    @FindBy(xpath = " //*[text()=' Signup / Login']")
    public WebElement signIn;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccountVisible;


    @FindBy(xpath = " //button[text()='Signup']")
    public WebElement newUserSignup;

    @FindBy(xpath = " //*[text()='Email Address already exist!']")
    public WebElement emailAlreadyExist;

    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement name;

    @FindBy(xpath = "//*[@data-qa='login-email']")
    public WebElement oldEmail;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement email;

    @FindBy(xpath = "//*[@data-qa='login-password']")
    public WebElement oldPassword;
    @FindBy(xpath = "//*[@data-qa='signup-button']")

    public WebElement buttonSign;
    @FindBy(xpath = "//*[@data-qa='login-button']")
    public WebElement oldSign;

    @FindBy(xpath = "//*[text()='salihBaba02']")
    public WebElement oldUserVisible;
    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement oldUserUnvisible;
    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountVisible;

    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement loggedOut;

    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    public WebElement mr;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement days;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement months;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement years;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletter;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement receive;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement laststName;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1;


    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement country;


    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccount;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreated;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continues;

    @FindBy(xpath = "//*[text()='salihBaba02']")
    public WebElement logged;

    @FindBy(xpath = "(//*[@style='color:brown;'])[2]")
    public WebElement deleteAccount;


    @FindBy(xpath = "//a[text()='Delete Account']")
    public WebElement lastDeleteAccount;

    @FindBy(xpath = "(//*[@data-parent='#accordian'])[2]")
    public WebElement menWear;

    @FindBy(xpath = "//a[text()='Jeans ']")
    public WebElement menJeans;


    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[5]")
    public WebElement addToCard;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCard;


    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//a[text()='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//*[@name='name_on_card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//*[@id='submit']")
    public WebElement pay;

    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement orderVisible;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement getInTouchName;

    @FindBy(xpath = "//*[@name='upload_file']")
    public WebElement getInTouchDosyaSec;

    @FindBy(xpath = "//*[@name='submit']")
    public WebElement getInTouchSubmit;

    @FindBy(xpath = "//*[@class='status alert alert-success']")
    public WebElement getInTouchSuccess;

    @FindBy(xpath = "//*[@class='fa fa-angle-double-left']")
    public WebElement getInTouchHome;

    @FindBy(xpath = "//*[@style='color: orange;']")
    public WebElement testCase;

    @FindBy(xpath = "//*[text()='Test Cases']")
    public WebElement testCaseVisible;

    @FindBy(xpath = "//*[@class='material-icons card_travel']")
    public WebElement products;


    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement allProductsVisible;

    @FindBy(xpath = "//*[text()='Brands']")
    public WebElement brandsVisible;


    @FindBy(xpath = "https://automationexercise.com/product_details/1")
    public WebElement productDetailPageVisible;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement serachBox;

    @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement searcBoxButton;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement searchedProductVisible;

    @FindBy(xpath = "//*[@class='pull-left']")
    public WebElement footerAltBilgiler;

    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement subscription;

    @FindBy(xpath = "//*[@id='susbscribe_email']")
    public WebElement subscriptionBox;

    @FindBy(xpath = "//*[@class='fa fa-arrow-circle-o-right']")
    public WebElement arrow;

    @FindBy(xpath = "//*[@id='footer']")
    public WebElement subscriptResultUnVisible;

    @FindBy(xpath = "//*[@class='fa fa-shopping-cart']")
    public WebElement cart;


    @FindBy(xpath = "(//*[@style='color: brown;'])[1]")
    public WebElement firstViewStyle;

    @FindBy(xpath = "//*[@class='btn btn-default cart']")
    public WebElement addCart;

    @FindBy(xpath = "//*[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShopping;

    @FindBy(xpath = "(//*[text()='View Product'])[2]")
    public WebElement secondViewStyle;

    @FindBy(xpath = "(//*[text()='Description'])[1]")
    public WebElement descriptionVisble;

    @FindBy(xpath = "(//*[text()='Price'])[1]")
    public WebElement priceVisible;

    @FindBy(xpath = "(//*[text()='Quantity'])[1]")
    public WebElement quantityVisible;

    @FindBy(xpath = "(//*[text()='Total'])[1]")
    public WebElement totalVisible;

    @FindBy(xpath = "(//*[@style='color: brown;'])[11]")
    public WebElement viewProductHomePage;

    @FindBy(xpath = "//*[text()='Frozen Tops For Kids']")
    public WebElement homePageProductDetailsVisible;

    @FindBy(xpath = "//*[@id='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "(//*[text()='Register / Login'])[1]")
    public WebElement registerLogin;

    @FindBy(xpath = "(//*[@name='email'])[1]")
    public WebElement registerLoginEmail;























}


