package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		driver.findElement(By.id("j_idt88:name")).sendKeys("Ranjith");
		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']")).sendKeys("uthay");
		String value = driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(value);
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\'j_idt88\']/div[3]/div"));
		boolean enabled= disabledbox.isEnabled();
		System.out.println(enabled);

	}

}
