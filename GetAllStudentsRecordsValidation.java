package cinnastratrestpractice;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetAllStudentsRecordsValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given,when then
		 given()
		.when()
		.get("http://localhost:3000/api/students")
		.then()
		  .statusCode(200)
		  .body("data[1].name", equalTo("Karthik"))
		  .body("data[1].email", equalTo("karthik@example.com"))
		  
		 
          .log().all();
	      }

}
