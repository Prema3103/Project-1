package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\prema\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
       
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://www.swiggy.com/");
       
       // To maximize the windows
       
       driver.manage().window().maximize();
       
       //To inspect the UserName         
       
        WebElement location = driver.findElement(By.id("location"));    
        
        location.sendKeys("prema"); 
        
        
 
       
	}
}
