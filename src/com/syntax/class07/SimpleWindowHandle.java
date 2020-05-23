package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {

	public static void main(String[] args) {
		//making a connection to the driver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//go ahead and open chrome browser
		
		
        driver.get("https://accounts.google.com/signup");
        String singUpTitle=driver.getTitle();
        System.out.println("Main page title is:: "+singUpTitle);
        
        driver.findElement(By.linkText("Help")).click();
        
        /*
         * How to get window handle?
         * In Selenium, we have 2 methods to get the hand of window.
         * getWindowHandle();
         * getWindowHandles();
         */
        
        //each window has unique urls and ids
        
        Set<String>allWindowHandles=driver.getWindowHandles();
        //returns set of string IDs of all windows current by the current instance.
        
        System.out.println("Number of windows opened are:: "+allWindowHandles.size());
        
        Iterator<String>it=allWindowHandles.iterator();
        
        String mainWindowHandle= it.next();
        System.out.println("ID of main window is:: "+mainWindowHandle);
        
        
        String childWindowHandle=it.next();//will show 2nd id of window
        System.out.println("ID of the child window is:: "+childWindowHandle);
        
        driver.switchTo().window(childWindowHandle);//will switch from mainWindowHandle to child
        String childWindowTitle=driver.getTitle();
        System.out.println("Child page title is:: "+childWindowTitle);
        driver.close();
	}

}
