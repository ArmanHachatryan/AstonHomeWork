package org.aston.exercise;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.aston.exercise.Constants.StatusCode.SUCCESS;
import static org.hamcrest.Matchers.equalTo;

public class EchoRequestTest extends BaseTest
{
    Person mike = new Person("Mike", "QA manual");
    Person alex = new Person("Alex", "Manager");

    RequestSpecification baseSpec = given()
            .log().body()
            .baseUri("https://postman-echo.com");

    @Test
    public void checkGetRequest() {
        baseSpec
                .when().get("/get")
                .then()
                .statusCode(SUCCESS);
    }

    @Test
    public void checkPostFormData() {
        baseSpec
                .contentType("application/json").body(mike)
                .when().post("/post")
                .then()
                .body("json.name", equalTo(mike.getName()))
                .body("json.job", equalTo(mike.getJob()))
                .statusCode(SUCCESS);
    }

    @Test
    public void checkPutRequest() {
        baseSpec
                .contentType("application/json").body(alex.toJson())
                .when().put("/put")
                .then()
                .body("json.name", equalTo(alex.getName()))
                .body("json.job", equalTo(alex.getJob()))
                .statusCode(SUCCESS);
    }

    @Test
    public void checkPatchRequest() {
        baseSpec
                .contentType("application/json").body(alex.toJson())
                .when().patch("/patch")
                .then()
                .body("json.name", equalTo(alex.getName()))
                .body("json.job", equalTo(alex.getJob()))
                .statusCode(SUCCESS);
    }

    @Test
    public void checkDeleteRequest()  {
        baseSpec
                .contentType("application/json").body(alex.toJson())
                .when().delete("/delete")
                .then()
                .body("json.name", equalTo(alex.getName()))
                .body("json.job", equalTo(alex.getJob()))
                .statusCode(SUCCESS);
    }
}
