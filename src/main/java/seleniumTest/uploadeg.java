package seleniumTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadeg {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");	
		
		WebElement upload=driver.findElement(By.id("j_idt88:j_idt89"));
		upload.click();
		
		//C:\Users\SPLPT 350\Desktop\test.xls
		
		StringSelection selection=new StringSelection("C:\\Users\\SPLPT 350\\Desktop\\test.xls");// it is mandatory for upload
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);           //getting clipboard data
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);                //paste option control + V 
		robot.keyPress(KeyEvent.VK_V);
	
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);              //release the ctrl+V    
		
		robot.keyPress(KeyEvent.VK_ENTER);                  //Press enter 
		robot.keyRelease(KeyEvent.VK_ENTER);               //release enter
	}

}
