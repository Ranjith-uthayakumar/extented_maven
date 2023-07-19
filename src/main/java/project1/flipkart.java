package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.http.ConnectionFailedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flipkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.landmark.edu/dummy-page/dummy-form-testing");
		
		WebElement radio1=driver.findElement(By.id("form-input-iAmA-1"));
		radio1.click();
		
		WebElement radio2=driver.findElement(By.id("form-input-requesterType-1"));
		radio2.click();
		
		WebElement firstname=driver.findElement(By.id("form-input-firstName"));
		firstname.sendKeys("Ranjith");
		
		WebElement lastname=driver.findElement(By.id("form-input-lastName"));
		lastname.sendKeys("uthay");
		
		WebElement email=driver.findElement(By.id("form-input-email"));
		email.sendKeys("ranjith@gmail.com");
		
		WebElement phone=driver.findElement(By.id("form-input-primaryPhone"));
		phone.sendKeys("8526426719");
		
		WebElement add1=driver.findElement(By.id("form-input-streetAddress"));
		add1.sendKeys("3/451");

		WebElement add2=driver.findElement(By.id("form-input-apartment"));
		add2.sendKeys("great");
		
		WebElement add3=driver.findElement(By.id("form-input-city"));
		add3.sendKeys("sivaganga");
		
		WebElement territory=driver.findElement(By.xpath("//*[@id=\"content\"]/article[1]/form/div[9]/div[2]/span"));
		Select select = new Select(territory);
		select.selectByVisibleText("albama");
		
		WebElement pin=driver.findElement(By.id("form-input-zip"));
		pin.sendKeys("630562");
		
		WebElement country=driver.findElement(By.xpath("//*[@id=\'content\']/article[1]/form/div[10]/div/span/span[1]"));
		country.sendKeys("india");
		
		WebElement Enrollment =driver.findElement(By.xpath("//*[@id=\'content\']/article[1]/form/div[12]/div[1]/span/span[1]"));
		Enrollment.sendKeys("spring 2022");
		

		WebElement Academic  =driver.findElement(By.xpath("//*[@id=\'content\']/article[1]/form/div[12]/div[2]/span/span[1]"));
		Academic.sendKeys("life");
		
		WebElement GDPR =driver.findElement(By.id("form-input-gdprLocatedinEU-1"));
		GDPR.click();
		
		WebElement GDPRMay =driver.findElement(By.id("form-input-gdprConsentProvided-1"));
		GDPRMay.click();
		
		WebElement GDPRContact =driver.findElement(By.id("form-input-gdprConsentMethod-1"));
		GDPRContact.click();
	
		WebElement GDPRContact1 =driver.findElement(By.id("form-input-gdprConsentMethod-2"));
		GDPRContact1.click();
		
		WebElement ok  =driver.findElement(By.xpath("//*[@id=\'recaptcha-anchor\']/div[1]"));
		ok.click();
		
		WebElement submit  =driver.findElement(By.xpath("//*[@id=\'content\']/article[1]/form/div[19]/div/button"));
		submit.click();
	}
	

}
