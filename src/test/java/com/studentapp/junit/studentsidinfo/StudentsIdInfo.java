package com.studentapp.junit.studentsidinfo;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.*;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;

@RunWith(SerenityRunner.class)
public class StudentsIdInfo {

	@BeforeClass
	public static void initialize() {

		RestAssured.baseURI = "http://localhost:8088/student";

	}

	@Test
	public void passTest() throws Exception {
		try {

			SerenityRest.given().when().get("/list").asString();

			// System.out.println(expected);

		} catch (Exception e) {

		}
	}

	// Fail this test to check failure messages in the report
	@Test
	public void failTest() throws Exception {
		try {

			SerenityRest.given().when().get("/list").then().statusCode(500);

			// System.out.println(expected);

		} catch (Exception e) {

		}
	}

	// Marking the test as pending
	@Pending
	@Test
	public void pendingTest() throws Exception {
		try {

		} catch (Exception e) {

		}
	}

	// Marking the test as Ignored
	@Ignore
	@Test
	public void skipedTest() throws Exception {
		try {

		} catch (Exception e) {

		}
	}
	
	//This Test will cause an error
	@Test
	public void errorTest()  {
	
			int a =(5/0);
			System.out.println("The error is "+a);

		
	}
	
	
	//The exception thrown in test is added in serenity.properties file as compromised
	@Test
	public void compromisedTest() throws FileNotFoundException  {
	
			File f = new File("/Users/ashwin/file.txt");
			FileReader fr = new FileReader(f);
		
	}
	
	//Will be tested manually
	@Manual
	@Test
	public void manualTest() throws FileNotFoundException  {
	
			File f = new File("/Users/ashwin/file.txt");
			FileReader fr = new FileReader(f);
		
	}
	
}
