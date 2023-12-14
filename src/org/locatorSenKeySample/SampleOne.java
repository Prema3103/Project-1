package org.locatorSenKeySample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleOne {
	
	public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","C:\\Users\\prema\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
      
       WebDriver driver=new ChromeDriver();
       
         driver.get("https://adactinhotelapp.com/");
         
         driver.manage().window().maximize();
         // To inspect the user name
         
         WebElement username = driver.findElement(By.id("username"));
          //To enter the value in username
         
         username.sendKeys("prema");
         
         //To inspect the password
         
         WebElement password=driver.findElement(By.id("password"));
         
        // to enter the value in password
         
         password.sendKeys("ram1010!");
         
         
          
           
		
	}


}

























































































