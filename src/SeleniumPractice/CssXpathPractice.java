package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssXpathPractice {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("email")).sendKeys("fargolshirazi@gmail.com");
	
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("pass")).sendKeys("123456");
	
	//driver.findElement(By.xpath("//input[@value='Log In']")).click();       //XPATH
	driver.findElement(By.cssSelector("input[value='Log In']")).click();     //CSS
	

	
	


	
	driver.close();
			

	}

}
