package stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeNegativePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class PracticeNegativeTestStepDef {

    PracticeNegativePage practiceNegativePage=new PracticeNegativePage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arg0) {
        Driver.getDriver().get("https://medunna.com/");
    }

    @And("login olmak icin signin e tiklar")
    public void loginOlmakIcinSigninETiklar() {
        ReusableMethods.waitForClickablility( practiceNegativePage.signinSymbol,5);
        practiceNegativePage.signinSymbol.click();
        practiceNegativePage.signin.click();

    }

    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String username) {
        username= Faker.instance().name().username();
        practiceNegativePage.userName.sendKeys(username);
    }

    @And("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String password) {
        password=Faker.instance().internet().password();
        actions.sendKeys(Keys.TAB).sendKeys(password).sendKeys(Keys.TAB).click().perform();
    }

    @And("signine tiklar")
    public void signineTiklar() {
        practiceNegativePage.sigInNewAccount.click();
    }

    @And("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {
        ReusableMethods.waitForVisibility(practiceNegativePage.kaybolanTextMesseage,5);
        Assert.assertTrue(practiceNegativePage.kaybolanTextMesseage.isDisplayed());
    }
}
