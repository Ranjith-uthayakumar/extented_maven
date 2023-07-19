package TestNG;

import org.testng.annotations.Test;

public class Groupingeg {
	
	/* 
	 Scenario: A big basket is having a different kind of mobiles.
	 Let us say there are apple phones, moti, vivo and lenovo.
	 I want to run tests only for vivo and moto phones
	 */
	@Test(groups= {"apple"})
	public void apple1(){
		System.out.println("Apple testing");
	}
	@Test(groups= {"apple"})
	public void apple2(){
		System.out.println("Apple testing");
	}
	@Test(groups= {"moto"})
	public void moto1(){
		System.out.println("Moto testing");
	}
	@Test(groups= {"moto"})
	public void moto2(){
		System.out.println("Moto testing");
	}
	@Test(groups= {"vivo"})
	public void vivo1(){
		System.out.println("vivo testing");
	}
	@Test(groups= {"vivo"})
	public void vivo2(){
		System.out.println("vivo testing");
	}
	@Test(groups= {"lenovo"})
	public void lenovo1(){
		System.out.println("lenovo testing");
	}
	@Test(groups= {"lenovo"})
	public void lenovo2(){
		System.out.println("lenovo testing");

}}
