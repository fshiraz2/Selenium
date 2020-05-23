package com.syntax.hw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToHrms {
	 public static WebDriver driver;//always make Webdriver public static
	
	public static void main(String[]args) throws IOException, InterruptedException {
		//to read ur file                   //always use user.dir
		String filePath=System.getProperty("user.dir")+"/configs/configuration.properties";//defines from which location java starts
		System.out.println(filePath);//just to double check and see if its the correct path
		
		FileInputStream fis=new FileInputStream(filePath);//to import data always use FileInputStream
		
		Properties prop=new Properties();//calls chrome,then username, pass, etc
		
		prop.load(fis);
		
		//how to retrieve the browser
		String browser=prop.getProperty("browser");//browser from file
		
		//WebDriver driver=null;or we can do this instead of line 13
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver=new ChromeDriver();//no WebDriver at beg. bc we initialized on line 27
			break;
	    case "firefox":	
	    	System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
	    	 driver=new FirefoxDriver();//dont include webdriver at beggining bc it will complain its same
	    	break;
		}
			//next step is: navigate to specific website
	    	
	    	driver.get(prop.getProperty("url"));//it needs to be same as file not capital Url
	    	Thread.sleep(3000);
	    	driver.close();
		}
	}

