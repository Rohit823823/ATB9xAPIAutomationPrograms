package com.therohitsahu.ex_02RestAssuredBasics.GET;
import io.restassured.RestAssured;
public class APITesting006_GET_BDDStyle {
    // Base URL
    public static void main(String[] args) {

       String pincode = "760001";
        RestAssured.given()
                .baseUri("https://zippopotam.us")
                .basePath("/IN/" +pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);

        pincode = "-1";
        RestAssured.given()
                .baseUri("https://zippopotam.us")
                .basePath("/IN/" +pincode)
                .when().log().all().get()
                .then().log().all().statusCode(404);




    }
}
