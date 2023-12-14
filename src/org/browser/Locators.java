package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
				
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Documents\\chromedriver_win64\\chromedriver.exe");
	       
		  // InterfaceName refName=new In terfaceChildClass 
		       
		       WebDriver driver=new ChromeDriver();
		       
		       driver.get("http://www.Facebook.com/");

	}

}
