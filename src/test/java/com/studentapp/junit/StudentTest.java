package com.studentapp.junit;

import static io.restassured.RestAssured.given;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.*;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;


@RunWith(SerenityRunner.class)
public class StudentTest {
	
	
	@BeforeClass
	public static void initialize ()  {
		
	 RestAssured.baseURI = "http://localhost:8088/student";
	 
		  }
		
		  
		  @Test
		  public void jsonAssert() throws Exception  {
		   try  {
			  
		   SerenityRest.given ()
		    .when()
		    .get ("/list").asString();
		  
		  // System.out.println(expected);
		  
		   }
		   catch(Exception e)  {
			   
		   }
		  }
		
		
	}


