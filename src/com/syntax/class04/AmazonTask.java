package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {
	public static String url ="https://www.amazon.com/";
    public static void main(String[] args) throws InterruptedException {
    
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        
        List<WebElement> amazonLinks = driver.findElements(By.tagName("a"));
        System.out.println("all links of amazon "+amazonLinks.size());
        int count =0;
        for(WebElement links : amazonLinks) {
            String text = links.getText();
            if(!text.isEmpty()) {
                System.out.println(text);
                count++;
            }
        }
        
        System.out.println("size of all links of amazon with text "+count);
        Thread.sleep(2000);
        driver.quit();
    }

}
