package cinnastratrestpractice;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetaSingleRecordstudent {

    public static void main(String[] args) {
    	
    	/*Step 1: Given will be there , .when will be there 
    	 * Step2: Stopre this vlaue in one variable (Step1)
    	 * Instead of then, we have to proivde a variable to store the result
    	 * Then print the reesult
    	 * 
    	 * Hw: Get a single student record 15th one Emailid,name,id full rcord should print
    	 * YOu have to do the assertion with then
    	 * Try to create a record with when+Post
    	 * 
    	 */
    	

    	   Response response =

    	            given()

    	            .when()
    	                .get(
    	                    "http://localhost:3000/api/students"
    	                );


    	        int studentId =
    	            response.jsonPath()
    	                    .getInt("data[1].id");
    	        String studentname =
        	            response.jsonPath()
        	                    .getString("data[10].name");
    	        String studentname2 =
        	            response.jsonPath()
        	                    .getString("data[25].name");


    	        System.out.println(
    	            "Student Record: "
    	            + studentId +"       "
    	            +studentname
    	            +"       "
    	            +studentname2
    	        );

    }
}


