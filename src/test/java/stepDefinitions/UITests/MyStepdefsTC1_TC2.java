package stepDefinitions.UITests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.ErcanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class MyStepdefsTC1_TC2 {
    ErcanPage ercanPage = new ErcanPage();

    @Given("Kullanici url adresine gider")
    public void kullaniciUrlAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna"));
    }

    @Then("Kullanici signin butonuna tiklar")
    public void kullaniciSigninButonunaTiklar() {
        ercanPage.enbas.click();
        ercanPage.signIn.click();
    }

    @And("Kullanici gecerli bir username ve password girer")
    public void kullaniciGecerliBirUsernameVePasswordGirer() {
        ercanPage.username.sendKeys(ConfigReader.getProperty("doctor"));
        ercanPage.password.sendKeys(ConfigReader.getProperty("drPassword"));
        ercanPage.signInButton.click();
    }

    @And("Kullanici ana sayfada My Page sekmesine tiklar")
    public void kullaniciAnaSayfadaMyPageSekmesineTiklar() {
        ercanPage.myPages.click();
    }

    @And("My page sekmesinden My Appointments secenegini tiklar")
    public void myPageSekmesindenMyAppointmentsSeceneginiTiklar() {
        ercanPage.myAppointments.click();
    }

    @And("Appointments sayfasında  randevu listesini ve zaman dilimlerini   bilgilerini gorur")
    public void appointmentsSayfasindaRandevuListesiniVeZamanDilimleriniBilgileriniGorur() {
        List<WebElement> ravdevuListesi = ercanPage.randevuList;
        assertTrue(!ravdevuListesi.isEmpty());
        assertTrue(ercanPage.fromDate.isDisplayed());
        assertTrue(ercanPage.toDate.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    //Test Case-2
    @And("Kullanici  patient id, start date, end date, status bilgilerini gorur")
    public void kullaniciPatientIdStartDateEndDateStatusBilgileriniGorur() {
        assertTrue(ercanPage.patientId.isDisplayed());
        assertTrue(ercanPage.startDate.isDisplayed());
        assertTrue(ercanPage.endDate.isDisplayed());
        assertTrue(ercanPage.status.isDisplayed());
    }

}
