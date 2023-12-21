package starter.gocat.user.auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class Login {

    private static String url = "http://34.128.69.15:8000/user/login";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    @Step("I set valid Api Endpoint for login")
    public String setValidAPIEndpoint() {return url;}

    @Step("I send valid request and send valid json data for login")
    public void sendValidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", "Atuy");
        requestBody.put("password", "12345678");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidAPIEndpoint());
    }

    @Step("I successfully sign in")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.SUCCESS_LOGIN_RESPONSE_SCHEMA);

        given().then().body(matchesJsonSchema(schema));}

    @Step("I set invalid Api Endpoint for login")
    public String setInvalidAPIEndpoint() {return url1;}

    @Step("I send valid request and send valid json data for login 1")
    public void sendValidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", "Atuy");
        requestBody.put("password", "12345678");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setInvalidAPIEndpoint());
    }

    @Step("I send invalid request and send valid json data for login")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", "Atuy");
        requestBody.put("password", "12345678");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setValidAPIEndpoint());
    }

    @Step("I send valid request and send invalid username at json data for login")
    public void sendValidRequest2() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", "");
        requestBody.put("password", "12345678");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidAPIEndpoint());
    }

    @Step("I send valid request and send invalid password at json data for login")
    public void sendValidRequest3() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", "Atuy");
        requestBody.put("password", "");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidAPIEndpoint());
    }

    @Step("I send valid request and send invalid json data for login")
    public void sendValidRequest4() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidAPIEndpoint());
    }

    @Step("I send invalid request and send invalid json data for login")
    public void sendInvalidRequest1() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .delete(setInvalidAPIEndpoint());
    }

}
