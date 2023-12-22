package starter.user.Comment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import starter.utils.Token;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class CreateComment {

    private static String url = "http://34.128.69.15:8000/user/comment";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    String token = Token.token();

    @Step("I set valid API Endpoint for user create comment")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and set valid json data for user create comment")
    public void sendValidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("complaintId", "wVLkb3");
        requestBody.put("role", "admin");
        requestBody.put("message", "ini admin");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .post(setValidApiEndpoint());
    }

    @Step("I send valid token for user create comment")
    public void sendValidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + token);
    }

    @Step("User successfully create comment")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADMIN_CREATE_COMMENT_SCHEMA);

        given().then().body(matchesJsonSchema(schema));}


    @Step("I set invalid Api Endpoint for user create comment")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send valid request and set valid json data for user create comment 1")
    public void sendValidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("complaintId", "wVLkb3");
        requestBody.put("role", "admin");
        requestBody.put("message", "ini admin");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .post(setInvalidApiEndpoint());
    }

    @Step("I send invalid request and set valid json data for user create comment")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("complaintId", "wVLkb3");
        requestBody.put("role", "admin");
        requestBody.put("message", "ini admin");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setValidApiEndpoint());
    }

    @Step("I send invalid token for user create comment")
    public void sendInvalidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " );
    }

    @Step("I send valid request and set invalid json data for user create comment")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .post(setValidApiEndpoint());
    }

    @Step("I send invalid request and set invalid json data for user create comment")
    public void sendInvalidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setValidApiEndpoint());
    }

}
