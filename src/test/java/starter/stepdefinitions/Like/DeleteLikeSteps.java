package starter.stepdefinitions.Like;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Like.DeleteLike;

public class DeleteLikeSteps {

    @Steps
    DeleteLike deleteLike;

    @Given("I set valid Api Endpoint for delete like")
    public void setValidApiEndpoint() {deleteLike.setValidApiEndpoint();}

    @When("I send valid request and valid token for delete like")
    public void sendValidRequest() {deleteLike.sendValidRequest();}

    @When("I send valid request and valid token for delete like 1")
    public void sendValidRequest3() {deleteLike.sendValidRequest3();}

    @Given("I set invalid Api Endpoint for delete like")
    public void setInvalidApiEndpoint() {deleteLike.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for delete like")
    public void sendInvalidRequest() {deleteLike.sendInvalidRequest();}

    @When("I send valid request and invalid token for delete like")
    public void sendValidrequest1() {deleteLike.sendValidRequest1();}

    @When("I send invalid request and invalid token for delete like")
    public void sendValidrequest2() {deleteLike.sendValidRequest2();}

    @And("I successfully delete like")
    public void receiveValidData() {deleteLike.receiveValidData();}
}
