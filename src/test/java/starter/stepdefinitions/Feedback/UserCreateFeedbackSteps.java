package starter.stepdefinitions.Feedback;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Feedback.UserCreateFeedback;

public class UserCreateFeedbackSteps {

    @Steps
    UserCreateFeedback userCreateFeedback;

    @Given("I set valid API Endpoint for a user create feedback")
    public void setValidApiEndpoint() {userCreateFeedback.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for a user create feedback")
    public void sendValidRequest() {userCreateFeedback.sendValidRequest();}

    @And("I send valid token for a user create feedback")
    public void sendValidToken() {userCreateFeedback.sendValidToken();}

    @Then("User successfully create feedback")
    public void receiveValidData() {userCreateFeedback.receiveValidData();}

    @Given("I set invalid Api Endpoint for a user create feedback")
    public void setInvalidApiEndpoint() {userCreateFeedback.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for a user create feedback 1")
    public void sendValidRequest1() {userCreateFeedback.sendValidRequest1();}

    @When("I send invalid request and set valid json data for a user create feedback")
    public void sendInvalidRequest() {userCreateFeedback.sendInvalidRequest();}

    @And("I send invalid token for a user create feedback")
    public void sendInvalidToken() {userCreateFeedback.sendInvalidToken();}

    @When("I send valid request and set invalid json data for a user create feedback")
    public void sendValidRequest2() {userCreateFeedback.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for a user create feedback")
    public void sendInvalidRequest1() {userCreateFeedback.sendInvalidRequest1();}
}
