package starter.user;

import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class ResponseBody {


    @Step("I receive status code {Int}")
    public void receiveStatusCode(int expectedStatusCode) {
        restAssuredThat(response -> response.statusCode(expectedStatusCode));
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
