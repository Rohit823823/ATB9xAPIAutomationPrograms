package com.therohitsahu.ex_01sampleCheck;
import io.restassured.RestAssured;
public class APITesting002 {
    public static void main(String[] args) {
// Gherkin Syntax
        //Given()--> Pre Requisites --> Body,URL,Headers,Auth .....
        //When() --> HTTP method --> GET/POST/PUT/PATCH/DELETE
        //Then() --> Validation --> 200 OK, first name == ROHIT
// Full URL --> https://zippopotam.us/IN/760001
        // BASE URI --> https://zippopotam.us
        // Path uri --> /IN/760001

        RestAssured
                .given()
                .baseUri("https://zippopotam.us")
                .basePath("/IN/760001")
                .when()
                .get()
                .then().log().all().statusCode(200); // Expected status code <404> but was <200>.

    }
}
