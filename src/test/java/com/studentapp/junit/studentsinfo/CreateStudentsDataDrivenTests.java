package com.studentapp.junit.studentsinfo;

import org.junit.Test;

import org.junit.runner.RunWith;

import com.studentapp.cucumber.serenity.StudentSerenitySteps;
import com.studentapp.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;

@Concurrent(threads="4x")
@UseTestDataFrom("testdata/studentdetails.csv")
@RunWith(SerenityParameterizedRunner.class)
public class CreateStudentsDataDrivenTests extends TestBase {	
	
	@Steps
	StudentSerenitySteps sss;
	
	public String firstName;
	public String lastName;
	public String email;
	public String programme;
	public String course1;
	public String course2;
	
	
	@Title("Adding a Student using Data Driven Approach")
	@Test
	public void test001 ()  {

		System.out.println("Hello-------");
		
		sss.genericPostUsingPojo(firstName, lastName, email, programme, course1, course2).statusCode(201);
		
		
	}
}
