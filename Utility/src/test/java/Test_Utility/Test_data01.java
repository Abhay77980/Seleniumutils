package Test_Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Selenium_Utility.Utility_01;
	@Test
public class Test_data01 {
	public static void main(String args[]) 
	{
		Utility_01 S = new Utility_01();
		// S.Attribute_id();
		WebDriver driver = S.setUp("chrome", "https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> list=driver.findElements(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf.emcav > div.UUbT9 > div.aajZCb > div.mkHrUc > ul.erkvQe"));
		System.out.println(S.getCurrentTitle());
		for(WebElement li:list)
		{
			System.out.println(li.getText());
		}
	
	}
}
	
	
	