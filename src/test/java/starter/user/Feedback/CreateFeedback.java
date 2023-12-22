package starter.user.Feedback;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import starter.utils.Token;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class CreateFeedback {

    private static String url = "http://34.128.69.15:8000/admin/news/feedback";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    String token = Token.token1();

    @Step("I set valid API Endpoint for admin create feedback")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and set valid json data for admin create feedback")
    public void sendValidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("newsId", "RNMRCC");
        requestBody.put("Content", "ini content feedback dari admin");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .post(setValidApiEndpoint());
    }

    @Step("I send valid token for admin create feedback")
    public void sendValidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + token);
    }

    @Step("I successfully create feedback")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADMIN_CREATE_COMMENT_SCHEMA);

        given().then().body(matchesJsonSchema(schema));}


    @Step("I set invalid Api Endpoint for admin create feedback")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send valid request and set valid json data for admin create feedback 1")
    public void sendValidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("newsId", "RNMRCC");
        requestBody.put("Content", "ini content feedback dari admin");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .post(setInvalidApiEndpoint());
    }

    @Step("I send invalid request and set valid json data for create feedback")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("newsId", "RNMRCC");
        requestBody.put("Content", "ini content feedback dari admin");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setValidApiEndpoint());
    }

    @Step("I send invalid token for admin create feedback")
    public void sendInvalidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " );
    }

    @Step("I send valid request and set invalid json data for admin create feedback")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .post(setValidApiEndpoint());
    }

    @Step("I send invalid request and set invalid json data for admin create feedback")
    public void sendInvalidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setValidApiEndpoint());
    }
}
