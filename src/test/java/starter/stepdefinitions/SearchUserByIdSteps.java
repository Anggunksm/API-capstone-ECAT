package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.SearchUserById;

public class SearchUserByIdSteps {

    @Steps
    SearchUserById searchUserById;

    @Given("I set valid Api Endpoint for Search User By Id")
    public void setValidApiEndpoint() {searchUserById.setValidApiEndpoint();}

    @When("I send valid request and valid token for Search User By Id")
    public void sendValidRequest() {searchUserById.sendValidRequest();}

    @When("I send valid request and valid token for Search User By Id 1")
    public void sendValidRequest3() {searchUserById.sendValidRequest3();}

    @And("I can find user that i want")
    public void receiveValidData() {searchUserById.receiveValidData();}

    @Given("I set invalid Api Endpoint for Search User By Id")
    public void setInvalidApiEndpoint() {searchUserById.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for Search User By Id")
    public void sendInvalidRequest() {searchUserById.sendInvalidRequest();}

    @When("I send valid request and invalid token for Search User By Id")
    public void sendValidrequest1() {searchUserById.sendValidRequest1();}

    @When("I send invalid request and invalid token for Search User By Id")
    public void sendValidrequest2() {searchUserById.sendValidRequest2();}

}

