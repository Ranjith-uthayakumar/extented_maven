package seleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class frameeg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/frame.xhtml");

		driver.switchTo().frame(0);
		WebElement clickme=driver.findElement(By.xpath("//*[@id=\'Click\']"));
		clickme.click();
		
		String text=driver.findElement(By.xpath("//*[@id=\'Click\']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent(); //only in iframe
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2=driver.findElement(By.id("//*[@id=\'Click\']"));
		button2.click();
		
		driver.switchTo().defaultContent(); //only in iframe
		
		List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
		int size=totalframe.size();
		System.out.println(size);
		
	}

}
