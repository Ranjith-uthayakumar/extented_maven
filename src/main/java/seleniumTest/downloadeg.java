package seleniumTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadeg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fastest.fish/test-files");	
		
		WebElement download= driver.findElement(By.xpath("//*[@id=\'vue\']/table/tbody/tr[1]/td[1]/a"));
		download.click();
		
		File filelocation=new File("C:\\Users\\SPLPT 350\\Downloads");
		File[] totalfiles = filelocation.listFiles();
		
		for (File file : totalfiles) {
			
			if (file.getName().equals("Karnataka_Credentials.xls")) {
				System.out.println("file is downloaded");
				break;
			}
			
		}
		

	}

}
