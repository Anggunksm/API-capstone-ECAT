package starter.user;

import io.restassured.RestAssured;


import net.serenitybdd.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchemaHelper;
import starter.utils.JsonSchema;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UserRegister {

    private static String url = "http://34.128.69.15:8000/user/register";

    private static String url1 = "http://34.128.69.15:8000/user/invalid";

    @Step("I set valid API endpoint for register")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and set valid json data for register")
    public void sendValidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "LeeMark");
        requestBody.put("email", "Marklee02@gmail.com");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "12345678");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidApiEndpoint());
    }

    @Step("I receive status code 201")
    public void receiveStatusCode201() {restAssuredThat(response -> response.statusCode(201));}

    @Step("I Successfully Sign Up")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.REGISTER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));}

    @Step("I send valid request and set json data with invalid email for register")
    public void sendValidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "LeeMark");
        requestBody.put("email", "Marklee02@.com");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "12345678");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidApiEndpoint());
    }

    @Step("I receive status code 400")
    public void receiveStatusCode400() {restAssuredThat(response -> response.statusCode(400));}

    @Step("I set valid API endpoint for register")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I receive status code 401")
    public void receiveStatusCode401() {restAssuredThat(response -> response.statusCode(401));}

    @Step("I send invalid request and set valid json data for register")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "LeeMark");
        requestBody.put("email", "Marklee02@gmail.com");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "12345678");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .get(setValidApiEndpoint());
    }

    @Step("I send valid request and set json data with invalid name for register")
    public void sendValidRequest2() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "");
        requestBody.put("username", "LeeMark");
        requestBody.put("email", "Marklee02@.com");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "12345678");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidApiEndpoint());
    }

    @Step("I send valid request and set json data with invalid username for register")
    public void sendValidRequest3() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "");
        requestBody.put("email", "Marklee02@gmail.com");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "12345678");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidApiEndpoint());
    }

    @Step("I send valid request and set json data with empty email for register")
    public void sendValidRequest4() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "LeeMark");
        requestBody.put("email", "");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "12345678");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidApiEndpoint());
    }

    @Step("I send valid request and set json data with invalid number phone for register")
    public void sendValidRequest5() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "LeeMark");
        requestBody.put("email", "Marklee02@gmail.com");
        requestBody.put("phone", "");
        requestBody.put("password", "12345678");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidApiEndpoint());
    }

    @Step("I send valid request and set json data with invalid password for register")
    public void sendValidRequest6() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "LeeMark");
        requestBody.put("email", "Marklee02@gmail.com");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidApiEndpoint());
    }

    @Step("I send valid request and set invalid json data for register")
    public void sendValidRequest7() {
        JSONObject requestBody = new JSONObject();


        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidApiEndpoint());
    }

    @Step("I send valid request and set json data with registered email for register")
    public void sendValidRequest8() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "LeeMark");
        requestBody.put("email", "hafidznaufl@gmail.com");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "12345678");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidApiEndpoint());
    }

    @Step("I receive status code 409")
    public void receiveStatusCode409() {restAssuredThat(response -> response.statusCode(409));}


    @Step("I send invalid request and set invalid json data for register")
    public void sendInvalidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Naufal");
        requestBody.put("username", "LeeMark");
        requestBody.put("email", "Marklee02@gmail.com");
        requestBody.put("phone", "081234567890");
        requestBody.put("password", "12345678");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .get(setInvalidApiEndpoint());
    }
}
