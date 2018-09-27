package com.testng.priority;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	@Test
	public void test1() {
		System.out.println("Inside test1");
		}
	@Test
	public void test2() {
		System.out.println("Inside test2");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Inside after test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("inside after method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("inside before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("inside after class");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("inside before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("inside after suite");
	}

}
