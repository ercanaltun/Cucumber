package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonSearchNutellaStepDefinition {
         AmazonPage amazonPage=new AmazonPage();
    @Given("Kullanici amazon ana sayfasina gider")
    public void kullaniciAmazonAnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
    }

    @Then("Kullanici searchboxta nutella aratir")
    public void kullaniciSearchboxtaNutellaAratir() {
        amazonPage.aramaKutusu.sendKeys("nutella", Keys.ENTER);
    }

    @And("Arama sonucunun gorundugunu test eder")
    public void aramaSonucununGorundugunuTestEder() {
        String expectedResult="nutella";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedResult));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


    @Then("Kullanici searchboxta dell aratir")
    public void kullaniciSearchboxtaDellAratir() {
        amazonPage.aramaKutusu.sendKeys("dell", Keys.ENTER);
    }

    @And("Arama sonucunda dell gorundugunu test eder")
    public void aramaSonucundaDellGorundugunuTestEder() {
        String expectedResult="dell";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedResult));


    }



}
