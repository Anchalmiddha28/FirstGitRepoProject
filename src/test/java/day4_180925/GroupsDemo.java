package day4_180925;

import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(groups= {"Smoke"})
	public void test1()
	{
		System.out.println("Test 1 {\"Smoke\"}");
	}
	
	@Test(groups= {"Smoke","Sanity"})
	public void test2()
	{
		System.out.println("Test 2 {\"Smoke\",\"Sanity\"}");
	}
	
	@Test(groups= {"Sanity"})
	public void test3()
	{
		System.out.println("Test 3 {\"Sanity\"}");
	}
	
	@Test(groups= {"windows.Regression"})
	public void test4()
	{
		System.out.println("Test 4 {\"Regression\"}");
	}
	
	@Test(groups= {"Regression", "Sanity"})
	public void test5()
	{
		System.out.println("Test 5 {\"Regression\", \"Sanity\"}");
	}
	
	@Test(groups= {"Regression", "Sanity", "Smoke"})
	public void test6()
	{
		System.out.println("Test 6 {\"Regression\", \"Sanity\", \"Smoke\"}");
	}
	
}
