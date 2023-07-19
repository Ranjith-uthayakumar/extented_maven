package seleniumTest;

import java.net.ProxySelector;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		//select drop down by using index and visible text
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(dropdown);
		select.selectByIndex(4);
		select.selectByVisibleText("Playwright");
		//select.selectByValue("Value no in inspect");
		
		//get no of elements 
		List<WebElement> listofoptions = select.getOptions();
		int size= listofoptions.size();
		System.out.println("No of elements :" + size);
		
		//select by send keys 
		dropdown.sendKeys("Puppeteer");
		
		//Multiselect
		/*WebElement multiselect=driver.findElement(By.xpath("Xpath"));
		Select multiselectbox= new Select(multiselect);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);	*/

}}
