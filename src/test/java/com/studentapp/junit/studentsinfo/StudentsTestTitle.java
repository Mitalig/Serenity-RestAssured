package com.studentapp.junit.studentsinfo;

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
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class StudentsTestTitle {

	@BeforeClass
	public static void initialize() {

		RestAssured.baseURI = "http://localhost:8088/student";

	}

	@Title("This test will get list of Students list")
	@Test
	public void passTest() throws Exception {
		try {

			SerenityRest.given().when().get("/list").asString();

			// System.out.println(expected);

		} catch (Exception e) {

		}
	}
}
