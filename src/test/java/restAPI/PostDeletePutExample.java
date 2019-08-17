package restAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostDeletePutExample {

    @Test
    public void postTest()
    {
        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");

        JSONObject jsonX = new JSONObject();
        jsonX.put("id","25");
        jsonX.put("title","Selenium WebDriver");
        jsonX.put("author","Lear Automation");

        request.body(jsonX.toJSONString());

        Response response = request.post("http://localhost:3000/posts");

        int code = response.getStatusCode();

        Assert.assertEquals(code,201);
    }

    @Test
    public void putUpdateTest()
    {
        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");

        JSONObject jsonX = new JSONObject();
        jsonX.put("id","25");
        jsonX.put("title","Selenium WebDriver");
        jsonX.put("author","Adam M");

        request.body(jsonX.toJSONString());

        Response response = request.put(
                "http://localhost:3000/posts/25");

        int code = response.getStatusCode();

        Assert.assertEquals(code,200);

        System.out.println("Response code "+code);
    }

    @Test
    public void deleteTest()
    {
        RequestSpecification request = RestAssured.given();

        Response response = request.delete(
                "http://localhost:3000/posts/25");

        int code = response.getStatusCode();

        Assert.assertEquals(code,200);
    }

}
