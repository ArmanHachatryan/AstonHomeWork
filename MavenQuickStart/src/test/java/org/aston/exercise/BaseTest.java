package org.aston.exercise;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BaseTest {
    Person mike = new Person("Mike", "QA manual");
    Person alex = new Person("Alex", "Manager");

    RequestSpecification baseSpec = given()
            .log().body()
            .baseUri("https://postman-echo.com");

    ResponseSpecification statusCodeSpec = expect()
            .statusCode(200);

    ResponseSpecification mikeResponseSpec = expect()
            .body("json.name", equalTo(mike.getName()))
            .body("json.job", equalTo(mike.getJob()));
}
