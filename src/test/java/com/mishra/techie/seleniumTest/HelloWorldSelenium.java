package com.mishra.techie.seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorldSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriver driver;
		 String baseUrl;
		  
		   driver = new FirefoxDriver();
		   baseUrl = "http://www.flipkart.com/";
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 

		  
		    driver.get(baseUrl);
		    driver.findElement(By.id("fk-top-search-box")).clear();
		    driver.findElement(By.id("fk-top-search-box")).sendKeys("samsung");
		    driver.findElement(By.xpath("//input[@value='Search']")).click();
		    
		    driver.quit();
	}
}
