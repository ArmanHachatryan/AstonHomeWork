package org.aston.exercise;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoRequestTest extends BaseTest
{
    @Test
    public void checkGetRequest() {
        baseSpec
                .when().get("/get")
                .then()
                .spec(statusCodeSpec);
    }

    @Test
    public void checkPostFormData() {
        baseSpec
                .contentType("application/json").body(mike)
                .when().post("/post")
                .then()
                .body("json.name", equalTo(mike.getName()))
                .body("json.job", equalTo(mike.getJob()))
                .spec(statusCodeSpec);
    }

    @Test
    public void checkPutRequest() {
        baseSpec
                .contentType("application/json").body(alex.toJson())
                .when().put("/put")
                .then()
                .body("json.name", equalTo(alex.getName()))
                .body("json.job", equalTo(alex.getJob()))
                .spec(statusCodeSpec);
    }

    @Test
    public void checkPatchRequest() {
        baseSpec
                .contentType("application/json").body(alex.toJson())
                .when().patch("/patch")
                .then()
                .body("json.name", equalTo(alex.getName()))
                .body("json.job", equalTo(alex.getJob()))
                .spec(statusCodeSpec);
    }

    @Test
    public void checkDeleteRequest()  {
        baseSpec
                .contentType("application/json").body(alex.toJson())
                .when().delete("/delete")
                .then()
                .body("json.name", equalTo(alex.getName()))
                .body("json.job", equalTo(alex.getJob()))
                .spec(statusCodeSpec);
    }
}
