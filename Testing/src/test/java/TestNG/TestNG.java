package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
@AfterTest()
public void First() {
	System.out.println("After Test");
}

@BeforeTest
public void Second() {
	System.out.println("Before Test");
}

@Test
public void Test() {
	System.out.println("Test");
}

@BeforeClass()
public void BeforeClass() {
	System.out.println("Before Class");
}

@AfterClass()
public void AfterClass() {
	System.out.println("After Class");
}

@BeforeSuite()
public void BeforeSuite() {
	System.out.println("Before Suite");
}

@AfterSuite()
public void AfterSuite(){
	System.out.println("After Suite");
}

@BeforeGroups()
public void BeforeGroups() {
	System.out.println("Before Test Groups");
}

}
