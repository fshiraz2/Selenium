package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		//call the setup method 
		setUp();
		driver.manage().window().maximize();//to maximize window
		String text=driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		System.out.println(text);
		/*
		 * 3 Ways to call frame---> 1)By index2)By NameOrID 3)By WebElement
		 */
		
		//first way to switch to frame (INDEX):
		driver.switchTo().frame(0);//switch to a frame index 0 bc first frame in inspect
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Vital");;
		driver.switchTo().defaultContent();//switch to the original form
		Thread.sleep(2000);
		
		//second way to switch to frame(NameOrID):
		driver.switchTo().frame("iframe_a");//switch method used to add frame using the name
		name.clear();
		driver.findElement(By.id("name"));
		name.sendKeys("Sarmed");
		driver.switchTo().defaultContent();//will take focus back to main window/page/default content
		
		//third way to switch to frame(WebElement):
		WebElement firstFrame=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(firstFrame);
		name.clear();
		name.sendKeys("Asel");
		driver.switchTo().defaultContent();//will take focus back to main window/page/default conten
	
		
		Thread.sleep(3000);
		tearDown();
		

	}

}
