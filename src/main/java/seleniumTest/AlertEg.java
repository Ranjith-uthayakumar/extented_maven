package seleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//simple alert with ok vutton
		WebElement alertbox = driver.findElement(By.id("j_idt88:j_idt91"));
		alertbox.click();
		Alert alertt= driver.switchTo().alert();
		alertt.accept();
		
		//alert with both ok and cancel button
		WebElement confirm = driver.findElement(By.id("j_idt88:j_idt93"));
		confirm.click();
		Alert confirmAlert=driver.switchTo().alert();
		confirmAlert.dismiss();
		
		//alert with text box (prompt button) and ok 
		WebElement prompt = driver.findElement(By.id("j_idt88:j_idt104"));
		prompt.click();
		Alert promptalert=driver.switchTo().alert();
		promptalert.sendKeys("Ranjith");
		promptalert.accept();
		

	}

}
