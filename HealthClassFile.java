package cinnastratrestpractice;
import static io.restassured.RestAssured.*;

public class HealthClassFile {

    public static void main(String[] args) {

        given()
        .when()
            .get("http://localhost:3000/api/health")
        .then()
            .statusCode(200)
            .log().all();
    }
}


