package TestNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
	
	//Problem1: You have to admit a student to engg
	//Problem2: You have to admit a student to higher sec
	
	@Test (enabled = true)
	public void highschool() {
		System.out.println("highschool");
	}
	@Test(dependsOnMethods = "highschool")
	public void highersecondary() {
		System.out.println("highersecondary");
	}
	@Test(dependsOnMethods = "highersecondary")
	public void engg() {
		System.out.println("engg");
		
	}
}
