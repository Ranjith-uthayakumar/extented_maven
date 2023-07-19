package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sfi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://35.154.131.100/SFI_ORS/athlete/register");
		
		//personal info
		
		WebElement closebutton=driver.findElement(By.xpath("/html/body/div[1]/div/h1/span"));
		closebutton.click();
		
		WebElement firstname=driver.findElement(By.id("firstname"));
		firstname.sendKeys("ranjith");
		
		WebElement lastname=driver.findElement(By.id("familyname"));
		lastname.sendKeys("uthay");
		
		WebElement drop1=driver.findElement(By.id("dob_day"));
		drop1.sendKeys("5");
		WebElement drop2=driver.findElement(By.id("dob_month"));
		drop2.sendKeys("mar");
		WebElement drop3=driver.findElement(By.id("dob_year"));
		drop3.sendKeys("1996");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("12@gmail.com");
		WebElement reemail=driver.findElement(By.id("confirm"));
		reemail.sendKeys("12@gmail.com");
		
		WebElement mob1=driver.findElement(By.id("mobile"));
		mob1.sendKeys("8526426719");
		WebElement mob2=driver.findElement(By.id("confirmmobile"));
		mob2.sendKeys("8526426719");
		
		WebElement next=driver.findElement(By.xpath("//*[@id=\"Next\"]/span"));
		next.click();

		
		//parent info
	/*	WebElement FatherName=driver.findElement(By.id("fathername"));
		 FatherName.sendKeys("uthayakumar");
		 
		 WebElement mothername=driver.findElement(By.id("mothername"));
		 mothername.sendKeys("balaveni");
		 
		 WebElement guardianoccupation=driver.findElement(By.id("guardianoccupation"));
		 guardianoccupation.sendKeys("Others");
		 
		 WebElement guardianmobile=driver.findElement(By.id("guardianmobile"));
		 guardianmobile.sendKeys("9788185269"); WebElement
		 guardianmobile1=driver.findElement(By.id("guardianremobile"));
		 guardianmobile1.sendKeys("9788185269");
		 
		 WebElement guardianemail=driver.findElement(By.id("guardianemail"));
		 guardianemail.sendKeys("1233@gmail.com"); 
		 WebElement guardianemail1=driver.findElement(By.id("guardianreenteremail"));
		 guardianemail1.sendKeys("1233@gmail.com");*/
		 
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.id("back"));
		button.click();
		
		WebElement next1=driver.findElement(By.xpath("//*[@id=\"Next\"]/span"));
		next1.click();

		WebElement button1=driver.findElement(By.id("next"));
		button1.click();
	}

}
