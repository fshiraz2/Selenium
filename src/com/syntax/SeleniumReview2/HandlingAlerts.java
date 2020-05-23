package com.syntax.SeleniumReview2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://www.seleniumframework.com/practiceform/");
	   
	   WebElement alertButton=driver.findElement(By.id("alert"));
	   alertButton.click();
	   Thread.sleep(2000);//2 seconds
	   Alert alert=driver.switchTo().alert();//we need to switch focus to alert
	   alert.accept();//will click ok on alert popup
	   
	   //lets practice with xpath
	  WebElement timingAlertButton= driver.findElement(By.xpath("//button[text()='Timing Alert']"));
	  timingAlertButton.click();
	  //make a new webDriver
	  WebDriverWait wait=new WebDriverWait(driver,20);//explicit wait of object
	  //explicit gives us to wait for some condition
	  wait.until(ExpectedConditions.alertIsPresent());//wait until alert is present
	  Thread.sleep(2000);
	  alert.accept();//accept the timing alert
	  
	   
	   

	}

}
