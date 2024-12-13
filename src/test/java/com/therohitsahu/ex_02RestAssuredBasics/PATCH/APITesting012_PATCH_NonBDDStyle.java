package com.therohitsahu.ex_02RestAssuredBasics.PATCH;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
public class APITesting012_PATCH_NonBDDStyle {
    // PUT

    // token, booking id - A

//    public void get_token(){ }
//    public void get_booking_id(){}


    @Description("Verify the Patch Request for the Restful Booker APIs")
    @Test
    public void test_patch_non_bdd(){

        String token = "9f0e25f226eda54";
        String bookingid = "1750";

        String payloadPatch= "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";


        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);

        requestSpecification.body(payloadPatch).log().all();

        Response response = requestSpecification.when().patch();

        ValidatableResponse validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);


    }

}
