package starter.stepdefinitions.News;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.News.UserSearchNews;

public class UserSearchNewsSteps {

    @Steps
    UserSearchNews userSearchNews;

    @Given("I set valid Api Endpoint for user search news")
    public void setValidApiEndpoint() {userSearchNews.setValidApiEndpoint();}

    @When("I send valid request and valid token for user search news")
    public void sendValidRequest() {userSearchNews.sendValidRequest();}

    @When("I send valid request and valid token for user search news 1")
    public void sendValidRequest3() {userSearchNews.sendValidRequest3();}

    @And("User can search news")
    public void receiveValidData() {userSearchNews.receiveValidData();}

    @Given("I set invalid Api Endpoint for user search news")
    public void setInvalidApiEndpoint() {userSearchNews.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for user search news")
    public void sendInvalidRequest() {userSearchNews.sendInvalidRequest();}

    @When("I send valid request and invalid token for user search news")
    public void sendValidrequest1() {userSearchNews.sendValidRequest1();}

    @When("I send invalid request and invalid token for user search news")
    public void sendValidrequest2() {userSearchNews.sendValidRequest2();}

}
