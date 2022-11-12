package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class GridStepDefs {
WebDriver driver;

    @Given("user is on the application_url {string}")
    public void user_is_on_the_application_url(String url) throws MalformedURLException {
     driver= new RemoteWebDriver(new URL("http://192.168.1.4:4444"),new ChromeOptions());
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.manage().window().maximize();
      driver.get(url);
    }


    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        String actualTitle=driver.getTitle();

        assertEquals("title uyusmadı"+expectedTitle,actualTitle);

    }


    @Then("close the remote driver")
    public void close_the_remote_driver() {
        driver.close();

    }


    @Given("user is on the application_url with firefox{string}")
    public void userIsOnTheApplication_urlWithFirefox(String url) throws MalformedURLException {
        driver= new RemoteWebDriver(new URL("http://192.168.1.4:4444"),new FirefoxOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);

    }
}
