package cinnastratrestpractice;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import java.util.Map;


public class CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HW: Patch, Put, Delete 8th record
		
		
//collection
	       Map<String, Object> student = new HashMap<>();
	        student.put("name", "CinnAstra Fresher");
	        student.put("email", "cinnastra.fresher03@example.com");
	        student.put("course", "API Testing");
	        student.put("status", "Active");
	        student.put("score", 95);

	        given()
	            .baseUri("http://localhost:3000")
	            .contentType("application/json")
	            .body(student)
	        .when()
	            .post("/api/students")
	        .then()
	            .statusCode(201)
	            .body("success", equalTo(true))
	            .body("message", equalTo("Student created successfully"))
	            .body("data.name", equalTo("CinnAstra Fresher"))
	            .body("data.email", equalTo("cinnastra.fresher03@example.com"))
	            .log().all();
	    
	


	}

}
