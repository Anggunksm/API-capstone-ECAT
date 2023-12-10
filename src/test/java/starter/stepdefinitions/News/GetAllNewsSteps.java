package starter.stepdefinitions.News;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.News.GetAllNews;

public class GetAllNewsSteps {

    @Steps
    GetAllNews getAllNews;

    @Given("I set valid Api Endpoint for get all news")
    public void setValidApiEndpoint() {getAllNews.setValidApiEndpoint();}

    @When("I send valid request and valid token for get all news")
    public void sendValidRequest() {getAllNews.sendValidRequest();}

    @When("I send valid request and valid token for get all news 1")
    public void sendValidRequest3() {getAllNews.sendValidRequest3();}

    @And("I can get all news")
    public void receiveValidData() {getAllNews.receiveValidData();}

    @Given("I set invalid Api Endpoint for get all news")
    public void setInvalidApiEndpoint() {getAllNews.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for get all news")
    public void sendInvalidRequest() {getAllNews.sendInvalidRequest();}

    @When("I send valid request and invalid token for get all news")
    public void sendValidrequest1() {getAllNews.sendValidRequest1();}

    @When("I send invalid request and invalid token for get all news")
    public void sendValidrequest2() {getAllNews.sendValidRequest2();}

}
