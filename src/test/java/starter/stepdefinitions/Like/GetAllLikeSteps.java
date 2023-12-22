package starter.stepdefinitions.Like;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Like.GetAllLike;

public class GetAllLikeSteps {

    @Steps
    GetAllLike getAllLike;

    @Given("I set valid Api Endpoint for user get all like")
    public void setValidApiEndpoint() {getAllLike.setValidApiEndpoint();}

    @When("I send valid request and valid token for user get all like")
    public void sendValidRequest() {getAllLike.sendValidRequest();}

    @When("I send valid request and valid token for user get all like 1")
    public void sendValidRequest3() {getAllLike.sendValidRequest3();}

    @And("User can get all like")
    public void receiveValidData() {getAllLike.receiveValidData();}

    @Given("I set invalid Api Endpoint for user get all like")
    public void setInvalidApiEndpoint() {getAllLike.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token user for get all like")
    public void sendInvalidRequest() {getAllLike.sendInvalidRequest();}

    @When("I send valid request and invalid token for user get all like")
    public void sendValidrequest1() {getAllLike.sendValidRequest1();}

    @When("I send invalid request and invalid token for user get all like")
    public void sendValidrequest2() {getAllLike.sendValidRequest2();}
}
