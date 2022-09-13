package upskill.api.restAssured;

import java.io.File;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class EmployeeRestAssuredSteps {

	@Given("^Create new employee record$")
	public void create_new_employee_record() throws Throwable {
		File payload = new File(System.getProperty("user.dir")+"/src/test/resource/ApiPayloads/NewEmployee.json"); //Bringing json request body
		
		RequestSpecification request = RestAssured.given();									//Initialize request
	    request.header("content-type", "application/json");									//Set Header
	    request.header("username", "upskill");
	    request.header("password", "12345");
	    request.header("bearer_token", "Sqjfelk45y6knhbgdfbn"); 
	    request.body(payload);																//Set Body
	    
		Response resp = RestAssured.post("https://dummy.restapiexample.com/api/v1/create"); //Getting API HTTP response using RestAssured
		int statusCode = resp.getStatusCode();												 //Getting Status Code
		String responseBody = resp.asString();												 //Getting Response Body
		Assert.assertEquals(200, statusCode);												 //Validate Status Code
		System.out.println("POST Status Code ::: " + statusCode);								 //Printing Status Code
		System.out.println("Response Body ::: " + responseBody);							 //Printing Response Body
	}

	@When("^Get all employee data$")
	public void get_all_employee_data() throws Throwable {
		Response resp = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees"); //Getting API HTTP response using RestAssured
		int statusCode = resp.getStatusCode();												 //Getting Status Code
		String responseBody = resp.asString();												 //Getting Response Body
		Assert.assertEquals(200, statusCode);												 //Validate Status Code
		System.out.println("GET Status Code ::: " + statusCode);								 //Printing Status Code
		System.out.println("Response Body ::: " + responseBody);							 //Printing Response Body
	}

	@Then("^Get single employee data by id$")
	public void get_single_employee_data_by_id() throws Throwable {
		Response resp = RestAssured.get("https://dummy.restapiexample.com/api/v1/employee/5"); //Getting API HTTP response using RestAssured
		int statusCode = resp.getStatusCode();												 //Getting Status Code
		String responseBody = resp.asString();												 //Getting Response Body
		Assert.assertEquals(200, statusCode);												 //Validate Status Code
		System.out.println("GET by id Status Code ::: " + statusCode);								 //Printing Status Code
		System.out.println("Response Body ::: " + responseBody);							 //Printing Response Body
	}
	
	@Given("^Update employee record$")
	public void update_employee_record() throws Throwable {

		File payload = new File(System.getProperty("user.dir")+"/src/test/resource/ApiPayloads/UpdateEmployee.json"); //Bringing json request body
		
		RequestSpecification request = RestAssured.given();									//Initialize request
	    request.header("content-type", "application/json");									//Set Header
	    request.header("username", "upskill");
	    request.header("password", "12345");
	    request.header("bearer_token", "Sqjfelk45y6knhbgdfbn"); 
	    request.body(payload);																//Set Body
	    
		Response resp = RestAssured.put("https://dummy.restapiexample.com/api/v1/update/21"); //Getting API HTTP response using RestAssured
		int statusCode = resp.getStatusCode();												 //Getting Status Code
		String responseBody = resp.asString();												 //Getting Response Body
		Assert.assertEquals(200, statusCode);												 //Validate Status Code
		System.out.println("PUT Status Code ::: " + statusCode);								 //Printing Status Code
		System.out.println("Response Body ::: " + responseBody);							 //Printing Response Body
	}

	@Then("^Delete employee record$")
	public void delete_employee_record() throws Throwable {
		Response resp = RestAssured.delete("https://dummy.restapiexample.com/api/v1/delete/2"); //Getting API HTTP response using RestAssured
		int statusCode = resp.getStatusCode();												 //Getting Status Code
		String responseBody = resp.asString();												 //Getting Response Body
		Assert.assertEquals(200, statusCode);												 //Validate Status Code
		System.out.println("Delete by id Status Code ::: " + statusCode);								 //Printing Status Code
		System.out.println("Response Body ::: " + responseBody);							 //Printing Response Body
	}
}