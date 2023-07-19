package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxeg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		//1. normal click
		WebElement java= driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]"));
		java.click();
		
		//2.find whether the check box is clicked or not
	  /* WebElement sele= driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]"));
	    boolean selected=java.isSelected(); 
	   System.out.println(selected);
	   
	   //3.first element clicked 
	   WebElement firstelement= driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]"));
	   
	   if (firstelement.isSelected()) {
		   firstelement.click();
	   }
	   
	   //4.second element clicked
	   WebElement secondelement= driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]"));
	   
	   if (secondelement.isSelected()) {
		   secondelement.click();
	   } */
	}

}
