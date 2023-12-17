package starter.gocat.admin.dashboard;

import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static starter.Url.adminSolvedStatUrl;
import static starter.Url.invUrl;
import static starter.utils.GenerateToken.tokenAdmin;

public class GetSolvedStatistic {
    private static final RequestSpecification requestSpec;

    static {
        requestSpec = SerenityRest.given()
                .header("Authorization", "Bearer " + tokenAdmin())
                .header("Content-Type", "application/json");
    }

    @Step("I set {String} endpoint for get solved statistic")
    public String setEndpointTypeGetSolvedStatistic(String endpointType) {
        String endpoint = null;
        switch (endpointType) {
            case "valid":
                endpoint = adminSolvedStatUrl;
                break;
            case "invalid":
                endpoint = invUrl;
                break;
            default:
                Assert.fail("Unsupported base type: " + endpointType);
        }
        return endpoint;
    }

    @Step("I send get request to {String} get solved statistic endpoint")
    public void sendGetBaseTypeGetSolvedStatEndpoint(String baseType) {
        switch (baseType) {
            case "valid":
                requestSpec
                        .get(setEndpointTypeGetSolvedStatistic("valid"));
                break;
            case "invalid":
                requestSpec
                        .get(setEndpointTypeGetSolvedStatistic("invalid"));
                break;
            default:
                Assert.fail("Unsupported base type: " + baseType);
        }
    }

    @Step("I send get request to valid get solved stat endpoint without token")
    public void getSolvedStatWithoutToken() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .get(setEndpointTypeGetSolvedStatistic("valid"));
    }

    @Step("I receive the solved statistic")
    public void receiveSolvedStat() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.SUCCESS_GET_SOLVED_STAT_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}

