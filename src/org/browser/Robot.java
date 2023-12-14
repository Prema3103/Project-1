package org.browser;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot {
	
	public static void main(String[] args) throws InterruptedException {
		//To configure the browser
		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\prema\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
       
  // InterfaceName refName=new In terfaceChildClass 
       
       WebDriver driver=new ChromeDriver();
       //To launch the browser 
       driver.get("https://www.facebook.com/");
       
       driver.manage().window().maximize();
       
       driver.findElement(By.id("email")).sendKeys("palacode");
       
       Robot robot=new Robot();
         
       robot.k
      
       
       
       
       
   
       
       

}

	
		
	}
}