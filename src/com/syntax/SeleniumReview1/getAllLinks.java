package com.syntax.SeleniumReview1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class getAllLinks extends BaseClass{
	
public static void main(String[]args) {
	setUp();
	List<WebElement> allLinks=driver.findElements(By.tagName("a"));//will return list of elements
	//List needs to imported from JAVA UTIL
	int numOfLinks=allLinks.size();
	System.out.println(numOfLinks);
	//we want to capture every element and see in console by loop
	
	for (WebElement link:allLinks) {
		String textOfLinks=link.getText();//returns String
		String links=link.getAttribute("href");//we want to get url for each and every corresponding link
		System.out.println(textOfLinks+"--> "+links);//using STring concatenation
		
		
	}
}
}
