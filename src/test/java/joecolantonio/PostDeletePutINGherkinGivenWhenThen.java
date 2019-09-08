package joecolantonio;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

//import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class PostDeletePutINGherkinGivenWhenThen {

    @Test
    public void getAllTest(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI = "http://localhost:3000/posts";

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

    // The HTTP methods PATCH can be used to update partial resources. For instance, when you only need to update one
    // field of the resource, PUTting a complete resource representation might be cumbersome and utilizes more bandwidth
    @Test
    public void patchTest()
    {
        long ts = System.currentTimeMillis();

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI = "http://localhost:3000/posts";

        JSONObject jsonX = new JSONObject();
        jsonX.put("author","Lear Automation");

                given()
                    .contentType("application/json")
                    .body(jsonX.toJSONString())
                .when()
                    .patch("1")
                .then()
                    .assertThat()
                    .statusCode(equalTo(200))
                    .body("author", equalTo("Lear Automation"))
                    .log().all();
    }

    @Test
    public void putUpdateTest()
    {
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
    }

    @Test
    public void profileTest()
    {
        enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "http://localhost:3000/profile";

        when()
                .delete("26")
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();
    }

}
