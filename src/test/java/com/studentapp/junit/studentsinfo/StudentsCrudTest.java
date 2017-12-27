package com.studentapp.junit.studentsinfo;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.studentapp.testbase.TestBase;

import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class StudentsCrudTest extends TestBase {
	
	@Title("Adding a Student using Post Request")
	@Test
	public void addStudent ()  {
		
		String student = "{\"firstName\":\"Ashwin1\",\"lastName\":\"Harper\",\"email\":\"ashwin3.rhoncus1.Proin@massaQuisqueporttitor.org\",\"programme\":\"Financial Analysis\",\"courses\":[\"Accounting\",\"Statistics\"]}";
		
		 SerenityRest.given()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.post()
		.then().statusCode(201);
		
		
	}

}
