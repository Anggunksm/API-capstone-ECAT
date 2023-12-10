package starter.user.News;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllNews {
    private static String url = "http://34.128.69.15:8000/users/news";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    private static String token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6Ik5hbWpvb24xMkBnbWFpbC5jb20iLCJleHAiOjE3MDE4OTE4NjcsImlkIjoibGJ3dWhLIiwibmFtZSI6Ik5hdWZhbCJ9.yh0w2F1MBV5ldVTMceGWhT9hRoyYLdYtB05jrbM2imA";
    @Step("I set valid Api Endpoint for get all news")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and valid token for get all news")
    public void sendValidRequest() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(setValidApiEndpoint());
    }

    @Step("I send valid request and valid token for get all news 1")
    public void sendValidRequest3() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(setInvalidApiEndpoint());
    }

    @Step("I can get all news")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_NEWS_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));}

    @Step("I set invalid Api Endpoint for get all news")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send invalid request and valid token for get all news")
    public void sendInvalidRequest() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .put(setValidApiEndpoint());
    }

    @Step("I send valid request and invalid token for get all news")
    public void sendValidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .get(setValidApiEndpoint());
    }

    @Step("I send invalid request and invalid token for get all news")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .put(setInvalidApiEndpoint());
    }
}

