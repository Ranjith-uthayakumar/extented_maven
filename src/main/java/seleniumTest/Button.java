package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		//get position
		WebElement getposition= driver.findElement(By.id("j_idt88:j_idt94"));
		Point xypoint=getposition.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("X value is :"+ xValue+ "Y value is :"+ xValue);

		//color button
		WebElement colorbutton= driver.findElement(By.id("j_idt88:j_idt96"));
		String color=colorbutton.getCssValue("background");
		System.out.println("Button color id :" +color);
		
		//Size button
		WebElement sizebutton= driver.findElement(By.id("j_idt88:j_idt98"));
		int height=sizebutton.getSize().getHeight();
		int width=sizebutton.getSize().getWidth();
		System.out.println("Height is :" +height + "Width is :" + width);
		
		//home button
		WebElement homebutton= driver.findElement(By.id("j_idt88:j_idt90"));
		homebutton.click();


	}

}
