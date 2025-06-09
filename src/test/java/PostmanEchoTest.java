import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldSendPostRequestAndValidateResponse() {
        String baseUri = "https://postman-echo.com";
        String requestBody = "some data";

        RestAssured.given()
                .baseUri(baseUri)
                .contentType("text/plain; charset=UTF-8")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(Body));
    }
}