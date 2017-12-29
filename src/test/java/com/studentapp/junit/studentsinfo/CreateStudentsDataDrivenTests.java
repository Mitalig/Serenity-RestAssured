package com.studentapp.junit.studentsinfo;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.studentapp.cucumber.serenity.StudentSerenitySteps;
import com.studentapp.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;


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
	
	public StudentSerenitySteps getSss() {
		return sss;
	}

	public void setSss(StudentSerenitySteps sss) {
		this.sss = sss;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public String getCourse1() {
		return course1;
	}

	public void setCourse1(String course1) {
		this.course1 = course1;
	}

	public String getCourse2() {
		return course2;
	}

	public void setCourse2(String course2) {
		this.course2 = course2;
	}

	
	
	@Title("Adding a Student using Data Driven Approach")
	@Test
	public void test001 ()  {

		
		sss.genericPostUsingPojo(firstName, lastName, email, programme, course1, course2).statusCode(201);
		
		
	}
}
