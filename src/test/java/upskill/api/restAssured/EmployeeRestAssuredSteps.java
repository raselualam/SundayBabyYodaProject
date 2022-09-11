package upskill.api.restAssured;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class EmployeeRestAssuredSteps {

	@Given("^Create new employee record$")
	public void create_new_employee_record() throws Throwable {
	    
	}

	@When("^Get all employee data$")
	public void get_all_employee_data() throws Throwable {
		Response resp = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees"); //Getting API HTTP response using RestAssured
		int statusCode = resp.getStatusCode();												 //Getting Status Code
		String responseBody = resp.asString();												 //Getting Response Body
		Assert.assertEquals(200, statusCode);												 //Validate Status Code
		System.out.println("Status Code ::: " + statusCode);								 //Printing Status Code
		System.out.println("Response Body ::: " + responseBody);							 //Printing Response Body
	}

	@Then("^Get single employee data by id$")
	public void get_single_employee_data_by_id() throws Throwable {
	
	}
}