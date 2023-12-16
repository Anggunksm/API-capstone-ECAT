package starter.user.News;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import starter.utils.Token;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UserSearchNews {

    private static String url = "http://34.128.69.15:8000/users/news/search?id=p4Ms7Y";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    String token = Token.token();

    @Step("I set valid Api Endpoint for user search news")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and valid token for user search news")
    public void sendValidRequest() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(setValidApiEndpoint());
    }

    @Step("I send valid request and valid token for user search news 1")
    public void sendValidRequest3() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(setInvalidApiEndpoint());
    }

    @Step("User can search news")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.SEARCH_NEWS_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));}

    @Step("I set invalid Api Endpoint for user search news")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send invalid request and valid token for user search news")
    public void sendInvalidRequest() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .delete(setValidApiEndpoint());
    }

    @Step("I send valid request and invalid token for user search news")
    public void sendValidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .get(setValidApiEndpoint());
    }

    @Step("I send invalid request and invalid token for user search news")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .put(setInvalidApiEndpoint());
    }
}
