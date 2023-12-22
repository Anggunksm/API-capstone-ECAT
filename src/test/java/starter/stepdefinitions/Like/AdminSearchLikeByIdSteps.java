package starter.stepdefinitions.Like;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Like.AdminSearchLikeById;

public class AdminSearchLikeByIdSteps {

    @Steps
    AdminSearchLikeById adminSearchLikeById;

    @Given("I set valid Api Endpoint for admin search like")
    public void setValidApiEndpoint() {adminSearchLikeById.setValidApiEndpoint();}

    @When("I send valid request and valid token for admin search like")
    public void sendValidRequest() {adminSearchLikeById.sendValidRequest();}

    @When("I send valid request and valid token for admin search like 1")
    public void sendValidRequest3() {adminSearchLikeById.sendValidRequest3();}

    @And("Admin can search like")
    public void receiveValidData() {adminSearchLikeById.receiveValidData();}

    @Given("I set invalid Api Endpoint for admin search like")
    public void setInvalidApiEndpoint() {adminSearchLikeById.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for admin search like")
    public void sendInvalidRequest() {adminSearchLikeById.sendInvalidRequest();}

    @When("I send valid request and invalid token for admin search like")
    public void sendValidrequest1() {adminSearchLikeById.sendValidRequest1();}

    @When("I send invalid request and invalid token for admin search like")
    public void sendValidrequest2() {adminSearchLikeById.sendValidRequest2();}
}
