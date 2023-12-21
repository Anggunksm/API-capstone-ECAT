package starter.gocat.user.auth;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static starter.utils.GenerateToken.tokenUser;

public class UpdatePhotoProfile {

    private static String url = "http://34.128.69.15:8000/user/photo-profile";

    private static String url1= "http://34.128.69.15:8000/invalid";

    String token = tokenUser();

    @Step("I set valid API Endpoint for update photo profile")
    public String setValidAPIEndpoint() {return url;}

    @Step("I send valid request and valid body for update photo profile")
    public void sendValidRequest() {

        File sampleFile = new File("src/test/resources/attachment/polusi-udara.jpeg");

        RestAssured.config = RestAssuredConfig.config().encoderConfig(EncoderConfig.encoderConfig()
                .encodeContentTypeAs("multipart/form-data", ContentType.TEXT)
                .encodeContentTypeAs("application/x-www-form-urlencoded", ContentType.TEXT));

        SerenityRest.given()
                .contentType(ContentType.MULTIPART)
                .multiPart("file",sampleFile)
                .put(setValidAPIEndpoint());
    }

    @Step("I send valid token for update photo profile")
    public void sendValidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + token);
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
        File sampleFile = new File("src/test/resources/attachment/polusi-udara.jpeg");

        RestAssured.config = RestAssuredConfig.config().encoderConfig(EncoderConfig.encoderConfig()
                .encodeContentTypeAs("multipart/form-data", ContentType.TEXT)
                .encodeContentTypeAs("application/x-www-form-urlencoded", ContentType.TEXT));

        SerenityRest.given()
                .contentType(ContentType.MULTIPART)
                .multiPart("file",sampleFile)
                .put(setInvalidApiEndpoint());
    }

    @Step("I send invalid request and set valid json data for update photo profile")
    public void sendInvalidRequest() {
        File sampleFile = new File("src/test/resources/attachment/polusi-udara.jpeg");

        RestAssured.config = RestAssuredConfig.config().encoderConfig(EncoderConfig.encoderConfig()
                .encodeContentTypeAs("multipart/form-data", ContentType.TEXT)
                .encodeContentTypeAs("application/x-www-form-urlencoded", ContentType.TEXT));

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
