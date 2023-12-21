package starter.stepdefinitions.News;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gocat.admin.news.CreateNews;
public class CreateNewsSteps {

    @Steps
    CreateNews createNews;

    @Given("I set valid API Endpoint for create news")
    public void setValidApiEndpoint() {createNews.setValidApiEndpoint();}

    @When("I send valid request and set valid json data for create news")
    public void sendValidRequest() {createNews.sendValidRequest();}

    @And("I send valid token for create news")
    public void sendValidToken() {createNews.sendValidToken();}

    @Then("I successfully create news")
    public void receiveValidData() {createNews.receiveValidData();}

    @Given("I set invalid Api Endpoint for create news")
    public void setInvalidApiEndpoint() {createNews.setInvalidApiEndpoint();}

    @When("I send valid request and set valid json data for create news 1")
    public void sendValidRequest1() {createNews.sendValidRequest1();}

    @When("I send invalid request and set valid json data for create news")
    public void sendInvalidRequest() {createNews.sendInvalidRequest();}

    @And("I send invalid token for create news")
    public void sendInvalidToken() {createNews.sendInvalidToken();}

    @When("I send valid request and set invalid json data for create news")
    public void sendValidRequest2() {createNews.sendValidRequest2();}

    @When("I send invalid request and set invalid json data for create news")
    public void sendInvalidRequest1() {createNews.sendInvalidRequest1();}

}
