package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo {

	public static void main(String[] args) {
		//http://166.62.36.207/syntaxpractice/bootstrap-iframe.html
		WebDriver driver=BaseClass.setUp();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"true");//get rid of the red stuff(logs)not successful though
		
		
		driver.switchTo().frame("FrameOne");
		boolean logIsDis=driver.findElement(By.id("hide")).isDisplayed();
		System.out.println("logo inside frame is displayed:: "+logIsDis);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		boolean enrolBtnIsEnabled=driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("Enroll Button inside frame Two is Enabled:: "+enrolBtnIsEnabled);
		
		BaseClass.tearDown();

	}

}
