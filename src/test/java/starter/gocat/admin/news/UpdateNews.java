package starter.gocat.admin.news;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static starter.utils.GenerateToken.tokenAdmin;

public class UpdateNews {

    private static String url = "http://34.128.69.15:8000/admin/news/aSNT7i";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    String token = tokenAdmin();

    @Step("I set valid API Endpoint for create news")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and set valid json data for update news")
    public void sendValidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("adminId", "kRusVS");
        requestBody.put("title", "Lorem Ipsum Dolor Sit");
        requestBody.put("content", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo.");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setValidApiEndpoint());
    }

    @Step("I send valid token for update news")
    public void sendValidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + token);
    }

    @Step("I successfully update news")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_NEWS_SCHEMA);

        given().then().body(matchesJsonSchema(schema));}


    @Step("I set invalid Api Endpoint for update news")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send valid request and set valid json data for update news 1")
    public void sendValidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("adminId", "kRusVS");
        requestBody.put("title", "Lorem Ipsum Dolor Sit");
        requestBody.put("content", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo.");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setInvalidApiEndpoint());
    }

    @Step("I send invalid request and set valid json data for update news")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("adminId", "kRusVS");
        requestBody.put("title", "Lorem Ipsum Dolor Sit");
        requestBody.put("content", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo.");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setValidApiEndpoint());
    }

    @Step("I send invalid token for update news")
    public void sendInvalidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " );
    }

    @Step("I send valid request and set invalid json data for update news")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setValidApiEndpoint());
    }

    @Step("I send invalid request and set invalid json data for update news")
    public void sendInvalidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setValidApiEndpoint());
    }
}
