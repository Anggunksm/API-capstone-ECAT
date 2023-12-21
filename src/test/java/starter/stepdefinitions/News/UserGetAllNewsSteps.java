package starter.stepdefinitions.News;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gocat.user.News.UserGetAllNews;

public class UserGetAllNewsSteps {

    @Steps
    UserGetAllNews userGetAllNews;

    @Given("I set valid Api Endpoint for user get all news")
    public void setValidApiEndpoint() {userGetAllNews.setValidApiEndpoint();}

    @When("I send valid request and valid token for user get all news")
    public void sendValidRequest() {userGetAllNews.sendValidRequest();}

    @When("I send valid request and valid token for user get all news 1")
    public void sendValidRequest3() {userGetAllNews.sendValidRequest3();}

    @And("User can get all news")
    public void receiveValidData() {userGetAllNews.receiveValidData();}

    @Given("I set invalid Api Endpoint for user get all news")
    public void setInvalidApiEndpoint() {userGetAllNews.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token user for get all news")
    public void sendInvalidRequest() {userGetAllNews.sendInvalidRequest();}

    @When("I send valid request and invalid token for user get all news")
    public void sendValidrequest1() {userGetAllNews.sendValidRequest1();}

    @When("I send invalid request and invalid token for user get all news")
    public void sendValidrequest2() {userGetAllNews.sendValidRequest2();}
}
