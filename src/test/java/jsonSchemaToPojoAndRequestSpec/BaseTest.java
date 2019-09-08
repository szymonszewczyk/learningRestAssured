package jsonSchemaToPojoAndRequestSpec;

import jsonSchemaToPojoAndRequestSpec.config.RestApi;
import jsonSchemaToPojoAndRequestSpec.model.JsonSchemaToPojoModel;
import jsonSchemaToPojoAndRequestSpec.scenario.FirstScenario;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest extends RestApi {

    JsonSchemaToPojoModel jspojo = new JsonSchemaToPojoModel()
            .withId(2)
            .withAuthor("Jan Nowak")
            .withTitle("BaseTest stuff");


    @Test
    public void firstTest (){
        new FirstScenario().postSomethingScenario(jspojo); //java.lang.IllegalStateException: Cannot serialize object because no JSON serializer found in classpath. Please put either Jackson or Gson in the classpath.

    }
}
