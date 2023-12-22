package starter.stepdefinitions.Feedback;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Feedback.UsergetAllfeedback;

public class UsergetAllfeedbackSteps {

    @Steps
    UsergetAllfeedback usergetAllfeedback;


    @Given("I set valid Api Endpoint for a user get all feedback")
    public void setValidApiEndpoint() {usergetAllfeedback.setValidApiEndpoint();}

    @When("I send valid request and valid token for a user get all feedback")
    public void sendValidRequest() {usergetAllfeedback.sendValidRequest();}

    @When("I send valid request and valid token for a user get all feedback 1")
    public void sendValidRequest3() {usergetAllfeedback.sendValidRequest3();}

    @And("User can get all feedback")
    public void receiveValidData() {usergetAllfeedback.receiveValidData();}

    @Given("I set invalid Api Endpoint for a user get all feedback")
    public void setInvalidApiEndpoint() {usergetAllfeedback.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for a user get all feedback")
    public void sendInvalidRequest() {usergetAllfeedback.sendInvalidRequest();}

    @When("I send valid request and invalid token for a user get all feedback")
    public void sendValidrequest1() {usergetAllfeedback.sendValidRequest1();}

    @When("I send invalid request and invalid token for a user get all feedback")
    public void sendValidrequest2() {usergetAllfeedback.sendValidRequest2();}
}
