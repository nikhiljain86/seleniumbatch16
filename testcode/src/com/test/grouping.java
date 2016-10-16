package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class grouping {
	
	@BeforeMethod
	public void before(){
		
		System.out.println("i run before every test");
	}
	
	@Test(enabled=false,priority=0)
	public void test1(){
		
		System.out.println("group.test1");
	}
	

	@Test(alwaysRun=true,priority=1,groups={"smoke","system"})
	public void test7(){
		
		System.out.println("group.test7");
		
	}
	

	@Test(groups={"smoke","system"},priority=2)
	public void test2(){
		
		System.out.println("group.test2");
		
		
	}
	

	@Test(groups={"system"},alwaysRun=true,priority=3)
	public void test3(){
		
		System.out.println("group.test3");
	}
	

	@Test
	public void loginlink(){
		
		System.out.println("group.test4");
	}
	

	@Test(dependsOnGroups={"system"},priority=5)
	public void test5(){
		
		System.out.println("group.test5");
		
	}
	
	
	@Test(dependsOnMethods={"loginfunctionality"},priority=4)
	public void loginfunctionality(){
		
		System.out.println("group.test11");
		
	}
	
	@AfterMethod
	public void aftermethod(){
		
		System.out.println("i run after every test");
		
	}

}
