package restAPI;

import org.testng.annotations.Test;

//import static io.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.hasItems;

public class randomRequests {

    @Test
    public void givenUrl_whenVerifiesOddPricesAccuratelyByStatus_thenCorrect() {
        get("/odds").then().body("odds.findAll { it.status > 0 }.price",
                hasItems(5.25f, 1.20f));
    }
}
