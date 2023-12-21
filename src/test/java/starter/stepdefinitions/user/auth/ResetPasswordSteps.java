package starter.stepdefinitions.user.auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gocat.user.auth.ResetPassword;

public class ResetPasswordSteps {

    @Steps
    ResetPassword resetPassword;

    @Given("I set valid API endpoint for reset password")
    public void setValidApiEndpoint() {resetPassword.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for reset password")
    public void sendValidRequest() {resetPassword.sendValidRequest();}

    @And("I send valid token for reset password")
    public void sendValidToken() {resetPassword.sendValidToken();}

    @Then("I Successfully change password")
    public void receiveValidData() {resetPassword.receiveValidData();}

    @Given("I set invalid API endpoint for reset password")
    public void setInvalidApiEndpoint() {resetPassword.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for reset password 1")
    public void sendValidRequest1() {resetPassword.sendValidRequest1();}

    @When("I send invalid request and set valid json data for reset password")
    public void sendInvalidRequest() {resetPassword.sendInvalidRequest();}

    @And("I send invalid token for reset password")
    public void sendInvalidToken() {resetPassword.sendInvalidToken();}

    @When("I send valid request and set invalid json data for reset password")
    public void sendValidRequest2() {resetPassword.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for reset password")
    public void sendInvalidRequest1() {resetPassword.sendInvalidRequest1();}

    @Then("I receive code {int}")
    public void receiveStatusCode(int statCode) {
        resetPassword.receiveStatusCode(statCode);
    }

    @And("I receive auth error message1")
    public void receiveAuthErrorMessage() {
        resetPassword.receiveAuthErrorMessage();
    }

}
