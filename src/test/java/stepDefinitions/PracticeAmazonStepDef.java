package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PracticeAmazonStepDef {
    AmazonPage amazonPage=new AmazonPage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Given("kullanici Amazon web sitesine gider")
    public void kullaniciAmazonWebSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
    }

    @And("sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        amazonPage.helloSignIn.click();
        //2. Yol:   actions.moveToElement(amazonPage.helloSignIn).click(amazonPage.signIn).perform();
    }

    @And("faker kullanarak e-posta gonderir")
    public void fakerKullanarakEPostaGonderir() {
        amazonPage.emailBox.sendKeys(faker.internet().emailAddress());
    }

    @And("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigiEPostaninEkranGoruntusunuAlir() throws IOException {
        ReusableMethods.getScreenshotWebElement("FakeEmail",amazonPage.emailBox);
    }

    @Then("continiue'a tiklar")
    public void continiueATiklar() {
        amazonPage.continueEmail.click();
    }

    @And("There was a problem mesajini dogrular")
    public void thereWasAProblemMesajiniDogrular() {
        String expectedText="There was a problem";
        Assert.assertTrue(amazonPage.thereWasProblem.getText().contains(expectedText));
    }

    @And("Need help e tiklar")
    public void needHelpETiklar() {
        amazonPage.needHelp.click();
    }

    @And("forgot your password e tiklar")
    public void forgotYourPasswordETiklar() {
        amazonPage.forgetPassword.click();
    }

    @And("Password assistance metnini dogrular")
    public void passwordAssistanceMetniniDogrular() {
        Assert.assertTrue(amazonPage.passworsAsisstantText.isDisplayed());
    }

    @And("Geri gider")
    public void geriGider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
    }

    @And("Create your account butonuna tiklar")
    public void createYourAccountButonunaTiklar() {
        amazonPage.creatYourAccount.click();
    }

    @Then("Create account metnini dogrular")
    public void createAccountMetniniDogrular() {
        Assert.assertTrue(amazonPage.creatYourAccountText.getText().contains("Create account"));
    }

    @And("websayfasiyi kapatir")
    public void websayfasiyiKapatir() {
        Driver.closeDriver();
    }

}
