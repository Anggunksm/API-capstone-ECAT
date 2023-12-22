package starter.stepdefinitions.Like;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Like.AdminGetAllLike;

public class AdminGetAllLikeSteps {

    @Steps
    AdminGetAllLike adminGetAllLike;

    @Given("I set valid Api Endpoint for admin get all like")
    public void setValidApiEndpoint() {adminGetAllLike.setValidApiEndpoint();}

    @When("I send valid request and valid token for admin get all like")
    public void sendValidRequest() {adminGetAllLike.sendValidRequest();}

    @When("I send valid request and valid token for admin get all like 1")
    public void sendValidRequest3() {adminGetAllLike.sendValidRequest3();}

    @And("Admin can get all like")
    public void receiveValidData() {adminGetAllLike.receiveValidData();}

    @Given("I set invalid Api Endpoint for admin get all like")
    public void setInvalidApiEndpoint() {adminGetAllLike.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for admin get all like")
    public void sendInvalidRequest() {adminGetAllLike.sendInvalidRequest();}

    @When("I send valid request and invalid token for admin get all like")
    public void sendValidrequest1() {adminGetAllLike.sendValidRequest1();}

    @When("I send invalid request and invalid token for admin get all like")
    public void sendValidrequest2() {adminGetAllLike.sendValidRequest2();}
}
