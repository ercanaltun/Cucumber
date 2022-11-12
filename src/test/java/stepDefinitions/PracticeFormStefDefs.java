package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.PracticeFormPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class PracticeFormStefDefs {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(url);
    }

    @And("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String userName, String password, String textarea) {
        userName = Faker.instance().name().username();
        password = Faker.instance().internet().password();
        textarea = Faker.instance().name().username();

        practiceFormPage.userName.sendKeys(userName);
        practiceFormPage.password.sendKeys(password);
        practiceFormPage.texArea.clear();
        practiceFormPage.texArea.sendKeys(textarea);
    }

    @And("bir dosya yukler")
    public void birDosyaYukler() {
        ReusableMethods.waitFor(2);
        practiceFormPage.dosyaSec.sendKeys("C:\\Users\\Pc\\Desktop\\test.text.txt");
        //  String homeDirectory=System.getProperty("user.home");
        //  String filePath=homeDirectory+"Desktop.test.txt";
        ReusableMethods.waitFor(2);
    }

    @And("checkbox{int} i secer")
    public void checkboxISecer(int arg0) {
        if (!practiceFormPage.checkBox1.isSelected()) {
            practiceFormPage.checkBox1.click();
        }
        if (practiceFormPage.checkBox2.isSelected()) {
            practiceFormPage.checkBox2.click();
        }
        if (practiceFormPage.checkBox3.isSelected()) {
            practiceFormPage.checkBox3.click();
        }
    }

    @And("radio{int} yi secer")
    public void radioYiSecer(int arg0) {
        practiceFormPage.radio1.click();
    }

    @And("selection item{int} secer")
    public void selectionItemSecer(int arg0) {
        practiceFormPage.multipleSelect3.click();
    }

    @And("dropdown itmem{int} secer")
    public void dropdownItmemSecer(int arg0) {
        Select select = new Select(practiceFormPage.dropdown);
        Random random = new Random();
        int rastgele = random.nextInt(select.getOptions().size() - 1);
        select.selectByIndex(rastgele);
    }

    @And("submite tiklar")
    public void submiteTiklar() {
        practiceFormPage.submitButton.click();
    }

    @Then("dosyanin yuklendigini dogrular")
    public void dosyaninYuklendiginiDogrular() {
        Assert.assertTrue(practiceFormPage.fileVisible.isDisplayed());

    }
}
