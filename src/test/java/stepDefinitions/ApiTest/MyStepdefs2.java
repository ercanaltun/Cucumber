package stepDefinitions.ApiTest;

import baseUrl.MedunnaBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class MyStepdefs2 {
    String url;
    @Given("Endpoint  set edilir")
    public void endpointHttpsWwwMedunnaComPhysicianAppointmentOlarakSetEdilir() {
        String url="https://www.medunna.com/api/physicians/322856";

    }

    @Then("User tum appointment datalari  icin get request yapar")
    public void userTumAppointmentDatalariIcinGetRequestYapar() {

        Response response=given().headers("Authorization","Bearer "+generateToken()).when().get(url);
        response.prettyPrint();
    }

    @And("User gelen tum appointment bilgileri datasini deserialize eder")
    public void userGelenTumAppointmentBilgileriDatasiniDeserializeEder() {

    }

    @And("User tum appointment bilgileri datasini validate eder")
    public void userTumAppointmentBilgileriDatasiniValidateEder() {
    }
}
