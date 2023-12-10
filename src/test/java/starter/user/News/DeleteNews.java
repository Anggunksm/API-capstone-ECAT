package starter.user.News;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteNews {

    private static String url = "http://34.128.69.15:8000/admin/news/XCmZOP";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    private static String token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6Ikplbm8xMkBnbWFpbC5jb20iLCJleHAiOjE3MDIyMzA4MTUsImlkIjoia1J1c1ZTIiwibmFtZSI6IlphcmEifQ.f6T-lzjUcKcDRj0rUw_FKwyMprnGXplmxlCLbaqo5Wg";

    @Step("I set valid Api Endpoint for delete news")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and valid token for delete news")
    public void sendValidRequest() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .delete(setValidApiEndpoint());
    }

    @Step("I send valid request and valid token for delete news 1")
    public void sendValidRequest3() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .delete(setInvalidApiEndpoint());
    }

    @Step("I set valid Api Endpoint for delete news")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send invalid request and valid token for delete news")
    public void sendInvalidRequest() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .put(setValidApiEndpoint());
    }

    @Step("I send valid request and invalid token for delete news")
    public void sendValidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .delete(setValidApiEndpoint());
    }

    @Step("I send invalid request and invalid token for delete news")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .get(setInvalidApiEndpoint());
    }
}
