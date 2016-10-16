package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firsttest {
	
	 public FirefoxDriver driver;
	private Object priverma205;
	
	@BeforeMethod
	public void browserlaunch() throws Exception{
		
    driver = new FirefoxDriver();
  //  driver.get("http://facebook.com");
  //  driver.get("http://facebook.com");
    driver.navigate().to("http://facebook.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
    Thread.sleep(50000);
	}
	
	
	@Test
	public void registration() throws InterruptedException{
		
		
		driver.findElement(By.id("u_0_1")).sendKeys("pragati");
		driver.findElement(By.id("u_0_3")).sendKeys("preetam");
		driver.findElement(By.xpath(".//*[@id='u_0_f']")).click();
		driver.findElement(By.id("u_0_j")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Why do I need to provide my date of birth?")).click();
		
	}
	
	@Test
 public void login(){
		driver.findElement(By.id("email")).sendKeys("priverma205@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("xyz");
		driver.findElement(By.id("u_0_m")).click();
		driver.navigate().refresh();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("email@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("sendkey");
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Test
	public void locateelement(){
		
		driver.findElement(By.linkText("Why do I need to provide my date of birth?")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("1234");
	}
	
	@AfterMethod
	public void closebrowser(){
		
	//	driver.manage().deleteAllCookies();
	//	driver.quit();
		
	}
	
	

	

}
