package com.cg.mra.test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.mra.exception.AccountException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class TestClass {
	
	AccountService service = new AccountServiceImpl();
	
	//Test cases for Phone number
	@Test(expected=AccountException.class)
	public void test_ValidatePhoneNo_null() throws AccountException{
		service.validatePhoneNo(null);
	}
	@Test
	public void test_validatePhoneNo_v1() throws AccountException{
	
		String mobile="96857432s10";
		boolean result= service.validatePhoneNo(mobile);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validatePhoneNo_v2() throws AccountException{
	
		String mobile="78965412301";
		boolean result= service.validatePhoneNo(mobile);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validatePhoneNo_v3() throws AccountException{
	
		String mobile="0968541237";
		boolean result= service.validatePhoneNo(mobile);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validatePhoneNo_v4() throws AccountException{
		String mobile="6668541237";
		boolean result= service.validatePhoneNo(mobile);
		Assert.assertEquals(false,result);
	}
	
	//Test cases for recharge amount
	@Test(expected=AccountException.class)
	public void test_ValidateReAmt_zero() throws AccountException{
		service.validateRechargeAmt(0);
	}
	@Test
	public void test_validateReAmt_v1() throws AccountException{
		double amt=10;
		boolean result= service.validateRechargeAmt(amt);
		Assert.assertEquals(true,result);
	}
	@Test
	public void test_validateReAmt_v2() throws AccountException{
		double amt=997.04;
		boolean result= service.validateRechargeAmt(amt);
		Assert.assertEquals(true,result);
	}
	@Test
	public void test_validateReAmt_v3() throws AccountException{
		double amt=-200;
		boolean result= service.validateRechargeAmt(amt);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validateReAmt_v4() throws AccountException{
		double amt=745.141;
		boolean result= service.validateRechargeAmt(amt);
		Assert.assertEquals(false,result);
	}
	
	

}
