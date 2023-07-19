package pythian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pythianlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*"); 


        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the Pythian login page
        driver.get("http://3.111.59.51/testing/Pythian/#/login");

        // Enter the email address and password LOGIN FAILED
       // driver.findElement(By.xpath("//*[@id=\"loginpage\"]/div/div/div[2]/div/form/fieldset[1]/input")).sendKeys("your_email_address");
     //   driver.findElement(By.xpath("//*[@id=\"loginpage\"]/div/div/div[2]/div/form/fieldset[2]/input")).sendKeys("your_password");//

     // Enter the email address and password LOGIN successful
        driver.findElement(By.xpath("//*[@id=\"loginpage\"]/div/div/div[2]/div/form/fieldset[1]/input")).sendKeys("PYINTNUM1000001");
        driver.findElement(By.xpath("//*[@id=\"loginpage\"]/div/div/div[2]/div/form/fieldset[2]/input")).sendKeys("40223107");
        
        
        // Click the Login button
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Wait for the page to load and verify that the user has been logged in
        String expectedUrl = "http://3.111.59.51/testing/Pythian/#/user/dashboard";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Close the browser
        driver.quit();

	}

}
