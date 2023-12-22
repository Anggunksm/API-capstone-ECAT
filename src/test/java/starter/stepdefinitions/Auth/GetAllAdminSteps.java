package starter.stepdefinitions.Auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.user.Auth.GetAllAdmin;

public class GetAllAdminSteps {

    @Steps
    GetAllAdmin getAllAdmin;

    @Given("I set valid Api Endpoint for get all admin")
    public void setValidApiEndpoint() {getAllAdmin.setValidApiEndpoint();}

    @When("I send valid request and valid token for get all admin")
    public void sendValidRequest() {getAllAdmin.sendValidRequest();}

    @When("I send valid request and valid token for get all admin 1")
    public void sendValidRequest3() {getAllAdmin.sendValidRequest3();}

    @And("I can get all data admin")
    public void receiveValidData() {getAllAdmin.receiveValidData();}

    @Given("I set invalid Api Endpoint for get all admin")
    public void setInvalidApiEndpoint() {getAllAdmin.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for get all admin")
    public void sendInvalidRequest() {getAllAdmin.sendInvalidRequest();}

    @When("I send valid request and invalid token for get all admin")
    public void sendValidrequest1() {getAllAdmin.sendValidRequest1();}

    @When("I send invalid request and invalid token for get all admin")
    public void sendValidrequest2() {getAllAdmin.sendValidRequest2();}

}
