package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	
		//Aim: open chrome and go to
		//1. google 2.bing 3.yahoo
	
	WebDriver driver; 			// for common to all class
	long starttime; 			// for common to all start time
	long endtime; 				// for common to all end time
	
	@BeforeSuite
	public void launchbrowser() {

		starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void opengoogle() {
		driver.get("https://www.google.com/");
		
		}
	
	@Test
	public void openbing() {
		driver.get("https://www.bing.com/");
	}
	
	@Test
	public void openyahoo() {
		driver.get("https://www.yahoo.com/");
		
	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endtime=System.currentTimeMillis();
		long totaltime=endtime-starttime;
		System.out.println("total time taken " +totaltime);
	}
}
