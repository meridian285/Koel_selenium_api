package oi.koel.api.steps;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class UserSteps {
    RestClient restClient = new RestClient();

    public ValidatableResponse registration(){
        return given()
                .spec(restClient.getDefaultRequestSpec())
                .post("")
                .then();

    }
}
