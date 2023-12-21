package starter.stepdefinitions.user.auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gocat.user.auth.UpdatePhotoProfile;

public class UpdatePhotoProfileSteps {

    @Steps
    UpdatePhotoProfile updatePhotoProfile;

    @Given("I set valid API Endpoint for update photo profile")
    public void setValidAPIEndpoint() {updatePhotoProfile.setValidAPIEndpoint();}

    @When("I send valid request and valid body for update photo profile")
    public void sendValidRequest() {updatePhotoProfile.sendValidRequest();}

    @And("I send valid token for update photo profile")
    public void sendValidToken() {updatePhotoProfile.sendValidToken();}

    @And("I successfully updated my profile photo")
    public void receiveValidData() {updatePhotoProfile.receiveValidData();}

    @Given("I set invalid API endpoint for update photo profile")
    public void setInvalidApiEndpoint() {updatePhotoProfile.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for update photo profile 1")
    public void sendValidRequest1() {updatePhotoProfile.sendValidRequest1();}

    @When("I send invalid request and set valid json data for update photo profile")
    public void sendInvalidRequest() {updatePhotoProfile.sendInvalidRequest();}

    @And("I send invalid token for update photo profile")
    public void sendInvalidToken() {updatePhotoProfile.sendInvalidToken();}

    @When("I send valid request and set invalid json data for update photo profile")
    public void sendValidRequest2() {updatePhotoProfile.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for update photo profile")
    public void sendInvalidRequest1() {updatePhotoProfile.sendInvalidRequest1();}



}
