package starter.stepdefinitions.News;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.News.UpdateNews;

public class UpdateNewsSteps {

    @Steps
    UpdateNews updateNews;

    @Given("I set valid API Endpoint for update news")
    public void setValidApiEndpoint() {updateNews.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for update news")
    public void sendValidRequest() {updateNews.sendValidRequest();}

    @And("I send valid token for update news")
    public void sendValidToken() {updateNews.sendValidToken();}

    @Then("I successfully update news")
    public void receiveValidData() {updateNews.receiveValidData();}

    @Given("I set invalid Api Endpoint for update news")
    public void setInvalidApiEndpoint() {updateNews.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for update news 1")
    public void sendValidRequest1() {updateNews.sendValidRequest1();}

    @When("I send invalid request and set valid json data for update news")
    public void sendInvalidRequest() {updateNews.sendInvalidRequest();}

    @And("I send invalid token for update news")
    public void sendInvalidToken() {updateNews.sendInvalidToken();}

    @When("I send valid request and set invalid json data for update news")
    public void sendValidRequest2() {updateNews.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for update news")
    public void sendInvalidRequest1() {updateNews.sendInvalidRequest1();}

}

