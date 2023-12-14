package org.browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	

		
		public static void main(String[] args) throws InterruptedException {
			//To configure the browser
	       System.setProperty("webdriver.gecko.driver","C:\\Users\\Documents\\chromedriver_win64\\chromedriver.exe");
	       
	  // InterfaceName refName=new In terfaceChildClass 
	       
	       WebDriver driver=new ChromeDriver();
	       //To launch the browser 
	       
	         driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	         
	           driver.manage().window().maximize();
	           //simple alert
	           
	           driver.findElement(By.name("alertbox")).click();
	           
	           //to handle simple alert
	           
	           Alert simplealert=driver.switchTo().alert();
	           
	           Thread.sleep(5000);
	           
	            simplealert.accept();
	            
	            driver.findElement(By.name("confirmalertbox")).click();
	            
	           // To handle confirm alert
	           
	           Alert confirmalert=driver.switchTo().alert();
	           
	           Thread.sleep(5000);
	           
	          confirmalert.dismiss();
	           
	           driver.findElement(By.name("promptalertbox1234")).click();
	           
	           //to handle prompt alert
	           
	           Alert promptalert=driver.switchTo().alert();
	           
	           Thread.sleep(5000);
	           
	           promptalert.sendKeys("yes");
	           
	           promptalert.accept();
	           
	            
	}

}
