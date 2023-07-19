package seleniumTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowseg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/window.xhtml");
		
		String oldwindow=driver.getWindowHandle();
		
		//new Window Opens
		WebElement firstbutton= driver.findElement(By.id("j_idt88:new"));
		firstbutton.click();
		
		Set<String>handles= driver.getWindowHandles();
		
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Ranjithuthay1996@gmail.com");
		driver.close();
		
		driver.switchTo().window(oldwindow); //moved to oldwindow
		
		WebElement openmultiple=driver.findElement(By.id("j_idt88:j_idt91"));
		openmultiple.click();
		
        int numberofwindows=driver.getWindowHandles().size();
        System.out.println("No.of.windows opened :" +numberofwindows);
        
        WebElement closebutton=driver.findElement(By.id("j_idt88:j_idt93"));
        closebutton.click();
        
        Set<String>newwindowhandles= driver.getWindowHandles();
        for (String allwindow : newwindowhandles) {
			if(!allwindow.equals(oldwindow)){
				driver.switchTo().window(allwindow);
				driver.close();
			}
		}
        
		}
		

	}


