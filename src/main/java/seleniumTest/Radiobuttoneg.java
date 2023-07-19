package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttoneg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//check the default selected button 
		WebElement unchecked= driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[2]/div/div[2]/span"));
		WebElement checked= driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]/span"));
		
		boolean status1=unchecked.isSelected();
		boolean status2=checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		//clicking the radio button
		WebElement below20= driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/div/div[2]/span"));
		below20.click();

	}

}
