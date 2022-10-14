package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.WebDriverPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
/*
public class WebDriverUniversityStepDefinition {
    WebDriverPage webDriverPage=new WebDriverPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Kullanici webdriveruniversity.com adresine gidin")
    public void kullaniciWebdriveruniversityComAdresineGidin() {
        Driver.getDriver().get(ConfigReader.getProperty("webDrUrl"));
        String ilkSayfa=Driver.getDriver().getCurrentUrl();
    }

    @And("Login Portal a kadar asagi inin")
    public void loginPortalAKadarAsagiInin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("Login Portal a tiklayin")
    public void loginPortalATiklayin() {
        webDriverPage.loginPortal.click();
    }

    @And("Diger window'a gecin")
    public void digerWindowAGecin() {
        List<String> windowList=new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowList.get(1));
    }

    @And("username ve password kutularina deger yazdirin")
    public void usernameVePasswordKutularinaDegerYazdirin() {
        webDriverPage.userName.sendKeys("gggll",Keys.TAB);
    }

    @And("login butonuna basin")
    public void loginButonunaBasin() {
        actions.sendKeys("kmoıo",Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("Popup'ta cikan yazinin validation failed oldugunu test edin")
    public void popupTaCikanYazininValidationFailedOldugunuTestEdin() {
        String expectedPop="validation failed";
       String actualPop= Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedPop,actualPop);
    }

    @And("Ok diyerek Popup'i kapatin")
    public void okDiyerekPopupIKapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("Ilk sayfaya geri donun")
    public void ılkSayfayaGeriDonun() {
       Driver.getDriver().navigate().back();
    }

    @And("Ilk sayfaya donuldugunu test edin")
    public void ılkSayfayaDonuldugunuTestEdin() {
        String expectedFirstPage="https://webdriveruniversity.com/";
        Assert.assertEquals(expectedFirstPage,Driver.getDriver().getCurrentUrl());
    }
}
*/