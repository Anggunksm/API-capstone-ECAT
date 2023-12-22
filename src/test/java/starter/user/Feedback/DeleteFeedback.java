package starter.user.Feedback;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import starter.utils.Token;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class DeleteFeedback {

    private static String url = "http://34.128.69.15:8000/user/news/feedback/SxWjHj";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    String token = Token.token();

    @Step("I set valid Api Endpoint for delete feedback")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and valid token for delete feedback")
    public void sendValidRequest() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .delete(setValidApiEndpoint());
    }

    @Step("I send valid request and valid token for a user delete feedback 1")
    public void sendValidRequest3() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .delete(setInvalidApiEndpoint());
    }


    @Step("I set invalid Api Endpoint for delete feedback")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send invalid request and valid token for delete feedback")
    public void sendInvalidRequest() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .post(setValidApiEndpoint());
    }

    @Step("I send valid request and invalid token for delete like")
    public void sendValidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .delete(setValidApiEndpoint());
    }

    @Step("I send invalid request and invalid token for delete feedback")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .get(setInvalidApiEndpoint());
    }

}
