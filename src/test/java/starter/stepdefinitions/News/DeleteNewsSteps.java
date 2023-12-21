package starter.stepdefinitions.News;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.gocat.admin.news.DeleteNews;

public class DeleteNewsSteps {

    @Steps
    DeleteNews deleteNews;

    @Given("I set valid Api Endpoint for delete news")
    public void setValidApiEndpoint() {deleteNews.setValidApiEndpoint();}

    @When("I send valid request and valid token for delete news")
    public void  sendValidRequest() {deleteNews.sendValidRequest();}

    @When("I send valid request and valid token for delete news 1")
    public void sendValidRequest3() {deleteNews.sendValidRequest3();}

    @Given("I set invalid Api Endpoint for delete news")
    public void setInvalidApiEndpoint() {deleteNews.setInvalidApiEndpoint();}

    @When("I send invalid request and valid token for delete news")
    public void sendInvalidRequest() {deleteNews.sendInvalidRequest();}

    @When("I send valid request and invalid token for delete news")
    public void sendValidrequest1() {deleteNews.sendValidRequest1();}

    @When("I send invalid request and invalid token for delete news")
    public void sendValidrequest2() {deleteNews.sendValidRequest2();}
}
