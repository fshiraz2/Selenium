package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class AlertDemo {

	public static void main (String[]args) throws InterruptedException {
	
	WebDriver driver=BaseClass.setUp();//Below code is for UItestPractice.com
	driver.manage().window().maximize();//to maximize window
	
	driver.findElement(By.xpath("//button[@id='alert']")).click();
	
	
	//Handling simple alert/Popups
	Alert simpleAlert=driver.switchTo().alert();//will change focus to alert box
	
	Thread.sleep(1000);
	String simpleAText=simpleAlert.getText();
	System.out.println("This is simple alert text:: "+simpleAText);
	
	Thread.sleep(1000);
    simpleAlert.accept();//for any positive action !!!!
    Thread.sleep(1000);
    
    
    //Handling confirmation ALert
    driver.findElement(By.id("confirm")).click();
    Alert confirmAlert=driver.switchTo().alert();
    Thread.sleep(1000);
    String confirmAText=confirmAlert.getText();
    System.out.println("This is Confirm alert text:: "+confirmAText);
    Thread.sleep(1000);
    confirmAlert.dismiss();//click on the cancel button. For any negative reaction!!!
    Thread.sleep(1000);
    
    //Handling Prompt alerts/confirmation alerts by providing some configuration message
    String name="Alex";
    driver.findElement(By.id("prompt")).click();
    Alert promptAlert=driver.switchTo().alert();//switching into other alert
    System.out.println("This is a prompt alert text:: "+promptAlert.getText());
    promptAlert.sendKeys(name);//send text to prompt box
    promptAlert.accept();//to click OK
    
    String text=driver.findElement(By.xpath("//div[@id='demo']")).getText();
    System.out.println("Text added to alert box:: "+text);
    
    if (text.contains("Alex")) {
    	System.out.println("Text "+name+" was successfuly added!");
    }else {
    	System.out.println("Text "+name+" was not entered");
    }
    
	BaseClass.tearDown();
	
	
}
}
