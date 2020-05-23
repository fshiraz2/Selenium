package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {

	public static void main(String[] args) {
		
		//Actual url=http://abcdatabase.com/basicauth
		//username=test
		//pass=test
		
		// Making connection to driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://abcdatabase.com/basicauth");

	}

}
