package MyFruits;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class property1 {
	
	public ResourceBundle br;
	
	@Test
	public void bundle(){
		
		WebDriver driver = new FirefoxDriver();
		br=ResourceBundle.getBundle("test");
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(br.getString("username"))).sendKeys(br.getString("username1"));
		driver.findElement(By.xpath(br.getString("password"))).sendKeys(br.getString("password1"));
		driver.findElement(By.xpath(br.getString("login"))).click();
	}

	
	
}
