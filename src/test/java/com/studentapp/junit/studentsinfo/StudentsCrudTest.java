package com.studentapp.junit.studentsinfo;

import java.util.HashMap;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import com.studentapp.cucumber.serenity.StudentSerenitySteps;
import com.studentapp.testbase.TestBase;
import com.studentapp.utils.TestUtils;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SerenityRunner.class)
public class StudentsCrudTest extends TestBase {
	public static String firstName= "Ashwin"+TestUtils.getRandomValue();
	
	@Steps
	StudentSerenitySteps sss;
	
	@Title("Adding a Student using Post Request")
	@Test
	public void test001 ()  {
		
		String student = "{\"firstName\":\"Ashwin5\",\"lastName\":\"Harper\",\"email\":\"ashwin219.rhoncus.Proin@massaQuisqueporttitor.org\",\"programme\":\"Financial Analysis\",\"courses\":[\"Accounting\",\"Statistics\"]}";
		
		sss.genericPost(student).statusCode(201);
		
		
	}
	
//	@Title("Checking whether added Student is present")
//	@Test
//	public void test002 ()  {	
//		
//	HashMap<String,Object> values=
//				sss.genericGet("/get").extract().path("findAll{it.firstName=='Ashwin3'}.get(0)");
//	
//	assertThat(values,hasValue("Ashwin3"));
//	
//	}
	
	
	@Title("Updating the added Student")
	@Test
	public void test003 ()  {
		
	String student = "{\"firstName\":\"Ashwin15_Updated\",\"lastName\":\"Harper\",\"email\":\"ashwin209.rhoncus.Proin@massaQuisqueporttitor.org\",\"programme\":\"Financial Analysis\",\"courses\":[\"Accounting\",\"Statistics\"]}";
	
	sss.genericPut("/103", student);
			
	}

}
