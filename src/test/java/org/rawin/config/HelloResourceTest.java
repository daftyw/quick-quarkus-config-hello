package org.rawin.config;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HelloResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
            .when()
                .get("/hello")
            .then()
                .statusCode(200)
                .body(is("Hello, Rawin! Are you 50 years old?"));
    }
    
    @Test
    public void testHello2EndPoint() {
        given()
                .when().get("/hello2")
                .then()
                .statusCode(200)
                .body(is("hello2:Rawin"));
    }
}