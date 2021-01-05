package com.Metro.SeleniumJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



/**
 * Hello world!
 *
 */
public class App 
{
	
	WebDriver driver = null;
	JavascriptExecutor js = null;
	String orderno;

	

	@BeforeTest public void setUp() {
	

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		

}
	@Test public void fblogin() throws InterruptedException {
		   driver.get("https://www.facebook.com/r.php");
	        
	        driver.findElement(By.xpath("//*[@id='u_0_n']")).sendKeys("Hithesh");
	        driver.findElement(By.xpath("//*[@id='u_0_p']")).sendKeys("Seedarla");
	        Thread.sleep(7000);

	}
	@AfterTest
	public void quitBrowser() {
		driver.close();
	}
	
}
