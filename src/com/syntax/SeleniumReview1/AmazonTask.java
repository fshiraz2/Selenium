package com.syntax.SeleniumReview1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class AmazonTask extends BaseClass{
//	Go to amazon.com
//	 * select books from the search dropdown
//	 * type Harry potter
//	 * and click on Search
//	 * check Unofficial CookBook checkbox on the left under Book Series
	public static void main(String[] args) throws InterruptedException {
        setUp();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement department = driver.findElement(By.id("searchDropdownBox"));//in id
        Select select = new Select(department);
        List<WebElement> departments = select.getOptions();
        for (WebElement dep : departments) {
            String depts = dep.getText();
        
            select.selectByVisibleText("Books");
            if (depts.contentEquals("Books")) {
                dep.click();
                
                driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
                driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
                
                driver.findElement(By.xpath("//span[text()='Unofficial Cookbook']")).click();
            }
        }
        
        
        
        Thread.sleep(1000);
        tearDown();
    }
}
