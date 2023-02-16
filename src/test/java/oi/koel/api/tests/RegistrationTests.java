package oi.koel.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import oi.koel.dataGenerator.DataGenerator;
import org.junit.Assert;
import org.junit.Test;
import readProperties.ConfigProvider;

import static io.restassured.RestAssured.given;

public class RegistrationTests {
    DataGenerator datGen = new DataGenerator();
    @Test
    public void checkRegistration(){
        RestAssured.baseURI = ConfigProvider.URL;
        ValidatableResponse response =
                given()
                    .header("Content-type", "application/json")
                    .log().all()
                    .body(datGen.dataGenerator())
                    .post("api/me")
                    .then().statusCode(200);
    }
}
