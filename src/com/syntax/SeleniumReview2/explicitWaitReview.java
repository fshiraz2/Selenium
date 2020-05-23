package com.syntax.SeleniumReview2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitReview {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		driver.manage().window().maximize();
		WebElement startDownloadButton=driver.findElement(By.cssSelector("button[id='downloadButton']"));
		startDownloadButton.click();
		//we want to get the text that says download complete!
		WebDriverWait wait=new WebDriverWait(driver,20);//explicit wait for  20 sec
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Complete!']")));
		
		WebElement completeStatus=driver.findElement(By.xpath("//div[text()='Complete!']"));
		String completeStatusText=completeStatus.getText();
		System.out.println(completeStatusText);
		
		//we want to close the download button 
		WebElement closeButton=driver.findElement(By.xpath("//button[text()='Close']"));
		//reuse the explicitwait
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));
		closeButton.click();//after download it will click on close
		
		

	}

}
