package maven;

import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetStoreSteps {

	@When("^user gets details of user \"([^\"]*)\" from uri \"([^\"]*)\"$")
	public void user_gets_details_of_user_from_uri(String parm, String uri) throws Throwable {

		RestAssured.baseURI = uri;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, parm);
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		
	}

	@When("^user \"([^\"]*)\" logs in using \"([^\"]*)\"$")
	public void user_logs_in_using(String user, String uri) throws Throwable {

		RestAssured.baseURI = uri.replace("{username}", user);
		RequestSpecification httpRequest = RestAssured.given().authentication().basic("ganesh", "password");
		Response response = httpRequest.request(Method.GET, user);
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}
	
	@When("^user \"([^\"]*)\" gets by name \"([^\"]*)\"$")
	public void user_gets_by_name(String user, String uri) throws Throwable {
		RestAssured.baseURI = uri.replace("{username}", user);;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, user);
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}

	@When("^user \"([^\"]*)\" updates details  \"([^\"]*)\"$")
	public void user_updates_details(String user, String uri) throws Throwable {
		RestAssured.baseURI = uri.replace("{username}", user);;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.PUT, user);
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}
	

	@When("^user \"([^\"]*)\" delets  \"([^\"]*)\"$")
	public void user_delets(String user, String uri) throws Throwable {
		RestAssured.baseURI = uri.replace("{username}", user);;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.DELETE, user);
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}
	



}
