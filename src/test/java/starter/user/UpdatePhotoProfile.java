package starter.user;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class UpdatePhotoProfile {

    private static String url = "http://34.128.69.15:8000/user/photo-profile";

    private static String url1= "http://34.128.69.15:8000/invalid";

    private static String Token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6Ik5hSmFlbWluMTJAZ21haWwuY29tIiwiZXhwIjoxNzAyMjI0MjE4LCJpZCI6IlNGWEk3aCIsIm5hbWUiOiJOYW5hIn0.MarzY0GnuQ6VUJmXSVIATwI4YoR_W_38h8PqfObzKqw";

    @Step("I set valid API Endpoint for update photo profile")
    public String setValidAPIEndpoint() {return url;}

    @Step("I send valid request and valid body for update photo profile")
    public void sendValidRequest() {

        File sampleFile = new File("C:\\Users\\User\\Downloads\\download.jpeg");

        SerenityRest.given()
                .contentType(ContentType.MULTIPART)
                .multiPart("file",sampleFile)
                .put(setValidAPIEndpoint());
    }

    @Step("I send valid token for update photo profile")
    public void sendValidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + Token);
    }

    @Step("I successfully updated my profile photo")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_PHOTO_PROFILE_SCHEMA);

        given().then().body(matchesJsonSchema(schema));}

    @Step("I set invalid API endpoint for update photo profile")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send valid request and set valid json data for update photo profile 1")
    public void sendValidRequest1() {
        File sampleFile = new File("C:\\Users\\User\\Downloads\\download.jpeg");

        SerenityRest.given()
                .contentType(ContentType.MULTIPART)
                .multiPart("file",sampleFile)
                .put(setInvalidApiEndpoint());
    }

    @Step("I send invalid request and set valid json data for update photo profile")
    public void sendInvalidRequest() {
        File sampleFile = new File("C:\\Users\\User\\Downloads\\download.jpeg");

        SerenityRest.given()
                .contentType(ContentType.MULTIPART)
                .multiPart("file",sampleFile)
                .delete(setValidAPIEndpoint());
    }

    @Step("I send invalid token for update photo profile")
    public void sendInvalidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " );
    }

    @Step("I send valid request and set invalid json data for update photo profile")
    public void sendValidRequest2() {
        File sampleFile = new File("C:\\Users\\User\\Downloads\\download.jpeg");

        SerenityRest.given()
                .contentType(ContentType.MULTIPART)
                .put(setValidAPIEndpoint());
    }

    @Step("I send invalid request and set invalid json data for update photo profile")
    public void sendInvalidRequest1() {

        File sampleFile = new File("C:\\Users\\User\\Downloads\\download.jpeg");

        SerenityRest.given()
                .contentType(ContentType.MULTIPART)
                .delete(setInvalidApiEndpoint());
    }

}
