package day1_100925;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {

	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before suite method");
	}
	@BeforeTest
	public void btest()
	{
		System.out.println("Before test method");
	}
	
	
	@BeforeClass
	
	public void bclass()
	{
		System.out.println("Before class method");
	}
	
	@BeforeMethod
		public void bmethod()
		{
			System.out.println("Before method method");
		}
	@Test
	public void T1()
	{
		System.out.println("Before test1  method");
	}
	
	@Test
	public void T2()
	{
		System.out.println("Before test2 method");
	}
	@AfterMethod
	
	public void aMethod()
	{
		System.out.println("After method method");
	}
	@AfterClass
	
	public void aclass()
	{
		System.out.println("After class method");
	}
	@AfterTest
	public void atest()
	{
		System.out.println("After test method");
	}
	
//	@AfterSuite
//	public void asuite()
//	{
//		System.out.println("After suite method");
//	}

}
