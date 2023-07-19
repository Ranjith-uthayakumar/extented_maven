package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class pg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Set the path of the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		        ChromeOptions options=new ChromeOptions();    
				options.addArguments("--remote-allow-origins=*"); 
		        // Create a new instance of ChromeDriver
		        WebDriver driver = new ChromeDriver(options);

		        // Navigate to the registration form page
		        driver.get("http://3.111.59.51/testing/Pythian/#/guest/register/1");

		        // Fill in the registration form fields
		        WebElement firstNameField = driver.findElement(By.xpath("//*[@id=\"registrationpage\"]/div/div[2]/form/div[2]/div[1]/div[1]/div[1]/div/input"));
		        firstNameField.sendKeys("John");

		        WebElement lastNameField = driver.findElement(By.name("lastName"));
		        lastNameField.sendKeys("Doe");

		        WebElement emailField = driver.findElement(By.name("email"));
		        emailField.sendKeys("johndoe@example.com");

		        WebElement phoneField = driver.findElement(By.name("phone"));
		        phoneField.sendKeys("1234567890");

		        WebElement passwordField = driver.findElement(By.name("password"));
		        passwordField.sendKeys("password123");

		        WebElement confirmPasswordField = driver.findElement(By.name("confirmpassword"));
		        confirmPasswordField.sendKeys("password123");

		        // Select a value from the country dropdown
		        Select countryDropdown = new Select(driver.findElement(By.name("country")));
		        countryDropdown.selectByVisibleText("Canada");

		        // Select a value from the province dropdown
		        Select provinceDropdown = new Select(driver.findElement(By.name("province")));
		        provinceDropdown.selectByVisibleText("Ontario");

		        // Check the terms and conditions checkbox
		        WebElement termsCheckbox = driver.findElement(By.name("terms"));
		        termsCheckbox.click();

		        // Submit the form
		        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		        submitButton.click();

		        // Wait for the registration confirmation message to appear
		        WebElement confirmationMessage = driver.findElement(By.xpath("//div[contains(text(), 'Thank you for registering!')]"));
		        assert confirmationMessage.isDisplayed();

		        // Close the browser window
		        driver.quit();
		    }
		




	}


