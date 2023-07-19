package seleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableseg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/grid.xhtml");

		List<WebElement> column=driver.findElements(By.tagName("th"));
		int columnsize=column.size();
		System.out.println("Column number is " +columnsize);
		
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		int rowsize=row.size();
		System.out.println("row number is " +rowsize);

	
	}

}
