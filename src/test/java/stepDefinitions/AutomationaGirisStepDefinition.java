package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AutoexercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationaGirisStepDefinition {
    AutoexercisePage autoexercisePage=new AutoexercisePage();
    @Given("Kullanici automationExercise sitesine girer")
    public void kullaniciAutomationExerciseSitesineGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("autoexer"));
    }

    @And("Kulanici login butonunu tiklar")
    public void kulaniciLoginButonunuTiklar() {
        autoexercisePage.signIn.click();
    }

    @And("Kulanici Dogru email ve dogru sifre ile siteye basarili giris yapar")
    public void kulaniciDogruEmailVeDogruSifreIleSiteyeBasariliGirisYapar() {
        autoexercisePage.oldEmail.sendKeys(ConfigReader.getProperty("autoexerEmail"));
        autoexercisePage.oldPassword.sendKeys(ConfigReader.getProperty("autoexerPassword"));
        autoexercisePage.oldSign.click();
    }

    @And("Kullanici isminin login kisminda gorundugunu test eder")
    public void kullaniciIsmininLoginKismindaGorundugunuTestEder() {
        Assert.assertTrue(autoexercisePage.oldUserVisible.isDisplayed());

    }



    @And("Sayfayı kapatir")
    public void sayfayıKapatir() {
        Driver.closeDriver();
    }


}
