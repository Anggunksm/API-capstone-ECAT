package starter.stepdefinitions.Comment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Comment.CreateComment;

public class CreateCommentSteps {

    @Steps
    CreateComment createComment;

    @Given("I set valid API Endpoint for user create comment")
    public void setValidApiEndpoint() {createComment.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for user create comment")
    public void sendValidRequest() {createComment.sendValidRequest();}

    @And("I send valid token for user create comment")
    public void sendValidToken() {createComment.sendValidToken();}

    @Then("User successfully create comment")
    public void receiveValidData() {createComment.receiveValidData();}

    @Given("I set invalid Api Endpoint for user create comment")
    public void setInvalidApiEndpoint() {createComment.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for user create comment 1")
    public void sendValidRequest1() {createComment.sendValidRequest1();}

    @When("I send invalid request and set valid json data for user create comment")
    public void sendInvalidRequest() {createComment.sendInvalidRequest();}

    @And("I send invalid token for user create comment")
    public void sendInvalidToken() {createComment.sendInvalidToken();}

    @When("I send valid request and set invalid json data for user create comment")
    public void sendValidRequest2() {createComment.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for user create comment")
    public void sendInvalidRequest1() {createComment.sendInvalidRequest1();}
}
