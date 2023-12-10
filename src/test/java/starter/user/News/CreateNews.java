package starter.user.News;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class CreateNews {

    private static String url = "http://34.128.69.15:8000/admin/news";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    private static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6Ikplbm8xMkBnbWFpbC5jb20iLCJleHAiOjE3MDIwNTE0MzMsImlkIjoia1J1c1ZTIiwibmFtZSI6IlphcmEifQ.8bsjfNykTyfyeWdW7KAgOD5LB3GSqMGs1d06ucrq7J4";

    @Step("I set valid API Endpoint for create news")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and set valid json data for create news")
    public void sendValidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("adminId", "kRusVS");
        requestBody.put("title", "Lorem Ipsum Dolor Sit");
        requestBody.put("content", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo.");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .post(setValidApiEndpoint());
    }

    @Step("I send valid token for create news")
    public void sendValidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + token);
    }

    @Step("I successfully create news")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_NEWS_SCHEMA);

        given().then().body(matchesJsonSchema(schema));}


    @Step("I set invalid Api Endpoint for create news")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send valid request and set valid json data for create news 1")
    public void sendValidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("adminId", "kRusVS");
        requestBody.put("title", "Lorem Ipsum Dolor Sit");
        requestBody.put("content", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo.");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .post(setInvalidApiEndpoint());
    }

    @Step("I send invalid request and set valid json data for create news")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("adminId", "kRusVS");
        requestBody.put("title", "Lorem Ipsum Dolor Sit");
        requestBody.put("content", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo.");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setValidApiEndpoint());
    }

    @Step("I send invalid token for create news")
    public void sendInvalidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " );
    }

    @Step("I send valid request and set invalid json data for create news")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .post(setValidApiEndpoint());
    }

    @Step("I send invalid request and set invalid json data for create news")
    public void sendInvalidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setValidApiEndpoint());
    }
}
