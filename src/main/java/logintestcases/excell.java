package logintestcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excell {

			String [][] data=null;
		WebDriver driver;
		
		@DataProvider(name="logindata")
		public String [][] logindataprovider() throws BiffException, IOException {
			data = getExeldata();
			return data;
		}
		
		public String[][] getExeldata() throws BiffException, IOException {
			FileInputStream excel = new FileInputStream("C:\\Users\\SPLPT 350\\Desktop\\sample.xls");
			Workbook workbook=Workbook.getWorkbook(excel);
			Sheet sheet=workbook.getSheet(0);
			int rowcount = sheet.getRows();
			int columncount = sheet.getColumns();
			
			String testdata[][] = new String [rowcount-1][columncount];
			for(int i=1; i<rowcount; i++) {
				for(int j=0; j<columncount; j++) {
					testdata [i-1][j] =	sheet.getCell(j, i).getContents();
				}
			}
			return testdata;
		}
		@Test(dataProvider = "logindata")
		public void login(String uname, String pword) {
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();    
			options.addArguments("--remote-allow-origins=*"); 
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
			WebElement username=driver.findElement(By.id("username"));
			username.sendKeys(uname);
			
			WebElement Password=driver.findElement(By.id("password"));
			Password.sendKeys(pword);
			
			WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\'submit\']"));
			loginbutton.click();
			driver.quit();
	}}


