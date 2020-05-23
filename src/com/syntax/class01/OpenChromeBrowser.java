package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main (String[]args) throws InterruptedException {
		//ChromeDriver driver=new ChromeDriver();
		
		
		//making a connection to the driver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//go ahead and open chrome browser. We call Constructor of ChromeDriver and upcast
		
		driver.get("https://www.facebook.com");
		
		String actualUrl=driver.getCurrentUrl();
	
		
		if(actualUrl.equalsIgnoreCase("https://www.facebook.com/")) {
			String title=driver.getTitle();
			System.out.println(title);
		}else {
			System.out.println("Wrong Url is returned");
		}
		
		//Thread.sleep(2000);//will slow the process
		driver.close();//will close the browser
	}
}
