package org.aston.exercise;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest
{
    @Test
    public void whenCreatePerson_thenStatus201() {
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .when()
                .get("api/users?page=2")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
