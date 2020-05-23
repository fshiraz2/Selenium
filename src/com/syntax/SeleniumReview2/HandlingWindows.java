package com.syntax.SeleniumReview2;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//we want to open a window, then a child window , then close the parent window, then get the text from child window
public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.seleniumframework.com/Practiceform/");
			WebElement newBrowserTabButton= driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
			newBrowserTabButton.click();
			//we need to switch the focus to the newer window bc it will go away with the other window
			//you have to always do this when  you have 2 windows and you close one(before closing)
			String parentWindow=driver.getWindowHandle();//-->getting parent  window ID
			System.out.println(parentWindow);
		    Thread.sleep(2000);//2 sec pause
			driver.close();//close first browser
		
			//getting all teh window handles
			Set<String> allWindows=driver.getWindowHandles();
			Iterator<String>it=allWindows.iterator();//-->iterating through the windows
			
			while(it.hasNext()) {//while if there is any other window handle coming up, we can execute the while loop
				String childWindow=it.next();//we have our child window
				//how to do switch to window?
				if(!parentWindow.equals(childWindow)) {//if parent is not equal to child
					driver.switchTo().window(childWindow);
				}
			}
			WebElement header=driver.findElement(By.xpath("//strong[contains(text(),'Agile Testing')]"));
			String headerText=header.getText();
			System.out.println(headerText);//we get the text from the second window

	}

}
