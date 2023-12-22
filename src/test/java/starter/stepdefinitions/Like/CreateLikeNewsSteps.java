package starter.stepdefinitions.Like;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Like.CreateLike;

public class CreateLikeNewsSteps {

    @Steps
    CreateLike createLike;

    @Given("I set valid API Endpoint for create like")
    public void setValidApiEndpoint() {createLike.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for create like")
    public void sendValidRequest() {createLike.sendValidRequest();}

    @And("I send valid token for create like")
    public void sendValidToken() {createLike.sendValidToken();}

    @Then("I successfully create like")
    public void receiveValidData() {createLike.receiveValidData();}

    @Given("I set invalid Api Endpoint for create like")
    public void setInvalidApiEndpoint() {createLike.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for create like 1")
    public void sendValidRequest1() {createLike.sendValidRequest1();}

    @When("I send invalid request and set valid json data for create like")
    public void sendInvalidRequest() {createLike.sendInvalidRequest();}

    @And("I send invalid token for create like")
    public void sendInvalidToken() {createLike.sendInvalidToken();}

    @When("I send valid request and set invalid json data for create like")
    public void sendValidRequest2() {createLike.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for create like")
    public void sendInvalidRequest1() {createLike.sendInvalidRequest1();}
}
