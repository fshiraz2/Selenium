package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    //get the url
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();//will maximize the screen
    
    
   WebElement department= driver.findElement(By.id("searchDropdownBox"));
   Select select=new Select(department);
   
   List<WebElement>departments=select.getOptions();
   System.out.println("Number of departments are "+departments.size());
   
   //select by index 
  // select.selectByIndex(11);
   
   Thread.sleep(3000);
   
   //select by value
  // select.selectByValue("search-alias=fashion-mens");
   
   //select by visible text
   select.selectByVisibleText("Books");

  
   
   //driver.close();
	}

}
