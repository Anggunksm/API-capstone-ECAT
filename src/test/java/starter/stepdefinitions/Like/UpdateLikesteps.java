package starter.stepdefinitions.Like;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Like.UpdateLike;

public class UpdateLikesteps {

    @Steps
    UpdateLike updateLike;

    @Given("I set valid API endpoint for update like")
    public void setValidApiEndpoint() {updateLike.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for update like")
    public void sendValidRequest() {updateLike.sendValidRequest();}

    @And("I send valid token for update like")
    public void sendValidToken() {updateLike.sendValidToken();}

    @Then("I Successfully update like")
    public void receiveValidData() {updateLike.receiveValidData();}

    @Given("I set invalid API endpoint for update like")
    public void setInvalidApiEndpoint() {updateLike.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for update like 1")
    public void sendValidRequest1() {updateLike.sendValidRequest1();}

    @When("I send invalid request and set valid json data for update like")
    public void sendInvalidRequest() {updateLike.sendInvalidRequest();}

    @And("I send invalid token for update like")
    public void sendInvalidToken() {updateLike.sendInvalidToken();}

    @When("I send valid request and set invalid json data for update like")
    public void sendValidRequest2() {updateLike.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for update like")
    public void sendInvalidRequest1() {updateLike.sendInvalidRequest1();}

}
