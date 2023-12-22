package starter.stepdefinitions.Feedback;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Feedback.GetAllFeedback;


public class GetAllFeedbackSteps {

    @Steps
    GetAllFeedback getAllFeedback;

    @Given("I set valid Api Endpoint for admin get all feedback")
    public void setValidApiEndpoint() {getAllFeedback.setValidApiEndpoint();}

    @When("I send valid request and valid token for admin get all feedback")
    public void sendValidRequest() {getAllFeedback.sendValidRequest();}

    @When("I send valid request and valid token for admin get all feedback 1")
    public void sendValidRequest3() {getAllFeedback.sendValidRequest3();}

    @And("Admin can get all feedback")
    public void receiveValidData() {getAllFeedback.receiveValidData();}

    @Given("I set invalid Api Endpoint for admin get all feedback")
    public void setInvalidApiEndpoint() {getAllFeedback.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for admin get all feedback")
    public void sendInvalidRequest() {getAllFeedback.sendInvalidRequest();}

    @When("I send valid request and invalid token for admin get all feedback")
    public void sendValidrequest1() {getAllFeedback.sendValidRequest1();}

    @When("I send invalid request and invalid token for admin get all feedback")
    public void sendValidrequest2() {getAllFeedback.sendValidRequest2();}
}
