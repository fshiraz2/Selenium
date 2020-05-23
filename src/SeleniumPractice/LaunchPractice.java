package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("gb_70")).click();
	    		
	    driver.findElement(By.id("identifierId")).sendKeys("owlala18@gmail.com");
		
	    driver.findElement(By.className("CwaK9")).click();
	    		
	    Thread.sleep(3000);
	    
	    driver.navigate().to("https://www.facebook.com/");
	    
	    driver.navigate().back();
	    
	    driver.navigate().forward();
	    
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    
	    driver.close();

	}

}
