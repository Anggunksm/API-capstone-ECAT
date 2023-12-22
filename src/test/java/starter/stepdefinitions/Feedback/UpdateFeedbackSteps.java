package starter.stepdefinitions.Feedback;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Feedback.UpdateFeedback;

public class UpdateFeedbackSteps {

    @Steps
    UpdateFeedback updateFeedback;

    @Given("I set valid API endpoint for admin update feedback")
    public void setValidApiEndpoint() {updateFeedback.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for admin update feedback")
    public void sendValidRequest() {updateFeedback.sendValidRequest();}

    @And("I send valid token for admin update feedback")
    public void sendValidToken() {updateFeedback.sendValidToken();}

    @Then("I Successfully update feedback")
    public void receiveValidData() {updateFeedback.receiveValidData();}

    @Given("I set invalid API endpoint for admin update feedback")
    public void setInvalidApiEndpoint() {updateFeedback.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for admin update feedback 1")
    public void sendValidRequest1() {updateFeedback.sendValidRequest1();}

    @When("I send invalid request and set valid json data for admin update feedback")
    public void sendInvalidRequest() {updateFeedback.sendInvalidRequest();}

    @And("I send invalid token for admin update feedback")
    public void sendInvalidToken() {updateFeedback.sendInvalidToken();}

    @When("I send valid request and set invalid json data for admin update feedback")
    public void sendValidRequest2() {updateFeedback.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for admin update feedback")
    public void sendInvalidRequest1() {updateFeedback.sendInvalidRequest1();}
}
