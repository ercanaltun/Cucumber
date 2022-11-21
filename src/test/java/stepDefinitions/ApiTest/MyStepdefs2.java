package stepDefinitions.ApiTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs2 {
    @Given("Endpoint  https:\\/\\/www.medunna.com\\/physician-appointment olarak set edilir")
    public void endpointHttpsWwwMedunnaComPhysicianAppointmentOlarakSetEdilir() {

    }

    @Then("User tum appointment datalari  icin get request yapar")
    public void userTumAppointmentDatalariIcinGetRequestYapar() {
    }

    @And("User gelen tum appointment bilgileri datasini deserialize eder")
    public void userGelenTumAppointmentBilgileriDatasiniDeserializeEder() {
    }

    @And("User tum appointment bilgileri datasini validate eder")
    public void userTumAppointmentBilgileriDatasiniValidateEder() {
    }
}
