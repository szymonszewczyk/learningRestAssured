package getRequests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getDataBestPractices {

    @Test
    public void testResponseCode() {
        String path = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";

        Response resp = get(path);

        int code = get(path).getStatusCode();

        System.out.println("Received status code is " + code);

        Assert.assertEquals(code, 200);
    }


    @Test
    public void testBody() {
        String path = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";

        String data = get(path).asString();
        long time = get(path).getTime();
        System.out.println("Received body is " + data);

        System.out.println("Response time " + time);
//        Assert.assertEquals(code, 200);
    }
}