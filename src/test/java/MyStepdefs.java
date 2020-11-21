//package StepDefinitionFiles;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.*;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.Properties;

public class MyStepdefs extends UtilsFile {

    public Properties p;
    public GET_RatesAPI getCall;
    Response response;
    public String baseURL;
    public MyStepdefs()
    {
        p = new Properties();
        getCall = new GET_RatesAPI();
    }
    @Given("Rates API for latest foreign exchange")
    public void rates_api_for_latest_foreign_exchange() throws IOException {
        baseURL = getBaseURL("validBaseURL");
    }

    @When("I give GET call to the Rates API")
    public void i_give_GET_call_to_the_Rates_API() {
        getCall.callGET(baseURL);
    }

    @Then("Verify API call is success with status code {int}")
    public void verify_api_call_is_success_with_status_code(int expectedStatusCode) {
        getCall.verifySuccessStatusCode(expectedStatusCode);
    }

    @Then("Verify response for {string} is {string}")
    public void verify_response_for_is(String key, String val) {
        getCall.verifyJSonResponse(key,val);
    }

    @Given("Incorrect Rates API URL for latest foreign exchange")
    public void incorrect_Rates_API_URL_for_latest_foreign_exchange() throws IOException {
        baseURL = getBaseURL("invalidBaseURL");
    }

    @Then("Verify API call is incorrect with status code {int}")
    public void verify_API_call_is_incorrect_with_status_code(int expectedStatusCode) {
        getCall.verifyIncorrectStatusCode(expectedStatusCode);
    }


}
