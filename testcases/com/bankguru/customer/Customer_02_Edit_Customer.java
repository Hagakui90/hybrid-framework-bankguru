package com.bankguru.customer;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

	public class Customer_02_Edit_Customer {
	@BeforeClass
	 public void beforeClass() {
		
	}
	
	//Verify Customer id
	@Test
	public void CustomerId_EC1_Empty() {
		
	}
	
	@Test
	public void CustomerId_EC2_Not_Numeric() {
		
	}
	
	@Test
	public void CustomerId_EC3_Special_Character() {
		
	}

	@Test
	public void CustomerId_EC4_Valid_Customer_ID() {
		
	}
	
	// Verify Address field
	@Test
	public void Adress_EC5_Empty() {
		
	}
		
	//Verify City field
	@Test
	public void City_EC6_Empty() {
		
	}
	
	@Test
	public void City_EC7_Not_Numeric() {
		
	}
	
	@Test
	public void City_EC8_Special_Character() {
		
	}
	
	
	// Verify State field
	@Test
	public void State_EC9_Empty() {
		
	}
	
	@Test
	public void State_EC10_Not_Numeric() {
		
	}
	@Test
	public void State_EC11_Special_Character() {
		
	}
	

	// Verify PIN field
	@Test
	public void PIN_EC12_Not_Numeric() {
		
	}
	@Test
	public void PIN_EC13_Empty() {
		
	}
	@Test
	public void PIN_EC14_Not_6_Digits() {
		
	}
	@Test
	public void PIN_EC15_Special_Character() {
		
	}
	
	// Verify Telephone field
	@Test
	public void Telephone_EC16_Empty() {
		
	}
	@Test
	public void Telephone_EC17_Special_Character() {
		
	}
	
	// Verify Email Field
	@Test
	public void Email_EC18_Empty() {
		
	}

	@Test
	public void Email_EC19_Wrong_Format() {
		
	}

	@AfterClass
	public void afterClass() {
		
	}

}
