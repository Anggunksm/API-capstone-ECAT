package starter.stepdefinitions.user.auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gocat.user.auth.UserRegister;

public class UserRegisterSteps {

    @Steps
    UserRegister register;

    @Given("I set valid API endpoint for register")
    public void setValidApiEndpoint() {register.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for register")
    public void sendValidRequest() {register.sendValidRequest();}

    @And("I Successfully Sign Up")
    public void receiveValidData() {register.receiveValidData();}

    @When("I send valid request and set json data with invalid email for register")
    public void sendValidRequest1() {register.sendValidRequest1();}

    @Given("I set invalid API endpoint for register")
    public void setInvalidApiEndpoint() {register.setInvalidApiEndpoint();}

    @When("I send invalid request and set valid json data for register")
    public void sendInvalidRequest() {register.sendInvalidRequest();}

    @When("I send valid request and set json data with invalid name for register")
    public void sendValidRequest2() {register.sendValidRequest2();}

    @When("I send valid request and set json data with invalid username for register")
    public void sendValidRequest3() {register.sendValidRequest3();}

    @When("I send valid request and set json data with empty email for register")
    public void sendValidRequest4() {register.sendValidRequest4();}

    @When("I send valid request and set json data with invalid number phone for register")
    public void sendValidRequest5() {register.sendValidRequest5();}

    @When("I send valid request and set json data with invalid password for register")
    public void sendValidRequest6() {register.sendValidRequest6();}

    @When("I send valid request and set invalid json data for register")
    public void sendValidRequest7() {register.sendValidRequest7();}

    @When("I send valid request and set json data with registered email for register")
    public void sendValidRequest8() {register.sendValidRequest8();}

    @When("I send invalid request and set invalid json data for register")
    public void sendInvalidRequest1() {register.sendInvalidRequest1();}

}
