package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class correctpassword {
	@Test
	@Parameters({"username", "password"})
	public void correctpasswordcred(String uname, String pword) {
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
			WebElement username=driver.findElement(By.name("username"));
			username.sendKeys(uname);
			
			WebElement Password=driver.findElement(By.name("password"));
			Password.sendKeys(pword);
			
			WebElement loginbutton=driver.findElement(By.id("submit"));
			loginbutton.click();
			driver.quit();

		
	}

}
