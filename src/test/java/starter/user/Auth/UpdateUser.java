package starter.user.Auth;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import starter.utils.Token;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class UpdateUser {

    private static String url = "http://34.128.69.15:8000/user/bzf2A5";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    String token = Token.token();

    @Step("I set valid API endpoint for update user")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and set valid json data for update user")
    public void sendValidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "Atuy");
        requestBody.put("email", "Tik.9d.umi.33@gmail.com");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "12345678");


        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setValidApiEndpoint());
    }

    @Step("I send valid token for update user")
    public void sendValidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + token);
    }

    @Step("I Successfully update user")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_USER_SCHEMA);

        given().then().body(matchesJsonSchema(schema));}


    @Step("I set invalid API endpoint for update user")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send valid request and set valid json data for update user 1")
    public void sendValidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "Atuy");
        requestBody.put("email", "Tik.9d.umi.33@gmail.com");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "12345678");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setInvalidApiEndpoint());
    }

    @Step("I send invalid request and set valid json data for update user")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "Atuy");
        requestBody.put("email", "Tik.9d.umi.33@gmail.com");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "12345678");


        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setValidApiEndpoint());
    }

    @Step("I send invalid token for update user")
    public void sendInvalidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " );
    }

    @Step("I send valid request and set invalid json data for update user")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setValidApiEndpoint());
    }

    @Step("I send invalid request and set invalid json data for update user")
    public void sendInvalidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setInvalidApiEndpoint());
    }
}
