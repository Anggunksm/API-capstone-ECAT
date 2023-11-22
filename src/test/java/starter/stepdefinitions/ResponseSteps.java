package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.user.ResponseBody;

public class ResponseSteps {

    @Steps
    ResponseBody responseBody;

    @Then("I receive status code {int}")
    public void receiveStatusCode(int statCode) {
        responseBody.receiveStatusCode(statCode);
    }

    @And("I receive auth error message")
    public void receiveAuthErrorMessage() {
        responseBody.receiveAuthErrorMessage();
    }

    @And("I receive error message")
    public void receiveErrorMessage() {
        responseBody.receiveErrorMessage();
    }

}
