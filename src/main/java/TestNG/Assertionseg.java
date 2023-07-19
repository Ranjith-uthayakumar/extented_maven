package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionseg {
	
	String name="Ranjit";
	@Test
	public void checkequal() {
		//Assert.assertEquals(name, "Ranjit"); //equals                     //mostly for unit testing
		Assert.assertNotEquals(name, "ranjit"); //Not equals
	}

}
