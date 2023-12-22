package starter.user.Feedback;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import starter.utils.Token;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class UserUpdateFeedback {

    private static String url = "http://34.128.69.15:8000/user/news/feedback/jgvbOp";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    String token = Token.token();

    @Step("I set valid API endpoint for a user update feedback")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and set valid json data for a user update feedback")
    public void sendValidRequest() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setValidApiEndpoint());
    }

    @Step("I send valid token for a user update feedback")
    public void sendValidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + token);
    }

    @Step("User Successfully update feedback")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_FEEDBACK_SCHEMA);

        given().then().body(matchesJsonSchema(schema));}


    @Step("I set invalid API endpoint for a user update feedback")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send valid request and set valid json data for a user update feedback 1")
    public void sendValidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setInvalidApiEndpoint());
    }

    @Step("I send invalid request and set valid json data for a user update feedback")
    public void sendInvalidRequest() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setValidApiEndpoint());
    }

    @Step("I send invalid token for a user update feedback")
    public void sendInvalidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " );
    }

    @Step("I send valid request and set invalid json data for a user update feedback")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .put(setValidApiEndpoint());
    }

    @Step("I send invalid request and set invalid json data for a user update feedback")
    public void sendInvalidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .delete(setInvalidApiEndpoint());
    }
}
