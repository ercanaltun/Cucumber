package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebDriverPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class WebDriverStepDefinition {
    WebDriverPage webDriverPage = new WebDriverPage();
    Actions actions = new Actions(Driver.getDriver());
    String ilkSayfa;
    List<String> windowList;

    @Given("http:webdriveruniversity.com adresine gidin")
    public void httpWebdriveruniversityComAdresineGidin() {
        Driver.getDriver().get(ConfigReader.getProperty("webDrUrl"));
        ilkSayfa = Driver.getDriver().getCurrentUrl();
        ReusableMethods.waitFor(2);
    }

    @And("Login Portal a kadar asagi inin")
    public void loginPortalAKadarAsagiInin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
    }

    @And("Login Portal a tiklayin")
    public void loginPortalATiklayin() {
        webDriverPage.loginPortal.click();
    }

    @And("Diger window'a gecin")
    public void digerWindowAGecin() {
        windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowList.get(1));
    }

    @And("username ve password kutularina deger yazdirin")
    public void usernameVePasswordKutularinaDegerYazdirin() {
        webDriverPage.userName.sendKeys("gggll", Keys.TAB);
    }

    @And("login butonuna basin")
    public void loginButonunaBasin() {
        actions.sendKeys("kmoıo", Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("Popup'ta cikan yazinin validation failed oldugunu test edin")
    public void popupTaCikanYazininValidationFailedOldugunuTestEdin() {
        String expectedPop = "validation failed";
        String actualPop = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedPop, actualPop);
    }

    @And("Ok diyerek Popup'i kapatin")
    public void okDiyerekPopupIKapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("Ilk sayfaya geri donun")
    public void ılkSayfayaGeriDonun() {
        Driver.getDriver().switchTo().window(windowList.get(0));
    }

    @And("Ilk sayfaya donuldugunu test edin")
    public void ılkSayfayaDonuldugunuTestEdin() {
        Assert.assertEquals(ilkSayfa, Driver.getDriver().getCurrentUrl());
    }
}
