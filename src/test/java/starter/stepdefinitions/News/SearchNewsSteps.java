package starter.stepdefinitions.News;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gocat.admin.news.SearchNews;

public class SearchNewsSteps {

    @Steps
    SearchNews searchNews;

    @Given("I set valid Api Endpoint for search news")
    public void setValidApiEndpoint() {searchNews.setValidApiEndpoint();}

    @When("I send valid request and valid token for search news")
    public void sendValidRequest() {searchNews.sendValidRequest();}

    @When("I send valid request and valid token for search news 1")
    public void sendValidRequest3() {searchNews.sendValidRequest3();}

    @And("I can search news")
    public void receiveValidData() {searchNews.receiveValidData();}

    @Given("I set invalid Api Endpoint for search news")
    public void setInvalidApiEndpoint() {searchNews.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for search news")
    public void sendInvalidRequest() {searchNews.sendInvalidRequest();}

    @When("I send valid request and invalid token for search news")
    public void sendValidrequest1() {searchNews.sendValidRequest1();}

    @When("I send invalid request and invalid token for search news")
    public void sendValidrequest2() {searchNews.sendValidRequest2();}

}
