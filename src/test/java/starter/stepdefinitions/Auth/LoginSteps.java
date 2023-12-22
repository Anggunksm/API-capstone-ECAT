package starter.stepdefinitions.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Auth.Login;

public class LoginSteps {

    @Steps
    Login login;

    @Given("I set valid Api Endpoint for login")
    public void setValidAPIEndpoint() {login.setValidAPIEndpoint();}

    @When("I send valid request and send valid json data for login")
    public void sendValidRequest() {login.sendValidRequest();}

    @And("I successfully sign in")
    public void receiveValidData() {login.receiveValidData();}

    @Given("I set invalid Api Endpoint for login")
    public void setInvalidAPIEndpoint() {login.setInvalidAPIEndpoint();}

    @When("I send valid request and send valid json data for login 1")
    public void sendValidRequest1() {login.sendValidRequest1();}

    @When("I send invalid request and send valid json data for login")
    public void sendInvalidRequest() {login.sendInvalidRequest();}

    @When("I send valid request and send invalid username at json data for login")
    public void sendValidRequest2() {login.sendValidRequest2();}

    @When("I send valid request and send invalid password at json data for login")
    public void sendValidRequest3() {login.sendValidRequest3();}

    @When("I send valid request and send invalid json data for login")
    public void sendValidRequest4() {login.sendValidRequest4();}

    @When("I send invalid request and send invalid json data for login")
    public void sendInvalidRequest1() {login.sendInvalidRequest1();}


}
