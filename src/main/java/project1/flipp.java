package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver\\\\chromedriver.exe");

        ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*"); 

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the Flipkart login page
        driver.get("https://www.flipkart.com/account/login");

        // Enter the email address and password
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("8526426719");
       // driver.findElement(By.cssSelector("input[type='password']._2IX_2-._3mctLh")).sendKeys("your_password");

        // Click the Login button
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")).click();

        // Wait for the page to load and verify that the user has been logged in
        String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Close the browser
        driver.quit();
	}

}
