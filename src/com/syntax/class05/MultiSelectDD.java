package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class MultiSelectDD {

	public static void main(String[] args) throws InterruptedException {
		//this is local drive not static bc we changed the baseclass. We did not extend Baseclass
		WebDriver driver=BaseClass.setUp();//In properties file, uncomment demoqa.com URL (code written for demoqa.com).
		WebElement multiSelectDD=driver.findElement(By.id("continentsmultiple"));
		
		Select select=new Select(multiSelectDD);
		
		boolean isMultiple=select.isMultiple();
		System.out.println("This DropDown is Multi Select?"+isMultiple);
		
		if (isMultiple) {
			select.selectByIndex(1);//selecting by index:
			select.selectByIndex(3);
			select.selectByVisibleText("Africa");//selecting by value
			Thread.sleep(2000);
			
			//select.deselectByIndex(1);
			select.deselectAll();
		}

	}

}
