package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoexercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;


public class Practice_TC_07step {
    AutoexercisePage autoexercisePage=new AutoexercisePage();
    @Given("Tarayiciyi başlatarak {string} url'sine gidin")
    public void tarayiciyiBaşlatarakUrlSineGidin(String istenenSite) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenSite));

    }

    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void anaSayfaninBasariylaGorunurOldugunuDogrulayin() {
        String expectedHomePage="https://automationexercise.com/";
        Assert.assertTrue(expectedHomePage.equals(Driver.getDriver().getCurrentUrl()));
    }

    @And("Test Case buttonu na tiklayin")
    public void testCaseButtonuNaTiklayin() {
        autoexercisePage.testCase.click();
    }

    @Then("Kullanicinin test case sayfasina başariyla yonlendirildiğini dogrulayin")
    public void kullanicininTestCaseSayfasinaBaşariylaYonlendirildiğiniDogrulayin() {
        Assert.assertTrue(autoexercisePage.testCaseVisible.isDisplayed());
    }

    @And("Ilgili sayfanın ekran goruntusunu alin")
    public void ılgiliSayfanınEkranGoruntusunuAlin() throws IOException {
        ReusableMethods.getScreenshot("autoexercisePage.testCase");
    }
}
