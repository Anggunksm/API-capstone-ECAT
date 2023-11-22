package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.UserRegister;

public class UserRegisterSteps {

    @Steps
    UserRegister register;

    @Given("I set valid API endpoint for register")
    public void setValidApiEndpoint() {register.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for register")
    public void sendValidRequest() {register.sendValidRequest();}

    @Then("I receive status code 201")
    public void receiveStatusCode201() {register.receiveStatusCode201();}

    @And("I Successfully Sign Up")
    public void receiveValidData() {register.receiveValidData();}

    @When("I send valid request and set json data with invalid email for register")
    public void sendValidRequest1() {register.sendValidRequest1();}

    @Then("I receive status code 400")
    public void receiveStatusCode400() {register.receiveStatusCode400();}

    @Given("I set invalid API endpoint for register")
    public void setInvalidApiEndpoint() {register.setInvalidApiEndpoint();}

    @Then("I receive status code 401")
    public void receiveStatusCode401() {register.receiveStatusCode401();}

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

    @Then("I receive status code 409")
    public void receiveStatusCode409() {register.receiveStatusCode409();}

    @When("I send invalid request and set invalid json data for register")
    public void sendInvalidRequest1() {register.sendInvalidRequest1();}

}
