package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW {
//	TC 1: Amazon Department List Verification
//	Open chrome browser
//	Go to “http://amazon.com/”
//	Verify how many department options available.
//	Print each department 
//	Select Computers
//	Quit browser
//	TC 2: Select and Deselect values
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Input Forms” links
//	Click on “Select Dropdown List” links
//	Select value from “Select List Demo” section
//	Verify value has been selected
//	Select 4 options from “Multi Select List Demo”
//	Deselect 1 of the option from the dd
//	Quit browser
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//does not work
//		WebElement amazonOptions=driver.findElement(By.className("hmenu hmenu-visible"));
//	    String options=amazonOptions.getText();
//	    System.out.println(options);
	  
	
	
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		
	}
}
