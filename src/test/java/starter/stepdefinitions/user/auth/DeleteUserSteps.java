package starter.stepdefinitions.user.auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gocat.user.auth.DeleteUser;

public class DeleteUserSteps {

    @Steps
    DeleteUser deleteUser;

    @Given("I set valid Api Endpoint for delete user")
    public void setValidApiEndpoint() {deleteUser.setValidApiEndpoint();}

    @When("I send valid request and valid token for delete user")
    public void sendValidRequest() {deleteUser.sendValidRequest();}

    @When("I send valid request and valid token for delete user 1")
    public void sendValidRequest3() {deleteUser.sendValidRequest3();}

    @Given("I set invalid Api Endpoint for delete user")
    public void setInvalidApiEndpoint() {deleteUser.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for delete user")
    public void sendInvalidRequest() {deleteUser.sendInvalidRequest();}

    @When("I send valid request and invalid token for delete user")
    public void sendValidrequest1() {deleteUser.sendValidRequest1();}

    @When("I send invalid request and invalid token for delete user")
    public void sendValidrequest2() {deleteUser.sendValidRequest2();}
}

