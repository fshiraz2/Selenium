package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		//making a connection to the driver
				System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();//go ahead and open chrome browser
				
				
          driver.get("https://www.google.com");
          String url=driver.getCurrentUrl();
          System.out.println(url);
          
         
          System.out.println( driver.getTitle());//will give you the title of the url in Consule
	}

}
