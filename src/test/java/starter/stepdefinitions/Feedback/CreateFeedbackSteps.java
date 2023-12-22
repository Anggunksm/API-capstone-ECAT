package starter.stepdefinitions.Feedback;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Comment.AdminCreateComment;
import starter.user.Feedback.CreateFeedback;

public class CreateFeedbackSteps {

    @Steps
    CreateFeedback createFeedback;

    @Given("I set valid API Endpoint for admin create feedback")
    public void setValidApiEndpoint() {createFeedback.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for admin create feedback")
    public void sendValidRequest() {createFeedback.sendValidRequest();}

    @And("I send valid token for admin create feedback")
    public void sendValidToken() {createFeedback.sendValidToken();}

    @Then("I successfully create feedback")
    public void receiveValidData() {createFeedback.receiveValidData();}

    @Given("I set invalid Api Endpoint for admin create feedback")
    public void setInvalidApiEndpoint() {createFeedback.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for admin create feedback 1")
    public void sendValidRequest1() {createFeedback.sendValidRequest1();}

    @When("I send invalid request and set valid json data for admin create feedback")
    public void sendInvalidRequest() {createFeedback.sendInvalidRequest();}

    @And("I send invalid token for admin create feedback")
    public void sendInvalidToken() {createFeedback.sendInvalidToken();}

    @When("I send valid request and set invalid json data for admin create feedback")
    public void sendValidRequest2() {createFeedback.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for admin create feedback")
    public void sendInvalidRequest1() {createFeedback.sendInvalidRequest1();}
}
