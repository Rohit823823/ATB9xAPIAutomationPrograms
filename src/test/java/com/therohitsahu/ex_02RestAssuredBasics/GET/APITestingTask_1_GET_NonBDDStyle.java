package com.therohitsahu.ex_02RestAssuredBasics.GET;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;
public class APITestingTask_1_GET_NonBDDStyle {
    @Test
    public void test_GetWeather_Success() {
        RestAssured.baseURI = "https://api.openweathermap.org";
        RestAssured.basePath = "/data/2.5/weather";

        Response response = RestAssured
                .given()
                .queryParam("q", "London")
                .queryParam("appid", "e22429a096b17272df386c882eaca114") // Replace with your API key
                .when()
                .get();

        ValidatableResponse vr = response.then();
        vr.statusCode(200);
        vr.log().all();
    }

    @Test
    public void test_GetWeather_InvalidAPIKey() {
        RestAssured.baseURI = "https://api.openweathermap.org";
        RestAssured.basePath = "/data/2.5/weather";

        Response response = RestAssured
                .given()
                .queryParam("q", "London")
                .queryParam("appid", "invalid_api_key")
                .when()
                .get();

        ValidatableResponse vr = response.then();
        vr.statusCode(401);
        vr.log().all();
    }

    @Test
    public void test_GetWeather_MissingParams() {
        RestAssured.baseURI = "https://api.openweathermap.org";
        RestAssured.basePath = "/data/2.5/weather";

        Response response = RestAssured
                .given()
                .when()
                .get();

        ValidatableResponse vr = response.then();
        vr.statusCode(400);
        vr.log().all();
    }
}

