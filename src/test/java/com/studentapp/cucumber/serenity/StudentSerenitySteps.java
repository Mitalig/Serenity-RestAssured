package com.studentapp.cucumber.serenity;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class StudentSerenitySteps {
	
	@Step("It will return the post request reponse having body:{0}")
	public ValidatableResponse genericPost (String body)  {
		
		
		return SerenityRest.rest().given()
		.contentType(ContentType.JSON)
		.when()
		.body(body)
		.post()
		.then();
		
	}
	
	@Step("It will return the get request response having url:{0} ")
	public ValidatableResponse genericGet (String url)  {	
		
		return SerenityRest.rest().given()
				.when()
				.get(url)
				.then();
						
	}
	
	@Step("It will return the put request response having url:{0} and body:{1} ")
	public ValidatableResponse genericPut (String url, String body)  {	
		
		return SerenityRest.rest().given().contentType(ContentType.JSON)
		.when()
		.body(body)
		.put(url)
		.then();
						
	}

}
