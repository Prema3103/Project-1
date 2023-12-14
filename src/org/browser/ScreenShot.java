package org.browser;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class ScreenShot {
	 		
	public static void main(String[] args) throws InterruptedException, IOException {
		//To configure the browser
       System.setProperty("webdriver.chrome.driver","C:\\Users\\prema\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
       
  // InterfaceName refName=new In terfaceChildClass 
       
       WebDriver driver=new ChromeDriver();
       //To launch the browser 
       
         driver.get("https://www.amazon.in/");
         
           driver.manage().window().maximize();
           
       //Typecasting
           
    TakesScreenshot ts=(TakesScreenshot) driver;
    
    File sourceFile = ts.getScreenshotAs(OutputType.FILE);
    
     File targetfile= new File("C:\\Users\\prema\\Downloads\\javafiles\\julybatch.jpeg");
     
    
     FileUtils.copyFile(sourceFile,targetfile);
     
     
     //  Shutterbug
     Shutterbug.shootPage(driver,Capture.FULL,true).save("Downloads//hp.jpeg");
     
     
     
     
     
}
}