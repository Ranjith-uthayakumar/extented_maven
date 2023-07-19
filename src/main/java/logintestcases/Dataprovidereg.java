package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidereg {
	
	String [][] data={
			{"Admin","admin123"},
			{"admin123","admin12"},
			{"student1","admin123"},
			{"student","admin12"}
	};
	
	
	@DataProvider(name="logindata")
	public String [][] logindataprovider() {
		return data;
	}
	
	@Test(dataProvider = "logindata")
	public void login(String uname, String pword) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys(uname);
		
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys(pword);
		
		WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\'submit\']"));
		loginbutton.click();
		driver.quit();

	}

}
