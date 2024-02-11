package org.aston.exercise;

import com.fasterxml.jackson.databind.ObjectWriter;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.StringWriter;

public class AppTest
{
    @Test
    @Disabled
    public void checkGetRequest() {
        RestAssured.given()
                .baseUri("https://postman-echo.com")
                .when().get("/get")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void checkPostFormData() throws JsonProcessingException {
        Person person = new Person("Mike", "Engineer");
        ObjectWriter writer = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = writer.writeValueAsString(person);

        RestAssured.given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json").body(json)
                .when().post("/post")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200);
    }

    @Test
    @Disabled
    public void checkPutRequest() throws JsonProcessingException {
        Person person = new Person( "Mike", "Middle engineer");
        ObjectMapper writer = new ObjectMapper();
        String json = writer.writeValueAsString(person);

        RestAssured.given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json").body(json)
                .when().put("/put")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200);
    }

    @Test
    @Disabled
    public void checkPatchRequest() throws JsonProcessingException {
        Person person = new Person( "Mike", "Middle engineer");
        ObjectMapper writer = new ObjectMapper();
        String json = writer.writeValueAsString(person);

        RestAssured.given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json").body(json)
                .when().patch("/patch")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200);
    }

    @Test
    @Disabled
    public void checkDeleteRequest() throws JsonProcessingException {
        Person person = new Person( "Mike", "Middle engineer");
        ObjectMapper writer = new ObjectMapper();
        String json = writer.writeValueAsString(person);

        RestAssured.given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json").body(json)
                .when().delete("/delete")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200);
    }
}
