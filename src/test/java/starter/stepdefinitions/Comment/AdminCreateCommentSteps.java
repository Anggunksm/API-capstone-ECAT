package starter.stepdefinitions.Comment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Comment.AdminCreateComment;

public class AdminCreateCommentSteps {

    @Steps
    AdminCreateComment adminCreateComment;

    @Given("I set valid API Endpoint for create comment")
    public void setValidApiEndpoint() {adminCreateComment.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for create comment")
    public void sendValidRequest() {adminCreateComment.sendValidRequest();}

    @And("I send valid token for create comment")
    public void sendValidToken() {adminCreateComment.sendValidToken();}

    @Then("I successfully create comment")
    public void receiveValidData() {adminCreateComment.receiveValidData();}

    @Given("I set invalid Api Endpoint for create comment")
    public void setInvalidApiEndpoint() {adminCreateComment.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for create comment 1")
    public void sendValidRequest1() {adminCreateComment.sendValidRequest1();}

    @When("I send invalid request and set valid json data for create comment")
    public void sendInvalidRequest() {adminCreateComment.sendInvalidRequest();}

    @And("I send invalid token for create comment")
    public void sendInvalidToken() {adminCreateComment.sendInvalidToken();}

    @When("I send valid request and set invalid json data for create comment")
    public void sendValidRequest2() {adminCreateComment.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for create comment")
    public void sendInvalidRequest1() {adminCreateComment.sendInvalidRequest1();}
}
