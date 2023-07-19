package com.lao.step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;

public class common_step_definition {
	
	//launch browser
	
	public static WebDriver driver;
	
	@Before
	public void beforescenario() {
		try {
			
			if (driver==null) {
			launchBrowser();
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void launchBrowser() {
		try {
			switch ("Chrome") {
			case "Chrome": 
				System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
				ChromeOptions options=new ChromeOptions();    
				driver = new ChromeDriver (options);
				break;
				
				case "firefox":
					System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
					ChromeOptions options1=new ChromeOptions();    
					driver = new ChromeDriver (options1);
					break;
			
			default:
				System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
				ChromeOptions options2=new ChromeOptions();    
				driver = new ChromeDriver (options2);
				break;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
