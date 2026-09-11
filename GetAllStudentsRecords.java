package cinnastratrestpractice;
import static io.restassured.RestAssured.*;

public class GetAllStudentsRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given,when then
		given()
		.when()
		.get("http://localhost:3000/api/students")
		.then()
		  .statusCode(200)
          .log().all();

	}

}
