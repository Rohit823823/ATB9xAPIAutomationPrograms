package com.therohitsahu.ex_02RestAssuredBasics.GET;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting007_GET_BDDStyle {

    @Test
    public void getTest_GET_Req_POSITIVE() {
        String pincode = "760001";
        RestAssured
                .given()
                .baseUri("https://zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);

    }

    @Test
    public void getTest_GET_Req_NEGATIVE() {
        String pincode = "-1";
        RestAssured
                .given()
                .baseUri("https://zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);

    }
}
