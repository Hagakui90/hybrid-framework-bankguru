package com.bankguru.account;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

	public class Account_06_Fund_Transfer {
	@BeforeClass
	 public void beforeClass() {
		
	}
	
	//Verify Bank code
	@Test
	public void BankCode_FT1_Empty() {
		
	}
	
	@Test
	public void BankCode_FT2_Special_Character() {
		
	}
	
	@Test
	public void BankCode_FT3_1st_Blank_Space() {
		
	}
	
	//Verify Payers account number field
	@Test
	public void PayerAccountNumber_BankCode_FT4_Empty() {
		
	}
	
	@Test
	public void PayerAccountNumber_BankCode_FT5_Not_Numeric() {
		
	}
	
	@Test
	public void PayerAccountNumber_BankCode_FT6_Special_Character() {
		
	}
	
	
	//Verify Payee account number field
	@Test
	public void PayeeAccountNumber_FT7_Empty() {
		
	}
	
	@Test
	public void PayeeAccountNumber_FT8_Not_Numeric() {
		
	}
	
	@Test
	public void PayeeAccountNumber_FT9_Special_Character() {
		
	}
	
	//Verify Amount field
	@Test
	public void Amount_FT10_Empty() {
		
	}
	
	@Test
	public void Amount_FT11_Not_Numeric() {
		
	}
	
	@Test
	public void Amount_FT12_Special_Character() {
		
	}

	@AfterClass
	public void afterClass() {
		
	}

}
