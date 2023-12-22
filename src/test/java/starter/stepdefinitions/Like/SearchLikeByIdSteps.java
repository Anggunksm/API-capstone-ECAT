package starter.stepdefinitions.Like;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Like.SearchLikeById;

public class SearchLikeByIdSteps {

    @Steps
    SearchLikeById searchLikeById;

    @Given("I set valid Api Endpoint for search like")
    public void setValidApiEndpoint() {searchLikeById.setValidApiEndpoint();}

    @When("I send valid request and valid token for search like")
    public void sendValidRequest() {searchLikeById.sendValidRequest();}

    @When("I send valid request and valid token for search like 1")
    public void sendValidRequest3() {searchLikeById.sendValidRequest3();}

    @And("I can search like")
    public void receiveValidData() {searchLikeById.receiveValidData();}

    @Given("I set invalid Api Endpoint for search like")
    public void setInvalidApiEndpoint() {searchLikeById.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for search like")
    public void sendInvalidRequest() {searchLikeById.sendInvalidRequest();}

    @When("I send valid request and invalid token for search like")
    public void sendValidrequest1() {searchLikeById.sendValidRequest1();}

    @When("I send invalid request and invalid token for search like")
    public void sendValidrequest2() {searchLikeById.sendValidRequest2();}
}
