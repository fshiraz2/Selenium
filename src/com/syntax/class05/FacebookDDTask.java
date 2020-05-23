package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDDTask {
//	TC 1: Facebook dropdown verification
//	Open chrome browser
//	Go to “https://www.facebook.com”
//	Verify:
//	month dd has 12 month options
//	day dd has 31 day options
//	year dd has 115 year options
//	Select your date of birth	
//	Quit browser
	public static String url="https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        
        Select selectm=new Select(month);
        Select selectd=new Select(day);
        Select selecty=new Select(year);
        
        selectm.selectByVisibleText("Feb");
       	 selectd.selectByIndex(18);
        selecty.selectByValue("1997");
        
        System.out.println(selectm.isMultiple());
        
       Thread.sleep(2000);
       driver.close();
	}
}

