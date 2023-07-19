package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class exceleg {
	String [][] data=null;
	WebDriver driver;
	
	@DataProvider(name="logindata")
	public String [][] logindataprovider() throws BiffException, IOException {
		data=getexceldata();
		return data;
	}
	
	public String[][] getexceldata() throws BiffException, IOException {
		
		FileInputStream excel=new FileInputStream("C:\\Users\\SPLPT 350\\Desktop\\testdata.xls");
		Workbook workbook= Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowcount=sheet.getRows();
		int columncount=sheet.getColumns();
		
		String testdata[][]= new String[rowcount-1][columncount];
		
		for(int i=1; i<rowcount; i++) {
			for(int j=0; j<columncount; j++) {
				testdata[i-1][j]=sheet.getCell(j, i).getContents();
			}
		}
		return testdata;
	}
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	
	@Test(dataProvider = "logindata")
	public void login(String uname, String pword) {
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys(uname);
		
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys(pword);
		
		WebElement loginbutton=driver.findElement(By.id("submit"));
		loginbutton.click();
}
}