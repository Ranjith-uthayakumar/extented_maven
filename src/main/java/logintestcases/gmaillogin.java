package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class gmaillogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjgyMTUzMjg3LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("ranjithlg10@gmail.com");
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("7200230471");
		
		WebElement Next2=driver.findElement(By.id("loginbutton"));
		Next2.click();
		
		WebElement reels=driver.findElement(By.xpath("//*[@id=\'mount_0_0_l4\']/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div[1]"));
		reels.click();
	}

}
