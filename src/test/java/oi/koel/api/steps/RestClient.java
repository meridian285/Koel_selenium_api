package oi.koel.api.steps;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import oi.koel.api.config.Config;

import static oi.koel.api.config.Config.getBaseUri;

public class RestClient {
    public RequestSpecification getDefaultRequestSpec(){
            return new RequestSpecBuilder()
                    .setBaseUri(getBaseUri())
                    .setContentType(ContentType.JSON)
                    .build();
    }
}
