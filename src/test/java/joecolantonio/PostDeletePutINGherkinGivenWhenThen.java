package joecolantonio;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Calendar;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class PostDeletePutINGherkinGivenWhenThen {

    @Test
    public void getAllTest(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI = "http://localhost:3000/posts";

//        given()
//                .queryParam("ID",1)
        when()
                .get()
                .then()
                .time(lessThanOrEqualTo(600L))
                .log().all();
    }

    @Test
    public void getTest(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI = "http://localhost:3000/posts";

//        given()
//                .queryParam("ID",1)
        when()
                .get("1")
        .then()
                .body("title", equalTo("json-server"))
                .log().all();
    }


    @Test
    public void postTest()
    {
        long ts = System.currentTimeMillis();

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI = "http://localhost:3000/posts";

        JSONObject jsonX = new JSONObject();
        jsonX.put("id",ts);
        jsonX.put("title","Selenium WebDriver");
        jsonX.put("author","Lear Automation");

            given()
                .contentType("application/json")
                .body(jsonX.toJSONString())
            .when()
                    .post()
            .then()
                    .assertThat()
                    .statusCode(equalTo(201))
                    .body("author", equalTo("Lear Automation"))
                    .log().all();
    }

    @Test
    public void putUpdateTest()
    {

//
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI= "http://localhost:3000/posts/";

                JSONObject jsonX = new JSONObject();
        jsonX.put("id","1566043880193");
        jsonX.put("title","tt updated by PUT");
        jsonX.put("author","aa updated by PUT");

        given()
                .header("Content-Type", "application/json")
                .body(jsonX.toJSONString())
            .when()
                .put("1566043880193")
            .then()
                .assertThat()
                .statusCode(200)
                .body("title", equalTo("tt updated by PUT"))
                .body("author",equalTo("aa updated by PUT"))
                .log().all();


        //        OLD
//        RequestSpecification request = given();
//        request.header("Content-Type", "application/json");
//
//        JSONObject jsonX = new JSONObject();
//        jsonX.put("id","25");
//        jsonX.put("title","Selenium WebDriver");
//        jsonX.put("author","Adam M");
//
//        request.body(jsonX.toJSONString());
//        Response response = request.put(
//                "http://localhost:3000/posts/25");
//        int code = response.getStatusCode();
//        Assert.assertEquals(code,200);
//        System.out.println("Response code "+code);



    }

    @Test
    public void deleteTest()
    {
        enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost:3000/posts";

        when()
                .delete("26")
            .then()
                .assertThat()
                    .statusCode(200)
                .log().all();


//        OLD
//        RequestSpecification request = given();
//        Response response = request.delete(
//                "http://localhost:3000/posts/25");
//        int code = response.getStatusCode();
//        Assert.assertEquals(code,200);
    }

}
