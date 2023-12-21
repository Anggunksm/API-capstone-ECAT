package starter.stepdefinitions.user.auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gocat.user.auth.UpdateUser;

public class UpdateUserSteps {

    @Steps
    UpdateUser updateUser;

    @Given("I set valid API endpoint for update user")
    public void setValidApiEndpoint() {updateUser.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for update user")
    public void sendValidRequest() {updateUser.sendValidRequest();}

    @And("I send valid token for update user")
    public void sendValidToken() {updateUser.sendValidToken();}

    @Then("I Successfully update user")
    public void receiveValidData() {updateUser.receiveValidData();}

    @Given("I set invalid API endpoint for update user")
    public void setInvalidApiEndpoint() {updateUser.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for update user 1")
    public void sendValidRequest1() {updateUser.sendValidRequest1();}

    @When("I send invalid request and set valid json data for update user")
    public void sendInvalidRequest() {updateUser.sendInvalidRequest();}

    @And("I send invalid token for update user")
    public void sendInvalidToken() {updateUser.sendInvalidToken();}

    @When("I send valid request and set invalid json data for update user")
    public void sendValidRequest2() {updateUser.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for update user")
    public void sendInvalidRequest1() {updateUser.sendInvalidRequest1();}

}
