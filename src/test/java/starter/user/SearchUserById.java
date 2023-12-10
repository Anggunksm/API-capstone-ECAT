package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class SearchUserById {

    private static String url = "http://34.128.69.15:8000/user/search?id=e571kV";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    private static String token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6Ik5hbWpvb24xMkBnbWFpbC5jb20iLCJleHAiOjE3MDEyNDQwNjIsImlkIjoiZTU3MWtWIiwibmFtZSI6Ik5hdWZhbCJ9.pv9jkL1d1qsBYa3JmTrF5su4Z4Eiic7eRVCcjpu2AwM";

    @Step("I set valid Api Endpoint for Search User By Id")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and valid token for Search User By Id")
    public void sendValidRequest() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(setValidApiEndpoint());
    }

    @Step("I send valid request and valid token for Search User By Id 1")
    public void sendValidRequest3() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(setInvalidApiEndpoint());
    }

    @Step("I can find user that i want")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.SEARCH_USER_BY_ID);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));}

    @Step("I set invalid Api Endpoint for Search User By Id")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send invalid request and valid token for Search User By Id")
    public void sendInvalidRequest() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .post(setValidApiEndpoint());
    }

    @Step("I send valid request and invalid token for Search User By Id")
    public void sendValidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .get(setValidApiEndpoint());
    }

    @Step("I send invalid request and invalid token for Search User By Id")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .put(setInvalidApiEndpoint());
    }
}

