package starter.gocat.user.auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static starter.utils.GenerateToken.tokenUser;

public class DeleteUser {

    private static String url = "http://34.128.69.15:8000/user/b5zevG";

    private static String url1 = "http://34.128.69.15:8000/invalid";

    String token = tokenUser();

    @Step("I set valid Api Endpoint for delete user")
    public String setValidApiEndpoint() {return url;}

    @Step("I send valid request and valid token for delete user")
    public void sendValidRequest() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .delete(setValidApiEndpoint());
    }

    @Step("I send valid request and valid token for delete user 1")
    public void sendValidRequest3() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .delete(setInvalidApiEndpoint());
    }

    @Step("I set valid Api Endpoint for delete user")
    public String setInvalidApiEndpoint() {return url1;}

    @Step("I send invalid request and valid token for delete user")
    public void sendInvalidRequest() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .put(setValidApiEndpoint());
    }

    @Step("I send valid request and invalid token for delete user")
    public void sendValidRequest1() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .delete(setValidApiEndpoint());
    }

    @Step("I send invalid request and invalid token for delete user")
    public void sendValidRequest2() {

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer ")
                .get(setInvalidApiEndpoint());
    }
}
