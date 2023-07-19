package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SFICOACH {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();    
			options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
	driver.get("http://35.154.131.100/SFI_ORS/coach/register");
	

	WebElement closebutton=driver.findElement(By.xpath("/html/body/div[1]/div/h1/span"));
	closebutton.click();
	
	WebElement firstname=driver.findElement(By.id("firstname"));
	firstname.sendKeys("ranjith");
	
	WebElement lastname=driver.findElement(By.id("familyname"));
	lastname.sendKeys("uthay");
	
	WebElement drop1=driver.findElement(By.id("dob"));
	drop1.sendKeys("05-03-1996");
	
	WebElement fathername=driver.findElement(By.id("fathername"));
	fathername.sendKeys("12@gmail.com");
	WebElement mothername=driver.findElement(By.id("mothername"));
	mothername.sendKeys("12@gmail.com");
	
	WebElement email1=driver.findElement(By.id("email"));
	email1.sendKeys("12@gmail.com");
	WebElement email2=driver.findElement(By.id("confirm"));
	email2.sendKeys("12@gmail.com");
	
	WebElement mob1=driver.findElement(By.id("mobile"));
	mob1.sendKeys("8526426719");
	WebElement mob2=driver.findElement(By.id("confirmmobile"));
	mob2.sendKeys("8526426719");
	
	WebElement next=driver.findElement(By.xpath("//*[@id=\'Next\']"));
	next.click();
	
	driver.manage().window().maximize();
	Actions a = new Actions(driver);
	a.sendKeys(Keys.PAGE_DOWN).build().perform();
	
	WebElement next1=driver.findElement(By.className("next-button text-center mt-1 ml-2"));
	next1.click();
	driver.navigate().back();
}}
