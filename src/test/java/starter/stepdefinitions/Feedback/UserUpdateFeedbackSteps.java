package starter.stepdefinitions.Feedback;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Feedback.UserUpdateFeedback;

public class UserUpdateFeedbackSteps {

    @Steps
    UserUpdateFeedback userUpdateFeedback;

    @Given("I set valid API endpoint for a user update feedback")
    public void setValidApiEndpoint() {userUpdateFeedback.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for a user update feedback")
    public void sendValidRequest() {userUpdateFeedback.sendValidRequest();}

    @And("I send valid token for a user update feedback")
    public void sendValidToken() {userUpdateFeedback.sendValidToken();}

    @Then("User Successfully update feedback")
    public void receiveValidData() {userUpdateFeedback.receiveValidData();}

    @Given("I set invalid API endpoint for a user update feedback")
    public void setInvalidApiEndpoint() {userUpdateFeedback.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for a user update feedback 1")
    public void sendValidRequest1() {userUpdateFeedback.sendValidRequest1();}

    @When("I send invalid request and set valid json data for a user update feedback")
    public void sendInvalidRequest() {userUpdateFeedback.sendInvalidRequest();}

    @And("I send invalid token for a user update feedback")
    public void sendInvalidToken() {userUpdateFeedback.sendInvalidToken();}

    @When("I send valid request and set invalid json data for a user update feedback")
    public void sendValidRequest2() {userUpdateFeedback.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for a user update feedback")
    public void sendInvalidRequest1() {userUpdateFeedback.sendInvalidRequest1();}
}
