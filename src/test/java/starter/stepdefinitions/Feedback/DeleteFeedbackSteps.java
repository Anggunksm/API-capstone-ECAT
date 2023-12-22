package starter.stepdefinitions.Feedback;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Feedback.DeleteFeedback;

public class DeleteFeedbackSteps {

    @Steps
    DeleteFeedback deleteFeedback;

    @Given("I set valid Api Endpoint for delete feedback")
    public void setValidApiEndpoint() {deleteFeedback.setValidApiEndpoint();}

    @When("I send valid request and valid token for delete feedback")
    public void sendValidRequest() {deleteFeedback.sendValidRequest();}

    @When("I send valid request and valid token for delete feedback 1")
    public void sendValidRequest3() {deleteFeedback.sendValidRequest();}

    @Given("I set invalid Api Endpoint for delete feedback")
    public void setInvalidApiEndpoint() {deleteFeedback.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for delete feedback")
    public void sendInvalidRequest() {deleteFeedback.sendInvalidRequest();}

    @When("I send valid request and invalid token for delete feedback")
    public void sendValidrequest1() {deleteFeedback.sendValidRequest1();}

    @When("I send invalid request and invalid token for delete feedback")
    public void sendValidrequest2() {deleteFeedback.sendValidRequest2();}

}
