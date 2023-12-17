package starter.response;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ResponseBody {


    @Step("I receive status code 201")
    public void receiveStatusCode201() {
        SerenityRest.restAssuredThat(response -> response.statusCode(201));
        Response lastResponse = SerenityRest.lastResponse();

        // Menampilkan informasi respons
        System.out.println("Response Body: " + lastResponse.body().asString());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        SerenityRest.restAssuredThat(response -> response.statusCode(200));
        Response lastResponse = SerenityRest.lastResponse();

        // Menampilkan informasi respons
        System.out.println("Response Body: " + lastResponse.body().asString());
    }

    @Step("I receive status code 400")
    public void receiveStatusCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I receive status code 401")
    public void receiveStatusCode401() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I receive status code 404")
    public void receiveStatusCode404() {
        SerenityRest.restAssuredThat(response -> response.statusCode(404));
        Response lastResponse = SerenityRest.lastResponse();

        // Menampilkan informasi respons
        System.out.println("Response Body: " + lastResponse.body().asString());
    }

    @Step("I receive status code 409")
    public void receiveStatusCode409() {
        restAssuredThat(response-> response.statusCode(409));
    }

    @Step("I receive status code 500")
    public void receiveStatusCode500() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I receive error message")
    public void receiveErrorMessage() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ERROR_MESSAGE_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I receive auth error message")
    public void receiveAuthErrorMessage() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.AUTH_ERROR_MESSAGE_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }



}
