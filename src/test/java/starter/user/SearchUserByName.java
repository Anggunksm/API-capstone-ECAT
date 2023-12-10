package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class SearchUserByName {

    private static String url = "http://34.128.69.15:8000/user/search?name=Naufal";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    private static String token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6ImhhZWNoYW4xMjNAZ21haWwuY29tIiwiZXhwIjoxNzAxMjQzOTIwLCJpZCI6InBjOVRWciIsIm5hbWUiOiJOYXVmYWwifQ.lNiVrXAC3-L75zXnqBcRQSWs7d-r-2K1Ho36G6Moi_Q";

    @Step("I set valid Api Endpoint for Search User By Name")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and valid token for Search User By Name")
    public void sendValidRequest() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(setValidApiEndpoint());
    }

    @Step("I send valid request and valid token for Search User By Name 1")
    public void sendValidRequest3() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(setInvalidApiEndpoint());
    }

    @Step("I set invalid Api Endpoint for Search User By Name")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send invalid request and valid token for Search User By Name")
    public void sendInvalidRequest() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .post(setValidApiEndpoint());
    }

    @Step("I send valid request and invalid token for Search User By Name")
    public void sendValidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .get(setValidApiEndpoint());
    }

    @Step("I send invalid request and invalid token for Search User By Name")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .put(setInvalidApiEndpoint());
    }
}
