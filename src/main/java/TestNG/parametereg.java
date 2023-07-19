package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametereg {
	@Test
	@Parameters("Name")
	public void printname(String name) {
		System.out.println("Name is " +name);
	}

}
