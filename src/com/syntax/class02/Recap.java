package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
/*
 * Commands with Page:
 * getCurrentURL
 * get()
 * getTitle();
 */
	public static void main (String[]args) {
		
		String fburl="https://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//window users add.exe
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(fburl);
		
		String url=driver.getCurrentUrl();
		
		System.out.println("Current URL is: "+url);
		
		String title=driver.getTitle();
		
		System.out.println("Title of the page is: "+title);
		
		driver.close();
		
		
	}
}
