package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
/*
 * Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
(Create 2 scripts using different locators)
 */
	public static void main (String[]args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");//will be navigates to this page
		
		driver.findElement(By.linkText("Register here")).click();//linkText bc link
		
		driver.findElement(By.name("firstName")).sendKeys("John");
		
		driver.findElement(By.name("lastName")).sendKeys("Smith");
		
		driver.findElement(By.name("phone")).sendKeys("7036664567");
		
		driver.findElement(By.id("userName")).sendKeys("123@yahoo.com");
		
		driver.findElement(By.name("address1")).sendKeys("2345 millwood sq.");
		
		driver.findElement(By.name("postalCode")).sendKeys("65722");
		
	
		
		
		
	}
}
