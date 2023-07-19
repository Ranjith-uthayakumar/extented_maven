package logintestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class pythianregistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();    
			options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://3.111.59.51/testing/Pythian/#/register");
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[1]/div/input"));
		firstname.sendKeys("ranjith");
		
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[2]/div/input"));
		lastname.sendKeys("uthay");
	
		WebElement drop1 = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[3]/div/select"));
		drop1.sendKeys("uthay");
		Select select = new Select(drop1);
		List<WebElement> listofoptions = select.getOptions();
		int size= listofoptions.size();
		System.out.println("No of elements :" + size);
		select.selectByIndex(1);

		WebElement email = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[4]/div/input"));
		email.sendKeys("ranjithut@gmail.com");
		
		WebElement Primarymob = driver.findElement(By.xpath("//*[@id='registrationpage']/div/div[2]/form/div[2]/div[1]/div/div[5]/div/div/input"));
		Primarymob.sendKeys("5555555558");
		
		WebElement secondarymob = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[6]/div/div/input"));
		secondarymob.sendKeys("5555555559");
		
		WebElement genderdrop = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[7]/div/select"));
		genderdrop.sendKeys("Male");
		
		WebElement Day = driver.findElement(By.xpath("//*[@id='registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[8]/div/div/div[1]/select"));
		Day.sendKeys("5");
		
		WebElement Month = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[8]/div/div/div[2]/select"));
		Month.sendKeys("March");
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[8]/div/div/div[3]/select"));
		year.sendKeys("1996");
		
		WebElement Next1 = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[2]/a[2]"));
		Next1.click();
		
		WebElement Education  = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[1]/div/select"));
		Education.sendKeys("Highschool");
		
		WebElement Occupation   = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[2]/div/select"));
		Select select2 = new Select(Occupation);
		select2.selectByIndex(2);
		
		WebElement Country = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[3]/div/select"));
		Country.sendKeys("India");
		
		Thread.sleep(5000);
		WebElement State  = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[4]/div/select"));
		State.sendKeys("Tamil Nadu");
		
		Thread.sleep(5000);
		WebElement City  = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[5]/div/select"));
		City.sendKeys("Madurai");
		
		WebElement House = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[6]/div/input"));
		House.sendKeys("3/451");
		
		WebElement Pincode  = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[7]/div/input"));
		Pincode.sendKeys("630561");
		
		WebElement UserType  = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div/div[8]/div/select"));
		UserType.sendKeys("Artist");
		
		WebElement Category = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div[2]/div[1]/div/input"));
		Category.sendKeys("Painting");
		
		WebElement Next2 = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[2]/a[2]"));
		Next2.click();
		
		WebElement Next3 = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[2]/a[2]"));
		Next3.click();
		
		WebElement Identity = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/form/div[2]/div[1]/div[2]/div/div[1]/div/input"));
		String filePath2 = "C:\\Users\\SPLPT 350\\Downloads\\test_photo_1679564652.png";
		Identity.sendKeys(filePath2);
		
		WebElement Photograph  = driver.findElement(By.id("file"));
		String filePath1 = "C:\\Users\\SPLPT 350\\Downloads\\test_identity_1679564653 (1).png";
		Photograph.sendKeys(filePath1);
		
		WebElement check = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[1]/div[3]/div[1]/div/label"));
		check.click();
		
		//WebElement submit = driver.findElement(By.xpath("//*[@id=\'registrationpage\']/div/div[2]/form/div[2]/div[2]/a[2]"));
		//submit.click();
		
	}

}
