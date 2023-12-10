package starter.user;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ResetPassword {

    private static String url = "http://34.128.69.15:8000/user/reset-password";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    private static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6ImhhZWNoYW4xMjNAZ21haWwuY29tIiwiZXhwIjoxNzAxMjQzOTIwLCJpZCI6InBjOVRWciIsIm5hbWUiOiJOYXVmYWwifQ.lNiVrXAC3-L75zXnqBcRQSWs7d-r-2K1Ho36G6Moi_QeyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6ImhhZWNoYW4xMjNAZ21haWwuY29tIiwiZXhwIjoxNzAxMjQzOTIwLCJpZCI6InBjOVRWciIsIm5hbWUiOiJOYXVmYWwifQ.lNiVrXAC3-L75zXnqBcRQSWs7d-r-2K1Ho36G6Moi_Q";

    Faker faker = new Faker();
    String password = faker.internet().password(12, 16, true, true, true);

    @Step("I set valid API endpoint for reset password")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and set valid json data for reset password")
    public void sendValidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("newPassword", password);
        requestBody.put("confirmNewPassword", password);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setValidApiEndpoint());
    }

    @Step("I send valid token for reset password")
    public void sendValidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + token);
    }

    @Step("I Successfully change password")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.RESET_PASSWORD_SCHEMA);

        given().then().body(matchesJsonSchema(schema));}


    @Step("I set invalid API endpoint for reset password")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send valid request and set valid json data for reset password 1")
    public void sendValidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("newPassword", password);
        requestBody.put("confirmNewPassword", password);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setInvalidApiEndpoint());
    }

    @Step("I send invalid request and set valid json data for reset password")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("newPassword", password);
        requestBody.put("confirmNewPassword", password);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .get(setValidApiEndpoint());
    }

    @Step("I send invalid token for reset password")
    public void sendInvalidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " );
    }

    @Step("I send valid request and set invalid json data for reset password")
    public void sendValidRequest2() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setValidApiEndpoint());
    }

    @Step("I send invalid request and set invalid json data for reset password")
    public void sendInvalidRequest1() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .get(setInvalidApiEndpoint());
    }

    @Step("I receive code {Int}")
    public void receiveStatusCode(int expectedStatusCode) {
        given().then().statusCode(expectedStatusCode);
    }

    @Step("I receive auth error message1")
    public void receiveAuthErrorMessage() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.AUTH_ERROR_MESSAGE_RESPONSE_SCHEMA);

        given().then().body(matchesJsonSchema(schema));}

}