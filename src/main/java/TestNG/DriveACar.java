package TestNG;

import org.testng.annotations.Test;

public class DriveACar {
	
	@Test(priority=0)
	public void startthecar() {
		System.out.println("Start the car");
	}
	@Test(priority=1)
	public void firstgear() {
		System.out.println("first gear");
	}
	@Test(priority=2)
	public void secondgear() {
		System.out.println("second gear");
	}
	@Test(priority=3)
	public void thirdgear() {
		System.out.println("third gear");
	}
	@Test(priority=4)
	public void fourthgear() {
		System.out.println("fourth gear");
	}


}
