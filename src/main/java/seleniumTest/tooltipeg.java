package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltipeg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/tooltip/#Forms%20Based");	
		
		WebElement firstname=driver.findElement(By.id("firstname"));
		String tooltip=firstname.getAttribute("title");
		System.out.println(tooltip);

	}

}
