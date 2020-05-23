package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {

	public static void main(String[] args) {
//		TC 1: HRMS Application Login: 
//			Open chrome browser
//			Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//			Enter valid username and password
//			Click on login button
		
//			Then verify Syntax Logo is displayed.
//			TC 2: HRMS Application Negative Login: 
//			Open chrome browser
//			Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//			Enter valid username
//			Leave password field empty
//			Verify error message with text “Password cannot be empty” is displayed.
//			TC 3: Syntax Demo input boxes count: 
//			Open chrome browser
//			Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//			Click on “Input Forms” links
//			Click on “Simple Form Demo” links
//			Get all input boxes from the page
//			Enter “Hello” to each text box
//			Close browser
//			TC 4: Radio Buttons Practice  
//			Open chrome browser
//			Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//			Click on “Input Forms” links
//			Click on “Radio Buttons Demo” links
//			Click on any radio button in “Radio Button Demo” section.
//			Verify correct radio is clicked
//			Click on any radio button in “Group Radio Buttons Demo” section.
//			Verify correct checkbox is clicked
//			Quit browser
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
        
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
	}

}
