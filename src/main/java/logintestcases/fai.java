package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();    
			options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		try {
            // Navigate to the URL
            driver.get("https://dms.fencingindia.org/testfai/athlete/register");

            // Find the close button of the popup using XPath
            WebElement closeButton = driver.findElement(By.xpath("/html/body/div[1]/div/h1/span"));

            // Close the popup
            closeButton.click();

            // Wait for a while to let the page finish processing any actions
            Thread.sleep(2000);

            // Continue with the rest of your automation steps
            // ...

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }}}


