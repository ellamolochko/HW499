
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.core.IsEqual.equalTo;

public class PostTest {

    @Test

    void shouldReturnSendData () {
        var text = "DOlgo";
        given()
                .baseUri ("https://postman-echo.com")
                .body(text)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }
}