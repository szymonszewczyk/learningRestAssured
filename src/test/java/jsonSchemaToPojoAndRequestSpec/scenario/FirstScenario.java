package jsonSchemaToPojoAndRequestSpec.scenario;

import com.jayway.restassured.http.ContentType;
import jsonSchemaToPojoAndRequestSpec.config.RestApi;
import jsonSchemaToPojoAndRequestSpec.model.JsonSchemaToPojoModel;

import org.testng.annotations.Test;
//import io.restassured.http.ContentType;
//import com.jayway.restassured.http.ContentType;

//import static io.restassured.RestAssured.*;
import static com.jayway.restassured.RestAssured.given;
import static org.apache.http.client.methods.RequestBuilder.post;

public class FirstScenario extends RestApi {

    public void postSomethingScenario(JsonSchemaToPojoModel jsonSchemaToPojoModel) {
        restApi
                .when()
                    .contentType("application/json")
                    .content(jsonSchemaToPojoModel) // TODO java.lang.IllegalStateException: Cannot serialize object because no JSON serializer found in classpath. Please put either Jackson or Gson in the classpath.

                .post()
                .then()
                    .statusCode(200);
    }
}