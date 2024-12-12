package com.therohitsahu.ex_02RestAssuredBasics.GET;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class APITestingTask_1_GET_BDDStyle {

    @Test
    public void test_GetWeather_Success() {
        given()
                .baseUri("https://api.openweathermap.org")
                .basePath("/data/2.5/weather")
                .queryParam("q", "London")
                .queryParam("appid", "e22429a096b17272df386c882eaca114") // Replace with your API key
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("name", equalTo("London"))
                .log().all();
    }

    @Test
    public void test_GetWeather_InvalidAPIKey() {
        given()
                .baseUri("https://api.openweathermap.org")
                .basePath("/data/2.5/weather")
                .queryParam("q", "London")
                .queryParam("appid", "invalid_api_key")
                .when()
                .get()
                .then()
                .statusCode(401)
                .body("message", equalTo("Invalid API key"))
                .log().all();
    }

    @Test
    public void test_GetWeather_MissingParams() {
        given()
                .baseUri("https://api.openweathermap.org")
                .basePath("/data/2.5/weather")
                .when()
                .get()
                .then()
                .statusCode(400)
                .body("message", equalTo("Nothing to geocode"))
                .log().all();
    }

}
