package com.syntax.SeleniumReview1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class PracticingWIthDropdowns extends BaseClass{
//browser is syntaxpractice
	public static void main(String[] args) {
	setUp();//will bring webpage
	
    //import List from java util
	List<WebElement>allDDs=driver.findElements(By.tagName("a"));//capture all DDS
	for (WebElement oneDD:allDDs) {
		String dd=oneDD.getText();
		System.out.println(dd);
		//we want to click on the list box for the browser
		if(dd.equals("List Box")) {
			oneDD.click();
			
		}
		if(dd.equals("Bootstrap List Box")) {
    		oneDD.click();
    		break;
		}
	}
	//to click on bootstrap list under list box
	List<WebElement> listOfDD=driver.findElements(By.tagName("li"));
    for (WebElement oneItem:listOfDD) {
    	String item=oneItem.getText();
    
    	if(item.equals("Morbi leo risus")) {
    		oneItem.click();
    		break;
    	}
    }
	}
}


