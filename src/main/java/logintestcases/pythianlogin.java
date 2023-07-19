package logintestcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pythianlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://3.111.59.51/testing/Pythian/#/login");
		
		WebElement username=driver.findElement(By.xpath("//*[@id=\'loginpage\']/div/div/div[2]/div/form/fieldset[1]/input"));
		username.sendKeys("superadmin@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\'loginpage\']/div/div/div[2]/div/form/fieldset[2]/input"));
		password.sendKeys("Admin147");
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\'loginpage\']/div/div/div[2]/div/form/button"));
		submit.click();
		
		WebElement User = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[1]/div/div/div/div[1]/div[2]/ul/li[3]/a/span[3]")));
		User.click();
		
		WebElement adduser=driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[1]/div/div/div/div[1]/div[2]/ul/li[3]/ul/li[1]/a"));
		adduser.click();
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[1]/div[1]/div/div/div[2]/input"));
		firstname.sendKeys("ranjith");
		
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div[2]/input"));
		lastname.sendKeys("uthay");
		
		WebElement drop1 = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[1]/div[3]/div/div/div[2]/select"));
		drop1.sendKeys("uthay");
		Select select = new Select(drop1);
		List<WebElement> listofoptions = select.getOptions();
		int size= listofoptions.size();
		System.out.println("No of elements :" + size);
		select.selectByIndex(1);
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[1]/div[4]/div/div/div[2]/input"));
		email.sendKeys("ranjithut@gmail.com");
		
		WebElement Primarymob = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[1]/div[5]/div/div/div[2]/div/input"));
		Primarymob.sendKeys("5555555558");
		
		WebElement secondarymob = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[1]/div[6]/div/div/div[2]/div/input"));
		secondarymob.sendKeys("5555555559");
		
		WebElement genderdrop = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[1]/div[7]/div/div/div[2]/select"));
		genderdrop.sendKeys("Male");
		
		WebElement Day = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[1]/div[8]/div/div/div[2]/div/div[1]/select"));
		Day.sendKeys("5");
		
		WebElement Month = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[1]/div[8]/div/div/div[2]/div/div[2]/select"));
		Month.sendKeys("March");
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[1]/div[8]/div/div/div[2]/div/div[3]/select"));
		year.sendKeys("1996");
		
		WebElement Education  = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div[2]/select"));
		Education.sendKeys("Highschool");
		
		WebElement Occupation   = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div[2]/select"));
		Select select2 = new Select(Occupation);
		select2.selectByIndex(2);
		
		WebElement Country = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[2]/div[5]/div/div/div[2]/select"));
		Country.sendKeys("India");
		
		Thread.sleep(5000);
		WebElement State  = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[2]/div[6]/div/div/div[2]/select"));
		State.sendKeys("Tamil Nadu");
		
		Thread.sleep(5000);
		WebElement City  = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[2]/div[7]/div/div/div[2]/select"));
		City.sendKeys("Madurai");
		
		WebElement House = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[2]/div[3]/div/div/div[2]/input"));
		House.sendKeys("3/451");
		
		WebElement Pincode  = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[2]/div[4]/div/div/div[2]/input"));
		Pincode.sendKeys("630561");
		
		WebElement UserType  = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[2]/div[8]/div/select"));
		UserType.sendKeys("Artist");
		
		WebElement Category = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/input"));
		Category.sendKeys("Painting");
		
		WebElement Identity = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[5]/div[2]/div/div[1]/div/input"));
		String filePath2 = "C:\\Users\\SPLPT 350\\Downloads\\test_photo_1679564652.png";
		Identity.sendKeys(filePath2);
		
		WebElement Photograph  = driver.findElement(By.id("file"));
		String filePath1 = "C:\\Users\\SPLPT 350\\Downloads\\test_identity_1679564653 (1).png";
		Photograph.sendKeys(filePath1);
		
		WebElement OrderId  = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[6]/div[1]/div/div/div[2]/input"));
		OrderId.sendKeys("123");
		
		WebElement PaymentId   = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[6]/div[2]/div/div/div[2]/input"));
		PaymentId.sendKeys("123");
		
		WebElement PaymentSignature = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[6]/div[3]/div/div/div[2]/input"));
		PaymentSignature.sendKeys("123");
		
		WebElement Amount   = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/div[6]/div[4]/div/div/div[2]/input"));
		Amount.sendKeys("123");
		
		//WebElement submit = driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/div[3]/div/div/div[2]/div/div/div/div/a"));
		//submit.click();
	}
	

}
