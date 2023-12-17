package starter.utils;

import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import static starter.Url.*;

public class GenerateToken {
    public static String adminToken() {
        JSONObject adminData = Utils.getAdmin();
        JSONObject requestBody = new JSONObject();


        requestBody.put("username", adminData.get("username"));
        requestBody.put("password", adminData.get("password"));

        ResponseBody loginResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(adminLoginUrl)
                .body();

        JSONObject loginResponseBody = new JSONObject(loginResponse.asString());

        return loginResponseBody.getJSONObject("results").optString("token");
    }

    public static String userToken() {
        JSONObject userData = Utils.getUser();
        JSONObject requestBody = new JSONObject();


        requestBody.put("username", userData.get("username"));
        requestBody.put("password", userData.get("password"));

        ResponseBody loginResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(userLoginUrl)
                .body();

        JSONObject loginResponseBody = new JSONObject(loginResponse.asString());

        return loginResponseBody.getJSONObject("results").optString("token");
    }

   public static String tokenAdmin() {
       return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6InFlYWx0YUBnbWFpbC5jb20iLCJleHAiOjE3MDI4NDYzODQsImlkIjoiYXNWVFlzIiwibmFtZSI6IkFuZ2d1biIsInJvbGUiOiJhZG1pbiJ9.XBwqNN-Nm2qV7u8U5TbrV_slU5QDkXTxngNgV9JeKfw";
   }

    public static String tokenUser() {
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6ImluaWFyYUBnbWFpbC5jb20iLCJleHAiOjE3MDI4NDY0MjEsImlkIjoiVlEwZlhUIiwibmFtZSI6ImFyYSIsInJvbGUiOiJ1c2VyIn0.S4pRQ4j4oxUFnH1HLGqg0gC8sSuNi8UnYcOU2e5voac";
    }
}
