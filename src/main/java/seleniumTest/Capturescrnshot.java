package seleniumTest;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Capturescrnshot {

	private static final TakesScreenshot element = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*"); 
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://sportingindia.com/");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotBase64 = ((TakesScreenshot) element).getScreenshotAs(OutputType.BASE64);
	}

}
