package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLanch {
	
	public static void main(String[] args) {
		//To configure the browser
       System.setProperty("webdriver.chrome.driver","C:\\Users\\prema\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
       
  // InterfaceName refName=new In terfaceChildClass 
       
       WebDriver driver=new ChromeDriver();
       //To launch the browser 
       
      // driver.get("https://pay.google.com");
       //driver.get(" https://www.meesho.com");
       //driver.get("https://in.linkedin.com");
      // driver.get(" https://web.telegram.org");
       //driver.get(" https://zoom.us");
         driver.get(" https://www.facebook.com");
         
         // To maximize the windows
         
         driver.manage().window().maximize();
         
         //To inspect the UserName
         
          WebElement username = driver.findElement(By.id("email"));
          
          //To enter value in username
          
          username.sendKeys("prema");
          
           
          
         
         
         
       
	}

}
 