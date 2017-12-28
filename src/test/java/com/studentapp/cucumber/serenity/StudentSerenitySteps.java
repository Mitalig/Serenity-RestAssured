package com.studentapp.cucumber.serenity;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class StudentSerenitySteps {
	
	@Step
	public ValidatableResponse genericPost (String body)  {
		
		
		return SerenityRest.rest().given()
		.contentType(ContentType.JSON)
		.when()
		.body(body)
		.post()
		.then();
		
	}
	
	@Step
	public ValidatableResponse genericGet (String url)  {	
		
		return SerenityRest.rest().given()
				.when()
				.get(url)
				.then();
						
	}
	
	@Step
	public ValidatableResponse genericPut (String url, String body)  {	
		
		return SerenityRest.rest().given().contentType(ContentType.JSON)
		.when()
		.body(body)
		.put(url)
		.then();
						
	}

}
