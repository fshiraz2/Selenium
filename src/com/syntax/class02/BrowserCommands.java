package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main (String[]args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");//will go here 
		
		driver.manage().window().maximize();//screen will maximize
		
		Thread.sleep(3000);//reduces speed
		
		driver.navigate().refresh();
		
		driver.navigate().to("https:/www.google.com");//then here. We use navigat to bc it keeps history
		
		driver.navigate().back();//then, it will go back to fb
		
		Thread.sleep(3000);//reduces speed
		
		driver.navigate().forward();//will go to google
	}
}
