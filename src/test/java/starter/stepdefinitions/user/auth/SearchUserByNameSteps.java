package starter.stepdefinitions.user.auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gocat.user.auth.SearchUserByName;

public class SearchUserByNameSteps {

    @Steps
    SearchUserByName searchUserByName;

    @Given("I set valid Api Endpoint for Search User By Name")
    public void setValidApiEndpoint() {searchUserByName.setValidApiEndpoint();}

    @When("I send valid request and valid token for Search User By Name")
    public void sendValidRequest() {searchUserByName.sendValidRequest();}

    @When("I send valid request and valid token for Search User By Name 1")
    public void sendValidRequest3() {searchUserByName.sendValidRequest3();}

    @Given("I set invalid Api Endpoint for Search User By Name")
    public void setInvalidApiEndpoint() {searchUserByName.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for Search User By Name")
    public void sendInvalidRequest() {searchUserByName.sendInvalidRequest();}

    @When("I send valid request and invalid token for Search User By Name")
    public void sendValidrequest1() {searchUserByName.sendValidRequest1();}

    @When("I send invalid request and invalid token for Search User By Name")
    public void sendValidrequest2() {searchUserByName.sendValidRequest2();}

}
