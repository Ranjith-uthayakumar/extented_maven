package seleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperlinkeg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node01l8794y9lezitf1xol6m71mvd449558.node0");
		
		//go to home and back
		WebElement home= driver.findElement(By.linkText("Go to Dashboard"));
		home.click();
		driver.navigate().back();
		
		//Find the URL without clicking me.
		WebElement Wheretogo=driver.findElement(By.linkText("Find the URL without clicking me."));
		String Where=Wheretogo.getAttribute("href");
		System.out.println("This link is going to : " +Where);
		
		//broken
		WebElement broken=driver.findElement(By.linkText("Broken?"));
		broken.click();
		String title=driver.getTitle();
		if (title.contains("404")) {
		System.out.println("link is broken");	
		}
		driver.navigate().back();

		//Duplicate Link
		WebElement home1= driver.findElement(By.linkText("Go to Dashboard"));
		home1.click();
		driver.navigate().back();
		
		List<WebElement> totallinks=driver.findElements(By.tagName("a"));
		int linkcount = totallinks.size();
		System.out.println("Total links " +linkcount);
		
	}

}
