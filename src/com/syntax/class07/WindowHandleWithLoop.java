package com.syntax.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithLoop {

	public static void main(String[] args) throws InterruptedException {
		//making a connection to the driver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//go ahead and open chrome browser
		
		
        driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
        String singUpTitle=driver.getTitle();
        System.out.println("Main page title is:: "+singUpTitle);
        String parentWindowHandle=driver.getWindowHandle();//will return ID of parent window
        System.out.println("What is the Parent Window Handle? "+parentWindowHandle);
        
        for (int i=1;i<=3;i++) {
        	driver.findElement(By.id("button1")).click();
        	Thread.sleep(2000);
        }
       Set<String> allWindowHandles=driver.getWindowHandles();
       for(String handle:allWindowHandles) {
    	   System.out.println("ID Of the Window:: "+handle);
    	   driver.switchTo().window(handle);
    	   driver.get("https://www.google.com");
    	   Thread.sleep(2000);
    	   driver.close();
       }
	}

}
